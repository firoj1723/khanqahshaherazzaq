package com.khanqah_Shahe_Razzaq.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cources {
	
	@Id
	private String id;
	

	private String title;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Cources(String id, String title) {
		super();
		this.id = id;
		this.title = title;
	}


	public Cources() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * @OneToMany(mappedBy = "cources") private List<Video> list=new ArrayList<>();
	 */

}
