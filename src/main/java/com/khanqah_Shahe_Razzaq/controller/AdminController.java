package com.khanqah_Shahe_Razzaq.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.khanqah_Shahe_Razzaq.entities.Doc;
import com.khanqah_Shahe_Razzaq.entities.Feedback;
import com.khanqah_Shahe_Razzaq.entities.Notifications;
import com.khanqah_Shahe_Razzaq.repository.NotificationRepository;
import com.khanqah_Shahe_Razzaq.service.DocService;
import com.khanqah_Shahe_Razzaq.service.FeedbackService;

@Controller
public class AdminController {
	
	    @Autowired
	    private NotificationRepository notificationRepository;

		@Autowired
		private DocService docService;
		
		@Autowired
		private FeedbackService feedbackService;
		
	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	  @PostMapping("/addNotification")
	  public String addNotification(@RequestParam String message,ModelMap model) {
	  Notifications notification = new Notifications(message);
	  notificationRepository.save(notification);
	  model.addAttribute("notifications", notificationRepository.findAll());
	  return "notification";
	 }
	  
	  @PostMapping("uploadFiles")
		public String uploadMultipleFiles(@RequestParam("files") MultipartFile[] files,ModelMap model) {
			for (MultipartFile file: files) {
				docService.saveFile(file);
				
			}
			model.addAttribute("docs", docService.getAllFiles());
			return "docs";
		}
	  
	    @GetMapping("/admin")
		public String get(Model model) {
			List<Doc> docs = docService.getAllFiles();
			model.addAttribute("docs", docs);
			return "admin";
		}
	    
	    @GetMapping("/delete/{fileId}")
	    public String deleteBook(@PathVariable Integer fileId,ModelMap model) {
	    	docService.deleteLeadById(fileId);
	    	model.addAttribute("docs", docService.getAllFiles());
	    	return "admin";
	    }
	    
	    @GetMapping("/deleteNotification")
	    public String gets(Model model) {
	        model.addAttribute("notifications", notificationRepository.findAll());
	        return "admin";
	    }
	    
	    @GetMapping("/deleteNotification/{id}")
	    public String deleteNotification(@PathVariable Long id, ModelMap model) {
	        Optional<Notifications> notification = notificationRepository.findById(id);

	        if (notification.isPresent()) {
	            notificationRepository.deleteById(id);
	            model.addAttribute("notifications", notificationRepository.findAll());
	            model.addAttribute("deleteMessage", "Notification with ID " + id + " has been deleted.");
	            return "admin";
	        } else {
	            model.addAttribute("errorMessage", "Notification with ID " + id + " not found.");
	        }

	        return "admin";
	    }
	    
	    @GetMapping("/feedbackSee")
	    public String getsAlldfeedback(Model model) {
	        model.addAttribute("feed", feedbackService.allFeedbacks());
	        return "admin";
	    }
	    
	    @GetMapping("/deleteFeedback/{id}")
	    public String deleteFeedBack(@PathVariable Long id, ModelMap model) {
	        Optional<Feedback> feedBack = feedbackService.findFeedBack(id);

	        if (feedBack.isPresent()) {
	        	feedbackService.deleteFeedback(id);;
	        	 model.addAttribute("feed", feedbackService.allFeedbacks());
	            model.addAttribute("deleteMessage", "Feedback with ID " + id + " has been deleted.");
	            return "admin";
	        } else {
	            model.addAttribute("errorMessage", "Feedback with ID " + id + " not found.");
	        }

	        return "admin";
	    }

}
