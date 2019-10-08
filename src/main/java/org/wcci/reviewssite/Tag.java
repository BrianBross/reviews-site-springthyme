package org.wcci.reviewssite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;


@Entity
public class Tag {
	

		private String tagName;
		@ManyToMany
		private List<Review> reviews;
		
		public Tag() {
		}
		
		public Tag(String nameOfTag) {
			this.tagName = nameOfTag;
		}
		
		public void addReviewToTag(Review reviewToAdd) {
			reviews.add(reviewToAdd);
		}

}
