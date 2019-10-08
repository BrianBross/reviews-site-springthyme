package org.wcci.reviewssite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Category {

	@Id
	@GeneratedValue
	private Long id;
	
	private String categoryName;
	@OneToMany (mappedBy = "category")
	private List<Review> reviews;

	public Category() {
	}
	
	public Category(String nameOfCategory) {
		this.categoryName = nameOfCategory;
	}
}
