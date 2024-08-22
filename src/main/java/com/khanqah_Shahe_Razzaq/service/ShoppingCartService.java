package com.khanqah_Shahe_Razzaq.service;

import java.util.Set;

import com.khanqah_Shahe_Razzaq.entities.Book;
import com.khanqah_Shahe_Razzaq.entities.Customer;
import com.khanqah_Shahe_Razzaq.entities.ShoppingCart;



public interface ShoppingCartService {

	public Set<ShoppingCart> getAllItems(Customer customer);
		
	public String addItem(Customer customer, Book book);

	public String increaseItem(Customer customer, Book book, int count);
	
	public String removeItem(Customer customer, Book book);

	String decreaseItem(Customer customer, Book book, int count);

	public Set<ShoppingCart> getByUsername(Customer customer);
	
}
