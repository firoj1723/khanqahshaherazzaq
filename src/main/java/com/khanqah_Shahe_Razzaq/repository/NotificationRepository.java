package com.khanqah_Shahe_Razzaq.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.khanqah_Shahe_Razzaq.entities.Notifications;




@Repository
public interface NotificationRepository extends CrudRepository<Notifications, Long> {
	 List<Notifications> findByCreatedAtAfter(Date timestamp);
}
