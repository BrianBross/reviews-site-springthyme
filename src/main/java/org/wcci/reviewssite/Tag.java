package org.wcci.reviewssite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@Id
	@GeneratedValue
	private Long id;

	private String tagName;

	@ManyToMany
	private List<Review> reviews;

	public Tag() {
	}

	public Tag(String nameOfTag) {
		this.tagName = nameOfTag;
	}

	public void addReviewToTag(Review reviewToAdd) {
		reviews.add(reviewToAdd);
	}

	public Long getId() {
		return id;
	}

	public String getTagName() {
		return tagName;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	@Override
	public String toString() {
		return "Tag [id=" + id + ", tagName=" + tagName + ", reviews=" + reviews + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((reviews == null) ? 0 : reviews.hashCode());
		result = prime * result + ((tagName == null) ? 0 : tagName.hashCode());
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
		Tag other = (Tag) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (reviews == null) {
			if (other.reviews != null)
				return false;
		} else if (!reviews.equals(other.reviews))
			return false;
		if (tagName == null) {
			if (other.tagName != null)
				return false;
		} else if (!tagName.equals(other.tagName))
			return false;
		return true;
	}

}
