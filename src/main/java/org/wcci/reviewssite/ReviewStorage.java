package org.wcci.reviewssite;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;

public class ReviewStorage {
	
	ArrayList<String> categoryListFiction = new ArrayList<String>();
	ArrayList<String> categoryListNonFiction = new ArrayList<String>();
	
	HashMap<String, Review> reviewList;
	

	public ReviewStorage() {
		reviewList = new HashMap<>();
		createCategoryLists();
	}

	public void addReview(Review reviewToAdd) {
		reviewList.put(reviewToAdd.getReviewTitle(), reviewToAdd);

	}

	public Collection<Review> retrieveReviewList() {
		return reviewList.values();
	}

	public Review findReview(String reviewTitle) {
		return reviewList.get(reviewTitle);
	}

	public ArrayList getCategoryListFiction() {
		return categoryListFiction;
	}
	
	public ArrayList getCategoryListNonFiction() {
		return categoryListNonFiction;
	}
	
	private void createCategoryLists() {
		categoryListFiction.add("Science Fiction");
		categoryListFiction.add("Mystery & Suspense");
		categoryListFiction.add("Romance");
		categoryListFiction.add("Horror");
		categoryListFiction.add("Fantasy");
		categoryListFiction.add("Action & Adventure");
		categoryListFiction.add("Humor");	
		
		categoryListNonFiction.add("Health & Wellness");
		categoryListNonFiction.add("Education");
		categoryListNonFiction.add("Biography");
		categoryListNonFiction.add("History");
		categoryListNonFiction.add("Computer");
		categoryListNonFiction.add("Religion");
		categoryListNonFiction.add("Art & Music");		
	}

}
