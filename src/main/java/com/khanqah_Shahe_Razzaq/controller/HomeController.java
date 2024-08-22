package com.khanqah_Shahe_Razzaq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		
		return"Home";
	}

	/*
	 * @RequestMapping("/insta") public String insta() { return }
	 */
	
	@RequestMapping("/about")
	public String aboutUs() {
		
		return"about";
	}
	
	@RequestMapping("/contact")
	public String contactUs() {
		
		return"contact";
	}
	
	@RequestMapping("/review")
	public String review() {
		
		return"review";
	}
}
