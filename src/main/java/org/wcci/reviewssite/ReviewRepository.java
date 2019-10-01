package org.wcci.reviewssite;

import java.util.HashMap;
import java.util.Collection;

public class ReviewRepository {
	HashMap<String, Review> reviewList;

	public ReviewRepository() {
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
