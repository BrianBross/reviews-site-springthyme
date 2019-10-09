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
	private ReviewStorage storage;
	@Resource
	private CategoryRepository categoryRepo;
	@RequestMapping("/reviews/{id}")
		public String singleReview(@PathVariable Long id, Model model) {
			
			Review review = storage.findReview(id);
			model.addAttribute("review", review );
			return "review";
		}

	public String displayAllReviews(Model model) {
		model.addAttribute("reviews", storage.findAllTheReviews());
		
		return "reviews";
	}
	
	@PostMapping("/add")
	public String addReview(String bookTitle, String userName, String reviewTitle, String reviewBody, String categoryName) {
		Category category = new Category(categoryName);
		categoryRepo.save(category);
		Review reviewToAdd = new Review(reviewTitle, bookTitle, userName, category, reviewBody);
		reviewToAdd = storage.addReview(reviewToAdd);
		return "redirect:/reviews/" +reviewToAdd.getId();
	}
	
	
}