package com.khanqah_Shahe_Razzaq.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khanqah_Shahe_Razzaq.entities.Feedback;
import com.khanqah_Shahe_Razzaq.repository.FeedbackRepository;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	private FeedbackRepository feedbackRepo;

	@Override
	public void saveFeedback(Feedback feedback) {
		feedbackRepo.save(feedback);
		
	}

	@Override
	public List<Feedback> allFeedbacks() {
		List<Feedback> findAll = feedbackRepo.findAll();
		return findAll;
	}

	@Override
	public Optional<Feedback> findFeedBack(Long id) {
		Optional<Feedback> findById = feedbackRepo.findById(id);
		
		return findById;
	}

	@Override
	public void deleteFeedback(Long id) {
		feedbackRepo.deleteById(id);
		
	}
	
	

}
