package com.khanqah_Shahe_Razzaq.service;

import java.util.Set;

import com.khanqah_Shahe_Razzaq.entities.Customer;
import com.khanqah_Shahe_Razzaq.entities.PurchaseDetail;
import com.khanqah_Shahe_Razzaq.entities.PurchaseHistory;


public interface PaymentService {

	String createTransaction(Customer customer);
	
	Set<PurchaseHistory> getPurchaseHistories(Customer customer);
	
	Set<PurchaseDetail> getPurchaseDetails(PurchaseHistory purchaseHistory);

	PurchaseHistory getPurchaseHistory(Customer customer, String transId);
}