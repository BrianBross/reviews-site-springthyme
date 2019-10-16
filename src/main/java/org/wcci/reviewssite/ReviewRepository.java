package org.wcci.reviewssite;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {
	public Iterable<Review> findAllByOrderByIdDesc();
	public Iterable<Review> findByReviewTitleContainsIgnoreCase(String searchData);
	public Iterable<Review> findByBookTitleContainsIgnoreCase(String searchData);
	public Iterable<Review> findByUserNameContainsIgnoreCase(String searchData);
	public Iterable<Review> findByReviewBodyContainsIgnoreCase(String searchData);
}
