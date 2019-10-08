package org.wcci.reviewssite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
@Entity
public class Category {

	private String categoryName;
	@OneToMany (mappedBy = "category")
	private List<Review> reviews;

	public Category() {
	}
	
	public Category(String nameOfCategory) {
		this.categoryName = nameOfCategory;
	}
}
