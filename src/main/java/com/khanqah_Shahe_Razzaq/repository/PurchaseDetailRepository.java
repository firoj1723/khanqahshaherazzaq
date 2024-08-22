package com.khanqah_Shahe_Razzaq.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.khanqah_Shahe_Razzaq.entities.PurchaseDetail;
import com.khanqah_Shahe_Razzaq.entities.PurchaseDetailId;
import com.khanqah_Shahe_Razzaq.entities.PurchaseHistory;


@Repository
public interface PurchaseDetailRepository extends JpaRepository<PurchaseDetail, PurchaseDetailId> {

	
	@Query("from PurchaseDetail where purchaseHistory = ?1")
	Set<PurchaseDetail> findAllByHistory(PurchaseHistory purchaseHistory);

}
