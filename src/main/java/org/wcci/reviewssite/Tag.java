package org.wcci.reviewssite;

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
