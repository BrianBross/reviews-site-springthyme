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
		
		public Tag(String nameOfTag, List nameOfReview) {
			this.tagName = nameOfTag;
			this.reviews = nameOfReview;
		}

}
