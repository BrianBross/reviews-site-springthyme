package org.wcci.reviewssite;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewStorage {
	@Autowired
	ReviewRepository reviewRepo;

	public void addReview(Review reviewToAdd) {
		reviewRepo.save(reviewToAdd);
	}

	public Review findReview(Long id) {
		return reviewRepo.findById(id).get();
	}

	public void addLike(Review reviewToLike) {
		reviewToLike.setLikes();
		reviewRepo.save(reviewToLike);
	}

	public Iterable<Review> findAllTheReviews() {
		return reviewRepo.findAllByOrderByIdDesc();
	}

	public Iterable<Review> performReviewTitleSearch(String searchData) {

		System.out.println("We are in the storage method now.");
		
		List<Review> returnedReviews = (List<Review>) reviewRepo.findByReviewTitleContains(searchData);

		for (Review review : returnedReviews) {
			System.out.println("Storage: " + review.getReviewTitle());
		}

		return reviewRepo.findByReviewTitleContains(searchData);
	}

}
