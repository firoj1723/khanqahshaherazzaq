package com.khanqah_Shahe_Razzaq.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.khanqah_Shahe_Razzaq.entities.Notifications;
import com.khanqah_Shahe_Razzaq.repository.NotificationRepository;



@RestController
public class NotificationRestController {

	 @Autowired
	    private NotificationRepository notificationRepository;

	    @GetMapping("/get-new-notifications")
	    public List<Notifications> getNewNotifications(@RequestParam("timestamp") Long timestamp) {
	        Date timestampDate = new Date(timestamp);
	        List<Notifications> newNotifications = notificationRepository.findByCreatedAtAfter(timestampDate);
	        return newNotifications;
	    }
}
