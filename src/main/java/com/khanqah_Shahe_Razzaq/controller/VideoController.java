package com.khanqah_Shahe_Razzaq.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.khanqah_Shahe_Razzaq.entities.Video;
import com.khanqah_Shahe_Razzaq.exception.CustomeMessage;
import com.khanqah_Shahe_Razzaq.service.VideoService;

@RestController
@RequestMapping("/api/v1/videos")
public class VideoController {
	
	@Autowired
	private VideoService videoservice;
	
	public VideoController(VideoService videoservice) {
		this.videoservice=videoservice;
	}
	
	@PostMapping
	public ResponseEntity<CustomeMessage> create(@RequestParam("file") MultipartFile file,
			@RequestParam("title") String title,
			@RequestParam("descripition") String descripition){
		
		Video video = new Video();
		video.setTitle(title);
		video.setDescripition(descripition);
		video.setVideoId(UUID.randomUUID().toString());
		videoservice.save(video, file);
		
		return null;
	}

}
