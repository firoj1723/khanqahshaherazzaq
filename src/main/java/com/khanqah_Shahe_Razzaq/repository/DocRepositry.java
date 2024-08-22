package com.khanqah_Shahe_Razzaq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khanqah_Shahe_Razzaq.entities.Doc;

@Repository
public interface DocRepositry extends JpaRepository<Doc, Integer> {

}
