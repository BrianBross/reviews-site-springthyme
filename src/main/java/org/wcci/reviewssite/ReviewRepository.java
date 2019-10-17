package org.wcci.reviewssite;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {
	public Iterable<Review> findAllByOrderByIdDesc();
	public Iterable<Review> findByReviewTitleContainsIgnoreCaseOrderByIdDesc(String searchData);
	public Iterable<Review> findByBookTitleContainsIgnoreCaseOrderByIdDesc(String searchData);
	public Iterable<Review> findByUserNameContainsIgnoreCaseOrderByIdDesc(String searchData);
	public Iterable<Review> findByReviewBodyContainsIgnoreCaseOrderByIdDesc(String searchData);
//	public Iterable<Review> findByReviewCategoryNameContainsIgnoreCase(String searchData);
//	public Iterable<Review> findByReviewBodyContainsIgnoreCase(String searchData);
}
