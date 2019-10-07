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
		return this.reviewTitle;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productCategory == null) ? 0 : productCategory.hashCode());
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
		if (productCategory == null) {
			if (other.productCategory != null)
				return false;
		} else if (!productCategory.equals(other.productCategory))
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
				+ ", reviewDate=" + reviewDate + ", productCategory=" + productCategory + ", reviewBody=" + reviewBody
				+ "]";
	}

	public String getCategory() {
		return productCategory;
	}
	
	public Review() {}
}
