package org.wcci.reviewssite;

import java.util.Date;

public class Review {
	private String reviewTitle;
	private String productInfo;
	private String userName;
	private Date reviewDate;
	private String productCategory;
	private String reviewBody;

	public Review(String reviewTitle, String productInfo, String userName, Date reviewDate, String productCategory,
			String reviewBody) {
		this.reviewTitle = reviewTitle;
		this.productInfo = productInfo;
		this.userName = userName;
		this.reviewDate = reviewDate;
		this.productCategory = productCategory;
		this.reviewBody = reviewBody;
	}

	public String getReviewTitle() {
		return this.reviewTitle;
	}

	@Override
	public String toString() {
		return reviewTitle;
	}

	public String getCategory() {
		return productCategory;
	}
}
