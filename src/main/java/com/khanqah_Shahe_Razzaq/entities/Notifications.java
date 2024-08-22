package com.khanqah_Shahe_Razzaq.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notifications {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
 private String message;
 
 @Column(name = "created_at", columnDefinition = "TIMESTAMP")
 private Date createdAt;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
 

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Notifications() {
	
}

public Notifications(String message) {
    this.message = message;
}

public Date getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}

public Notifications(String message, Date createdAt) {
	
	this.message = message;
	this.createdAt = createdAt;
}

}

