package com.khanqah_Shahe_Razzaq.service;

import java.util.List;
import java.util.Optional;

import com.khanqah_Shahe_Razzaq.entities.Feedback;

public interface FeedbackService {
	
	public void saveFeedback(Feedback feedback);
	
	public List<Feedback> allFeedbacks();
	
	public Optional<Feedback> findFeedBack(Long id);
	
	public void deleteFeedback(Long id);

}
