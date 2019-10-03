package org.wcci.reviewssite;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Date;

import org.junit.Test;

public class ReviewTest { 
	
	@Test
	public void canCreateReview() {
		String underTestReviewTitle = "Test Review Title";
		String underTestProductInfo = "Test Product Title";
		String underTestUserName = "Test Author";
		LocalDate underTestReviewDate = LocalDate.now();
		String underTestProductCategory = "Test Category";
		String underTestReviewBody = "This book was so good it made me wanna slap my momma.";
		Review underTestReview = new Review(underTestReviewTitle, underTestProductInfo, underTestUserName,
				underTestReviewDate, underTestProductCategory, underTestReviewBody);
		assertEquals(underTestReview.getReviewTitle(),underTestReviewTitle);
	}
	

}
