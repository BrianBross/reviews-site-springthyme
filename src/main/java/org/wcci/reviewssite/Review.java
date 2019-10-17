package org.wcci.reviewssite;

import java.time.LocalDate;
import java.util.Arrays;
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
	private String bookTitle;
	private String userName;
	private LocalDate reviewDate = LocalDate.now();
	@ManyToOne
	private Category category;
	@ManyToMany
	private List<Tag> tags;
	private String reviewBody;
	private int likes;

	public Review(String reviewTitle, String bookTitle, String userName, Category category, String reviewBody,
			Tag... tags) {
		this.reviewTitle = reviewTitle;
		this.bookTitle = bookTitle;
		this.userName = userName;
		this.category = category;
		this.reviewBody = reviewBody;
		this.tags = Arrays.asList(tags);
	}

	public Review(String reviewTitle, String bookTitle, String userName, Category category, String reviewBody,
			List<Tag> tags) {
		this.reviewTitle = reviewTitle;
		this.bookTitle = bookTitle;
		this.userName = userName;
		this.category = category;
		this.reviewBody = reviewBody;
		this.tags = tags;
	}

	public void addTagToReview(Tag tagToAdd) {
		tags.add(tagToAdd);
	}

	public Long getId() {
		return id;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getUserName() {
		return userName;
	}

	public Category getCategory() {
		return category;
	}

	public LocalDate getReviewDate() {
		return reviewDate;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public String getReviewBody() {
		return reviewBody;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes() {
		this.likes++;
	}

	public Review() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookTitle == null) ? 0 : bookTitle.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + likes;
		result = prime * result + ((reviewBody == null) ? 0 : reviewBody.hashCode());
		result = prime * result + ((reviewDate == null) ? 0 : reviewDate.hashCode());
		result = prime * result + ((reviewTitle == null) ? 0 : reviewTitle.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
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
		if (bookTitle == null) {
			if (other.bookTitle != null)
				return false;
		} else if (!bookTitle.equals(other.bookTitle))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (likes != other.likes)
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
		if (tags == null) {
			if (other.tags != null)
				return false;
		} else if (!tags.equals(other.tags))
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
		return "Review [id=" + id + ", reviewTitle=" + reviewTitle + ", bookTitle=" + bookTitle + ", userName="
				+ userName + ", reviewDate=" + reviewDate + ", category=" + category + ", tags=" + tags
				+ ", reviewBody=" + reviewBody + ", likes=" + likes + "]";
	}
}
