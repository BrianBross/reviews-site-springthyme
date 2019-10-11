package org.wcci.reviewssite;

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
		Review review = new Review("First Review with Template", "Gone With The Wind", "James Doe",
				new Category("Fake Category"), "So good I wanna slap my mama");
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
	public String addReview1(String reviewTitle, String bookTitle, String userName, String categoryName,
			String reviewBody) {
		Category category = new Category(categoryName);
		categoryStorage.addCategory(category);
		Review reviewToAdd = new Review(reviewTitle, bookTitle, userName, category, reviewBody);
		reviewStorage.addReview(reviewToAdd);
		return "redirect:/all_reviews";
	}

}
