package org.wcci.reviewssite;

import static org.mockito.Mockito.verify;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

public class ReviewRepositoryTest {
	@Mock
	Model model;
	@Mock
	ReviewStorage mockReviewStorage;
	@Mock
	CategoryStorage mockCategoryStorage;

	@InjectMocks
	HomeController underTest;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void shouldBeAbleToAddCategory() {
		Category underTestCategory = new Category("test category");
		mockCategoryStorage.addCategory(underTestCategory);
		verify(mockCategoryStorage).addCategory(underTestCategory);
	}

	@Test
	public void shouldBeAbleToAddReview() throws Exception {
		String underTestReviewTitle = "Test Review Title";
		String underTestBookTitle = "Test Book Title";
		String underTestUserName = "Test Author";
		String underTestReviewBody = "Great read.";
		Category underTestCategory = new Category("test category");
		mockCategoryStorage.addCategory(underTestCategory);
		Review underTestReview = new Review(underTestReviewTitle, underTestBookTitle, underTestUserName,
				underTestCategory, underTestReviewBody);
		mockReviewStorage.addReview(underTestReview);
		verify(mockReviewStorage).addReview(underTestReview);
	}

}
