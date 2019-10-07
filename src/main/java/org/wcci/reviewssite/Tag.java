package org.wcci.reviewssite;

import javax.persistence.Entity;

@Entity
public class Tag {
	

		private String tagName;
		private Review review;

		public Tag() {
		}
		
		public Tag(String nameOfTag, Review nameOfReview) {
			this.tagName = nameOfTag;
			this.review = nameOfReview;
		}

}
