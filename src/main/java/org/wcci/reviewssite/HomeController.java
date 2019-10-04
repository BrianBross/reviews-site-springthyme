package org.wcci.reviewssite;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping("/")
		public String singleReview(Model model) {
			Review review = new Review("First Review", "Gone With The Wind", "James Doe", LocalDate.now(), "Fiction",
			"So good I wanna slap my mama");
			model.addAttribute("userReview", review);
			return "review";
		}
					
}
