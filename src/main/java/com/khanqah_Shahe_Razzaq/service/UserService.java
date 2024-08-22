package com.khanqah_Shahe_Razzaq.service;

import java.util.List;

import com.khanqah_Shahe_Razzaq.entities.User;



public interface UserService {

	public List<User> getAllUsers();
	
	public User getUserByUsername(String username);
}
