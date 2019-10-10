package org.wcci.reviewssite;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import org.hamcrest.Matcher;
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
		
		Collection allCategories = (Collection) mockCategoryStorage.findAllTheCategories();
		assertThat(allCategories.size(), is(1));
	}
	
//	@Test
//	public void shouldBeAbleToAddReview() throws Exception {
//		String underTestReviewTitle = "Test Review Title";
//		String underTestBookTitle = "Test Book Title";
//		String underTestUserName = "Test Author";
//		String underTestReviewBody = "Great read.";
//		
//		Review underTestReview = new Review(underTestReviewTitle, underTestBookTitle, underTestUserName,
//				underTestProductCategory, underTestReviewBody);
//		mockReviewStorage.addReview(underTestReview);
//		
//		Collection allReviews = (Collection) mockReviewStorage.findAllTheReviews();
//		
//		assertThat(allReviews.size(), is(1));
//		
//	}

//	@Test
//	public void shouldBeAbleToAddMulitpleReviews() throws Exception {
//		ReviewStorage underTest = new ReviewStorage();
//		String underTestReviewTitle = "Test Review Title";
//		String underTestProductInfo = "Test Product Title";
//		String underTestUserName = "Test Author";
//		LocalDate underTestReviewDate = LocalDate.now();
//		Category underTestProductCategory = new Category("Test Category");
//		String underTestReviewBody = "This book was so good it made me wanna slap my momma.";
//		Review underTestReview = new Review(underTestReviewTitle, underTestProductInfo, underTestUserName,
//				underTestProductCategory, underTestReviewBody);
//		underTest.addReview(underTestReview);
//		String underTestReviewTitle2 = "Test Review Title 2";
//		Review underTestReview2 = new Review(underTestReviewTitle2, underTestProductInfo, underTestUserName,
//				underTestProductCategory, underTestReviewBody);
//		underTest.addReview(underTestReview2);
//		Collection<Review> addedReviews = underTest.retrieveReviewList();
//		assertThat(addedReviews, containsInAnyOrder(underTestReview, underTestReview2));
//	}

//	@Test
//	public void shouldBeAbleToFindOneReview() throws Exception {
//		ReviewStorage underTest = new ReviewStorage();
//		String underTestReviewTitle = "Test Review Title";
//		String underTestProductInfo = "Test Product Title";
//		String underTestUserName = "Test Author";
//		LocalDate underTestReviewDate = LocalDate.now();
//		String underTestProductCategory = "Test Category";
//		String underTestReviewBody = "This book was so good it made me wanna slap my momma.";
//		Review underTestReview = new Review(underTestReviewTitle, underTestProductInfo, underTestUserName,
//				underTestReviewDate, underTestProductCategory, underTestReviewBody);
//		underTest.addReview(underTestReview);
//		String underTestReviewTitle2 = "Test Review Title 2";
//		Review underTestReview2 = new Review(underTestReviewTitle2, underTestProductInfo, underTestUserName,
//				underTestReviewDate, underTestProductCategory, underTestReviewBody);
//		underTest.addReview(underTestReview2);
//
//		Review expectedReview = underTest.findReview(underTestReviewTitle);
//		assertThat(expectedReview, is(underTestReview));
//	}

//	@Test
//	public void storageShouldHaveDefaultListsofCategories() {
//		ReviewStorage underTest = new ReviewStorage();
//		ArrayList categoryListFiction = underTest.getCategoryListFiction();
//		ArrayList categoryListNonFiction = underTest.getCategoryListNonFiction();
//		int fictionCategoryListSize = categoryListFiction.size();
//		int NonFictionCategoryListSize = categoryListNonFiction.size();
//		assertEquals(fictionCategoryListSize, 7);
//		assertEquals(NonFictionCategoryListSize, 7);
//	}

//	@Test
//	public void shouldBeAbleToCreateReviewOfDefaultCategory() throws Exception {
//		ReviewStorage underTest = new ReviewStorage();
//		String underTestReviewTitle = "Test Review Title";
//		String underTestProductInfo = "Test Product Title";
//		String underTestUserName = "Test Author";
//		LocalDate underTestReviewDate = LocalDate.now();
//		String underTestProductCategory = underTest.categoryListNonFiction.get(3);
//		String underTestReviewBody = "This book was so good it made me wanna slap my momma.";
//		Review underTestReview = new Review(underTestReviewTitle, underTestProductInfo, underTestUserName,
//				underTestReviewDate, underTestProductCategory, underTestReviewBody);
//		underTest.addReview(underTestReview);
//		assertThat(underTestReview.getCategory(),is(underTestProductCategory) );
//	}

}
