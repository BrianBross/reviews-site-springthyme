package org.wcci.reviewssite;

import java.time.LocalDate;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	@Resource
	private ReviewStorage   storage;
	@RequestMapping("/")
		public String singleReview(Model model) {
			Review review = new Review("First Review", "Gone With The Wind", "James Doe", new Category("Fiction"),
			"So good I wanna slap my mama");
			model.addAttribute("userReview", review);
			return "review";
		}
	@RequestMapping("/add_review")
	public String addReview(Model model) {
		Review review = new Review("First Review", "Gone With The Wind", "James Doe", new Category("Fiction"),
		"So good I wanna slap my mama");
		model.addAttribute("userReview", review);
		return "add_review";		
}
	public String displayAllReviews(Model model) {
		model.addAttribute("reviews", storage.findAllTheReviews());
		
		return "reviews";
	}
}
