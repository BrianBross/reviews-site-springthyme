package org.wcci.reviewssite;

import java.util.ArrayList;

public class Category {
	ArrayList<String> categoryListFiction = new ArrayList<String>();
	ArrayList<String> categoryListNonFiction = new ArrayList<String>();

	public Category() {
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

	public ArrayList getCategoryListFiction() {
		return categoryListFiction;
	}

	public ArrayList getCategoryListNonFiction() {
		return categoryListNonFiction;
	}
}
