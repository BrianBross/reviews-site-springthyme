package org.wcci.reviewssite;

import java.time.LocalDate;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@Resource
	private CategoryStorage categoryStorage;
	@Resource
	private ReviewStorage reviewStorage;

	
	@RequestMapping("/")
		public String singleReview(Model model) {
			Review review = new Review("First Review", "Gone With The Wind", "James Doe", new Category("Fiction"),
			"So good I wanna slap my mama");
			model.addAttribute("review", review);
			return "review";
		}
	
	@RequestMapping("/all_reviews")
	public String getAllReviews(Model model) {
		model.addAttribute("reviews", reviewStorage.findAllTheReviews());
		return "reviews";
	}

	@RequestMapping("/reviews/{id}")
		public String singleReview(@PathVariable Long id, Model model) {
			
			Review review = reviewStorage.findReview(id);
			model.addAttribute("review", review );
			return "review";
		}

	
	
	@PostMapping("/add")
	public String addReview(String bookTitle, String userName, String reviewTitle, String reviewBody, String categoryName) {
		Category category = new Category(categoryName);
		categoryStorage.addCategory(category);
		Review reviewToAdd = new Review(reviewTitle, bookTitle, userName, category, reviewBody);
		reviewToAdd = reviewStorage.addReview(reviewToAdd);
		return "redirect:/reviews/" +reviewToAdd.getId();
	}
	
	
}

