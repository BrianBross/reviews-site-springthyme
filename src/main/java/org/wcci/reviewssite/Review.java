package org.wcci.reviewssite;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Review {
	@Id
	@GeneratedValue
	private Long id;
	private String reviewTitle;
	private String productInfo;
	private String userName;
	private LocalDate reviewDate;
	private String productCategory;
	private String reviewBody;

	public Review(String reviewTitle, String productInfo, String userName, LocalDate reviewDate, String productCategory,
			String reviewBody) {
		this.reviewTitle = reviewTitle;
		this.productInfo = productInfo;
		this.userName = userName;
		this.reviewDate = reviewDate;
		this.productCategory = productCategory;
		this.reviewBody = reviewBody;
	}

	public String getReviewTitle() {
		return reviewTitle;
		
	}
	public String getProductInfo() {
		return productInfo;
	}
	
	public String getUserName() {
		return  userName;
	}
	

	@Override
	public String toString() {
		return reviewTitle;
	}

	public String getCategory() {
		return productCategory;
	}
	
	public LocalDate getReviewDate( ) {
		return reviewDate;
		
	}
	
	public String getReviewBody() {
		return reviewBody;
	}
	
	public Review() {}
}
