package org.wcci.reviewssite;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {
	@Autowired
	private ReviewStorage reviewStorage;
	@Autowired
	private CategoryStorage categoryStorage;

	@Override
	public void run(String... args) throws Exception {
		
		populateCategories();
		
		Category category = new Category("Horror");
		Category category2 = new Category("Comedy");
		categoryStorage.addCategory(category);
		categoryStorage.addCategory(category2);
		
		Review review = new Review("Second Review", "The Birds", "Jimmy Roe", category,
				"Scared me so much!");
		Review review1 = new Review("Third Review", "I Hope They Serve Beer in Hell", "Tucker Max", category2,
				"Reee-diculous!!!");

		reviewStorage.addReview(review);
		reviewStorage.addReview(review1);
		

	}
	
	public void populateCategories() {
		categoryStorage.addCategory(new Category("Science Fiction"));
		categoryStorage.addCategory(new Category("Mystery & Suspense"));
		categoryStorage.addCategory(new Category("Romance"));
		categoryStorage.addCategory(new Category("Horror"));
		categoryStorage.addCategory(new Category("Fantasy"));
		categoryStorage.addCategory(new Category("Action & Adventure"));
		categoryStorage.addCategory(new Category("Humor"));
		categoryStorage.addCategory(new Category("Comedy"));
	}

	
	public void test() {

		ArrayList<String> categoryListNonFiction = new ArrayList<String>();
		
		categoryListNonFiction.add("Health & Wellness");
		categoryListNonFiction.add("Education");
		categoryListNonFiction.add("Biography");
		categoryListNonFiction.add("History");
		categoryListNonFiction.add("Computer");
		categoryListNonFiction.add("Religion");
		categoryListNonFiction.add("Art & Music");
	}
}
