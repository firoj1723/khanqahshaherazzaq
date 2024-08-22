package com.khanqah_Shahe_Razzaq.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column( length=40, nullable = false)
	private String name;
	
	@Column(name="email", length=80, nullable = false, unique = true)
	private String email;
	
	@Column(name="mobile", length=40, nullable = false, unique = true)
	private String mobile;
	
	@Column(name="city", length=40)
	private String city;
	
	private String gender;
	
	@Column(name="feedback", length=80)
	private String feed;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFeed() {
		return feed;
	}

	public void setFeed(String feed) {
		this.feed = feed;
	}
	
	
	

	

	/*
	 * public Feedback(String name, String email, String mobile, String city, String
	 * gender, String feedback) {
	 * 
	 * this.name = name; this.email = email; this.mobile = mobile; this.city = city;
	 * this.gender = gender; this.feedback = feedback; }
	 * 
	 * public Feedback() { super();
	 * 
	 * }
	 */
	
	
}
