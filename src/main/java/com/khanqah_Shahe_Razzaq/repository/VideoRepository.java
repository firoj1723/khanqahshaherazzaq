package com.khanqah_Shahe_Razzaq.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khanqah_Shahe_Razzaq.entities.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video, String> {

	Optional<Video> findByTitle(String title );
}
