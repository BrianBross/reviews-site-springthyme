package org.wcci.reviewssite;



public class Category {

	private String categoryName;
	private Review review;

	public Category() {
	}
	
	public Category(String nameOfCategory, Review nameOfReview) {
		this.categoryName = nameOfCategory;
		this.review = nameOfReview;
	}
}
