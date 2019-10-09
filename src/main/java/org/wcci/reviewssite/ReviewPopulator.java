package org.wcci.reviewssite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewPopulator implements CommandLineRunner {
	@Autowired
	private ReviewRepository reviewRepo;

	@Override
	public void run(String... args) throws Exception {
		Review review = new Review("Second Review", "The Birds", "Jimmy Roe", new Category("Horror"),
				"Scared me so much!");
		Review review1 = new Review("Third Review", "Beer in Hell", "Tucker Max", new Category("Comedy"),
				"Reee-diculous!!!");

		reviewRepo.save(review);
		reviewRepo.save(review1);
	}
}
