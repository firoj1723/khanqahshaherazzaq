package com.khanqah_Shahe_Razzaq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.khanqah_Shahe_Razzaq.entities.Feedback;
import com.khanqah_Shahe_Razzaq.service.FeedbackService;

@Controller
public class FeedBackController {
	
	@Autowired
	private FeedbackService feedbackService;

	@PostMapping("/feedbackSave")
	public String saveFeedback(Feedback feed,ModelMap map) {
		feedbackService.saveFeedback(feed);
		map.addAttribute("feed", "Your feedback is save :)");
		return "review";
	}
}
