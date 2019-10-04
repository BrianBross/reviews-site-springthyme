package org.wcci.reviewssite;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;

public class ReviewStorage {
	
	HashMap<String, Review> reviewList;
	

	public ReviewStorage() {
		reviewList = new HashMap<>();
	}

	public void addReview(Review reviewToAdd) {
		reviewList.put(reviewToAdd.getReviewTitle(), reviewToAdd);

	}

	public Collection<Review> retrieveReviewList() {
		return reviewList.values();
	}

	public Review findReview(String reviewTitle) {
		return reviewList.get(reviewTitle);
	}

	
	

}
