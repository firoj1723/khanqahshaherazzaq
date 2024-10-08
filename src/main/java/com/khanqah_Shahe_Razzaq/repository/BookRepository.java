package com.khanqah_Shahe_Razzaq.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.khanqah_Shahe_Razzaq.entities.Book;



@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	
	@Query("from Book where lower(name) like :search")
	List<Book> searchBooks(@Param("search") String search);

}
