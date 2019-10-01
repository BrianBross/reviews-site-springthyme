package org.wcci.reviewssite;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Date;

import org.hamcrest.Matcher;
import org.junit.Test;

public class ReviewRepositoryTest {
	@Test
	public void shouldBeAbleToAddReview() throws Exception {
		ReviewRepository underTest = new ReviewRepository();
		String underTestReviewTitle = "Test Review Title";
		String underTestProductInfo = "Test Product Title";
		String underTestUserName = "Test Author";
		Date underTestReviewDate = new Date();
		String underTestProductCategory = "Test Category";
		String underTestReviewBody = "This book was so good it made me wanna slap my momma.";
		Review underTestReview = new Review(underTestReviewTitle, underTestProductInfo, underTestUserName,
				underTestReviewDate, underTestProductCategory, underTestReviewBody);
		underTest.addReview(underTestReview);
		assertThat(underTest.reviewList.size(), is(1));
	}

	@Test
	public void shouldBeAbleToAddMulitpleReviews() throws Exception {
		ReviewRepository underTest = new ReviewRepository();
		String underTestReviewTitle = "Test Review Title";
		String underTestProductInfo = "Test Product Title";
		String underTestUserName = "Test Author";
		Date underTestReviewDate = new Date();
		String underTestProductCategory = "Test Category";
		String underTestReviewBody = "This book was so good it made me wanna slap my momma.";
		Review underTestReview = new Review(underTestReviewTitle, underTestProductInfo, underTestUserName,
				underTestReviewDate, underTestProductCategory, underTestReviewBody);
		underTest.addReview(underTestReview);
		String underTestReviewTitle2 = "Test Review Title 2";
		Review underTestReview2 = new Review(underTestReviewTitle2, underTestProductInfo, underTestUserName,
				underTestReviewDate, underTestProductCategory, underTestReviewBody);
		underTest.addReview(underTestReview2);
		Collection<Review> addedReviews = underTest.retrieveReviewList();
		assertThat(addedReviews, containsInAnyOrder(underTestReview, underTestReview2));
	}
	
	@Test
	public void shouldBeAbleToFindOneReview() throws Exception {
		ReviewRepository underTest = new ReviewRepository();
		String underTestReviewTitle = "Test Review Title";
		String underTestProductInfo = "Test Product Title";
		String underTestUserName = "Test Author";
		Date underTestReviewDate = new Date();
		String underTestProductCategory = "Test Category";
		String underTestReviewBody = "This book was so good it made me wanna slap my momma.";
		Review underTestReview = new Review(underTestReviewTitle, underTestProductInfo, underTestUserName,
				underTestReviewDate, underTestProductCategory, underTestReviewBody);
		underTest.addReview(underTestReview);
		String underTestReviewTitle2 = "Test Review Title 2";
		Review underTestReview2 = new Review(underTestReviewTitle2, underTestProductInfo, underTestUserName,
				underTestReviewDate, underTestProductCategory, underTestReviewBody);
		underTest.addReview(underTestReview2);
		
		Review expectedReview = underTest.findReview(underTestReviewTitle);
		assertThat(expectedReview, is(underTestReview));
	}



}
