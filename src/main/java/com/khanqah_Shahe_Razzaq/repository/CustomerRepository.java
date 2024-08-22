package com.khanqah_Shahe_Razzaq.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.khanqah_Shahe_Razzaq.entities.Customer;




@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

	
	@Query("from Customer where lower(email)=:email_id")
	public List<Customer> findByEmail(@Param("email_id") String emailId);
	
	Optional<Customer> findByMobile(Long mobile);
}
