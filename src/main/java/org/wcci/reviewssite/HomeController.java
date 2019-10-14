package org.wcci.reviewssite;

import java.util.ArrayList;
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
	public String singleReview(Model model) {
		Review review = new Review("First Review with Template", "Gone With The Template", "Template Doe",
				new Category("Fake Templategory"), "So template I wanna template my template!");
		model.addAttribute("review", review);
		return "review";
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

	@PostMapping("/add")
	public String addReview(String reviewTitle, String bookTitle, String userName, Long categoryId, String reviewBody,
			Long... tagList) {

		Category category = categoryStorage.findCategory(categoryId);

		List<Tag> tags = new ArrayList<Tag>();

		if (tagList != null) {
			for (Long id : tagList) {
				tags.add(tagStorage.findTag(id));
			}
			Review reviewToAdd = new Review(reviewTitle, bookTitle, userName, category, reviewBody, tags);
			reviewStorage.addReview(reviewToAdd);
			
		} else {
			Review reviewToAdd = new Review(reviewTitle, bookTitle, userName, category, reviewBody);
			reviewStorage.addReview(reviewToAdd);
		}
			
		return "redirect:/all_reviews";
	}

	@PostMapping("/like")
	public String addLike(Long reviewId) {
		System.out.println("this line is showing something great" + reviewId);
		Review review = reviewStorage.findReview(reviewId);
		reviewStorage.addLike(review);
		return "redirect:/all_reviews";
	}

}
