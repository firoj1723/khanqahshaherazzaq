package com.khanqah_Shahe_Razzaq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.khanqah_Shahe_Razzaq.entities.Notifications;
import com.khanqah_Shahe_Razzaq.repository.NotificationRepository;


@Controller
public class NotificationController {

	 @Autowired
	    private NotificationRepository notificationRepository;

	    @GetMapping("/noti")
	    public String home(Model model) {
	        model.addAttribute("notifications", notificationRepository.findAll());
	        return "notification";
	    }

		/*
		 * @PostMapping("/add") public String addNotification(@RequestParam String
		 * message) { Notifications notification = new Notifications(message);
		 * notificationRepository.save(notification); return "notification"; }
		 */
}

