package org.wcci.reviewssite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	@Autowired
	private CategoryStorage categoryStorage;
	@Autowired
	private ReviewStorage reviewStorage;
	@Autowired
	private TagStorage tagStorage;

	@GetMapping("/")
	public String welcomePage(Model model) {
		return "index";
	}

	@GetMapping("/all_reviews")
	public String getAllReviews(Model model) {
		model.addAttribute("reviews", reviewStorage.findAllTheReviews());
		return "reviews";
	}

	@GetMapping("/add_review")
	public String getAddReview(Model model) {
		model.addAttribute("categories", categoryStorage.findAllTheCategories());
		model.addAttribute("tags", tagStorage.findAllTheTags());
		return "add_review";
	}

	@GetMapping("/reviews/{id}")
	public String singleReview(@PathVariable Long id, Model model) {
		Review review = reviewStorage.findReview(id);
		model.addAttribute("review", review);
		return "review";
	}
	
	

	@GetMapping("/reviews/all_reviews")
	public String navRedirect() {
		return "redirect:/all_reviews";
	}

	@GetMapping("/reviews/add_review")
	public String navRedirect2() {
		return "redirect:/add_review";
	}
	
	@PostMapping("/add")
	public String addReview(String reviewTitle, String bookTitle, String userName, Long categoryId, String reviewBody,
			Long... tagList) {

		Category category = categoryStorage.findCategory(categoryId);

		List<Tag> tags = new ArrayList<Tag>();

		Long reviewId;

		if (tagList != null) {
			for (Long id : tagList) {
				tags.add(tagStorage.findTag(id));
			}
			Review reviewToAdd = new Review(reviewTitle, bookTitle, userName, category, reviewBody, tags);
			reviewStorage.addReview(reviewToAdd);
			reviewId = reviewToAdd.getId();

		} else {
			Review reviewToAdd = new Review(reviewTitle, bookTitle, userName, category, reviewBody);
			reviewStorage.addReview(reviewToAdd);
			reviewId = reviewToAdd.getId();
		}
		return "redirect:/reviews/" + reviewId;
	}

	@PostMapping("/like")
	public String addLike(Long reviewId) {
		Review review = reviewStorage.findReview(reviewId);
		reviewStorage.addLike(review);
		return "redirect:/reviews/" + reviewId;
	}
	
	@PostMapping("/search")
	public String searchAllReviews(String searchData, Model model) {
				
		System.out.println("We are in the beginning of the controller post mapping now.");
				
		List<Review> returnedReviews = (List<Review>) reviewStorage.performReviewTitleSearch(searchData);
		
		for (Review review : returnedReviews) {
			System.out.println("Controller: " + review.getReviewTitle());
		}
		
		model.addAttribute("reviews", reviewStorage.performReviewTitleSearch(searchData));
		
		System.out.println("We are right before the return of the controller post mapping now.");
		
		return "reviews";
	}
	
//	@GetMapping("/reviews/{id}")
//	public String singleReview(@PathVariable Long id, Model model) {
//		Review review = reviewStorage.findReview(id);
//		model.addAttribute("review", review);
//		return "review";
//	}

}
