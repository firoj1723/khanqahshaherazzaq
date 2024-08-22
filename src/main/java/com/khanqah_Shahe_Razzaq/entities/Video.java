package com.khanqah_Shahe_Razzaq.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Video {
	
	@Id
	private String videoId;

	private String title;
	
	private String descripition;
	
	private String contentType;
	
	private String filePath;
	
	/*
	 * @ManyToOne private Cources cources;
	 */

	/*
	 * public Cources getCources() { return cources; }
	 * 
	 * public void setCources(Cources cources) { this.cources = cources; }
	 */

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescripition() {
		return descripition;
	}

	public void setDescripition(String descripition) {
		this.descripition = descripition;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Video(String videoId, String title, String descripition, String contentType, String filePath) {
		super();
		this.videoId = videoId;
		this.title = title;
		this.descripition = descripition;
		this.contentType = contentType;
		this.filePath = filePath;
		
	}

	public Video() {
		
	}
	
	
}
