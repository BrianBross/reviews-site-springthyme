package org.wcci.reviewssite;

import java.util.List;

import javax.persistence.Entity;
@Entity
public class Category {

	private String categoryName;
	private List<Review> reviews;

	public Category() {
	}
	
	public Category(String nameOfCategory, List reviews) {
		this.categoryName = nameOfCategory;
		this.reviews = reviews;
	}
}
