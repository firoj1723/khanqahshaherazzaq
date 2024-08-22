package com.khanqah_Shahe_Razzaq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khanqah_Shahe_Razzaq.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
