package org.wcci.reviewssite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewPopulator implements CommandLineRunner {
	@Autowired
	private ReviewStorage reviewStorage;
	@Autowired
	private CategoryStorage categoryStorage;

	@Override
	public void run(String... args) throws Exception {
		
		Category category = new Category("Horror");
		Category category2 = new Category("Comedy");
		categoryStorage.addCategory(category);
		categoryStorage.addCategory(category2);
		
		Review review = new Review("Second Review", "The Birds", "Jimmy Roe", category,
				"Scared me so much!");
		Review review1 = new Review("Third Review", "Beer in Hell", "Tucker Max", category2,
				"Reee-diculous!!!");

		reviewStorage.addReview(review);
		reviewStorage.addReview(review1);
	}
}
