package com.khanqah_Shahe_Razzaq.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.khanqah_Shahe_Razzaq.entities.Customer;
import com.khanqah_Shahe_Razzaq.entities.PurchaseHistory;

@Repository
public interface PurchaseHistoryRepository extends JpaRepository<PurchaseHistory, String> {

	@Query("from PurchaseHistory where customer = ?1")
	Set<PurchaseHistory> findAllByCustomer(Customer customer);

}