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
	
	private String title;
	private String bookTitle;
	private String userName;
	private LocalDate reviewDate = LocalDate.now();
	@ManyToOne
	private Category category;
	@ManyToMany
	private List<Tag> tags;
	private String reviewBody;

	public Review(String reviewTitle, String productInfo, String userName, 
			Category category, String reviewBody) {
		this.title = reviewTitle;
		this.bookTitle = productInfo;
		this.userName = userName;
		this.category = category;
		this.reviewBody = reviewBody;
	}
	
	public void addTagToReview(Tag tagToAdd) {
		tags.add(tagToAdd);
	}

	public String getTitle() {
		return title;
		
	}
	public String getProductInfo() {
		return bookTitle;
	}
	
	public String getUserName() {
		return  userName;
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((bookTitle == null) ? 0 : bookTitle.hashCode());
		result = prime * result + ((reviewBody == null) ? 0 : reviewBody.hashCode());
		result = prime * result + ((reviewDate == null) ? 0 : reviewDate.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		if (bookTitle == null) {
			if (other.bookTitle != null)
				return false;
		} else if (!bookTitle.equals(other.bookTitle))
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
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
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
		return "Review [reviewTitle=" + title + ", productInfo=" + bookTitle + ", userName=" + userName
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

	public Long getId() {
		return id;
	}
}
