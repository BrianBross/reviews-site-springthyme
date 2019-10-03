package org.wcci.reviewssite;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Date;

import org.junit.Test;

public class StaticPrototypeTest {

	@Test
	public void canCreateReview() throws Exception {
		String underTestReviewTitle = "Test Review Title";
		String underTestProductInfo = "Test Product Title";
		String underTestUserName = "Test Author";
		LocalDate underTestReviewDate = LocalDate.now();
		String underTestProductCategory = "Test Category";
		String underTestReviewBody = "This book was so good it made me wanna slap my momma.";
		Review underTest = new Review(underTestReviewTitle, underTestProductInfo, underTestUserName,
				underTestReviewDate, underTestProductCategory, underTestReviewBody);

		assertThat(underTest.getReviewTitle(), is(underTestReviewTitle));
	}

}
