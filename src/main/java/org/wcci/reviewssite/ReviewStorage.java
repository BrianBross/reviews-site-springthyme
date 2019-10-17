package org.wcci.reviewssite;

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

	public Iterable<Review> searchByReviewTitle(String searchData) {
		return reviewRepo.findByReviewTitleContainsIgnoreCaseOrderByIdDesc(searchData);
	}
	
	public Iterable<Review> searchByBookTitle(String searchData) {
		return reviewRepo.findByBookTitleContainsIgnoreCaseOrderByIdDesc(searchData);
	}
	
	public Iterable<Review> searchByUserName(String searchData) {
		return reviewRepo.findByUserNameContainsIgnoreCaseOrderByIdDesc(searchData);
	}
	
	public Iterable<Review> searchByReviewBody(String searchData) {
		return reviewRepo.findByReviewBodyContainsIgnoreCaseOrderByIdDesc(searchData);
	}
	
//	public Iterable<Review> searchByCategory(String searchData) {
//		return reviewRepo.findByReviewCategoryNameContainsIgnoreCase(searchData);
//	}

}
