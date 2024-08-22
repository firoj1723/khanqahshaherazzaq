package com.khanqah_Shahe_Razzaq.service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.khanqah_Shahe_Razzaq.entities.Video;

import antlr.StringUtils;

@Service
public class VideoServiceImpl implements VideoService {
	
	@Value("${files.videos}")
	String Dir;

	@Override
	public Video save(Video video, MultipartFile file) {
		try {
		//orignal filename
		String filename= file.getOriginalFilename();
		String contentType= file.getContentType();
		InputStream inputStream = file.getInputStream();
		
		//folder path create
		 String cleanFileName = org.springframework.util.StringUtils.cleanPath(filename);
		 
		 String cleanFolder = org.springframework.util.StringUtils.cleanPath(Dir);
		 
		 Path path = Paths.get(cleanFolder,cleanFileName);
		 
		 System.out.println(path);
		 
		}catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Video get(String videoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Video getByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Video> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
