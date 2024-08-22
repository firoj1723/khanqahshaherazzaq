package com.khanqah_Shahe_Razzaq.service;

import java.util.List;

import com.khanqah_Shahe_Razzaq.entities.ChangePassword;
import com.khanqah_Shahe_Razzaq.entities.Customer;
import com.khanqah_Shahe_Razzaq.entities.CustomerData;


public interface CustomerService {

	public List<Customer> getAllCustomers();
	
	public Customer getCustomer(String username);
		
	public String saveCustomer(Customer theCustomer);
	
	public String updateCustomer(Customer theCustomer);
	
	public String removeCustomer(Customer theCustomer);
	
	public String registerCustomer(CustomerData data);

	public CustomerData getCustomerData(String username);

	public String updateCustomer(CustomerData customerData);
	
	public String updatePassword(ChangePassword changePassword);
	
}
