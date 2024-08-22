package com.khanqah_Shahe_Razzaq.service;

import java.util.Set;

import com.khanqah_Shahe_Razzaq.entities.Book;
import com.khanqah_Shahe_Razzaq.entities.Customer;



public interface BookUserService {

	Set<Book> getBooksPurchasedBy(Customer customer);

}
