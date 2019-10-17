package org.wcci.reviewssite;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class StaticPrototypeTest {

	@Test
	public void canCreateReview() throws Exception {
		String underTestReviewTitle = "Test Review Title";
		String underTestProductInfo = "Test Product Title";
		String underTestUserName = "Test Author";
		Category underTestProductCategory = new Category("Test Category");
		String underTestReviewBody = "This book was so good it made me wanna slap my momma.";
		Review underTest = new Review(underTestReviewTitle, underTestProductInfo, underTestUserName,
				underTestProductCategory, underTestReviewBody);
		assertThat(underTest.getReviewTitle(), is(underTestReviewTitle));
	}

}
