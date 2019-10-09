package org.wcci.reviewssite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewStorage {
	@Autowired
	ReviewRepository reviewRepo;
	
	//may need an author here in the future
	

	public void addReview(Review reviewToAdd) {
		reviewRepo.save(reviewToAdd);
	}

	public Review findReview(Long id) {
		return reviewRepo.findById(id).get();
	}

	public Iterable<Review> findAllTheReviews() {
		return reviewRepo.findAll();
	}
	
	

	
	

}
