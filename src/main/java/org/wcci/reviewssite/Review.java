package org.wcci.reviewssite;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

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
	private Category category;
	private List<Tag> tags;
	private String reviewBody;

	public Review(String reviewTitle, String productInfo, String userName, 
			LocalDate reviewDate, Category category, List tags,
			String reviewBody) {
		this.reviewTitle = reviewTitle;
		this.productInfo = productInfo;
		this.userName = userName;
		this.reviewDate = reviewDate;
		this.category = category;
		this.tags = tags;
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

	
	public LocalDate getReviewDate( ) {
		return reviewDate;
		
	}
	
	public String getReviewBody() {
		return reviewBody;
	}
	
	public Review() {}
}
