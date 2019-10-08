package org.wcci.reviewssite;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Review {
	@Id
	@GeneratedValue
	private Long id;
	
	private String reviewTitle;
	private String productInfo;
	private String userName;
	private LocalDate reviewDate = LocalDate.now();
	@ManyToOne
	private Category category;
	@ManyToMany
	private List<Tag> tags;
	private String reviewBody;

	public Review(String reviewTitle, String productInfo, String userName, 
			Category category, String reviewBody) {
		this.reviewTitle = reviewTitle;
		this.productInfo = productInfo;
		this.userName = userName;
		this.category = category;
		this.reviewBody = reviewBody;
	}
	
	public void addTagToReview(Tag tagToAdd) {
		tags.add(tagToAdd);
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((productInfo == null) ? 0 : productInfo.hashCode());
		result = prime * result + ((reviewBody == null) ? 0 : reviewBody.hashCode());
		result = prime * result + ((reviewDate == null) ? 0 : reviewDate.hashCode());
		result = prime * result + ((reviewTitle == null) ? 0 : reviewTitle.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (productInfo == null) {
			if (other.productInfo != null)
				return false;
		} else if (!productInfo.equals(other.productInfo))
			return false;
		if (reviewBody == null) {
			if (other.reviewBody != null)
				return false;
		} else if (!reviewBody.equals(other.reviewBody))
			return false;
		if (reviewDate == null) {
			if (other.reviewDate != null)
				return false;
		} else if (!reviewDate.equals(other.reviewDate))
			return false;
		if (reviewTitle == null) {
			if (other.reviewTitle != null)
				return false;
		} else if (!reviewTitle.equals(other.reviewTitle))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Review [reviewTitle=" + reviewTitle + ", productInfo=" + productInfo + ", userName=" + userName
				+ ", reviewDate=" + reviewDate + ", productCategory=" + category + ", reviewBody=" + reviewBody
				+ "]";
	}

	
	public LocalDate getReviewDate( ) {
		return reviewDate;
		
	}
	
	public String getReviewBody() {
		return reviewBody;
	}
	
	public Review() {}
}
