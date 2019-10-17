package org.wcci.reviewssite;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {
	@Autowired
	private ReviewStorage reviewStorage;
	@Autowired
	private CategoryStorage categoryStorage;
	@Autowired
	private TagStorage tagStorage;
	@Override
	public void run(String... args) throws Exception {
		
		
		Category category1 = new Category("Self-Help");
		Category category2 = new Category("Comedy");
		Category category3 = new Category("NonFiction");
		Category category4 = new Category("Children");
		Category category5 = new Category("Fiction");
		Category category6 = new Category("Biography");
		Category category7 = new Category("Teen");
		Category category8 = new Category("Horror");
		
		Tag tag1 = new Tag("page turner");
		Tag tag2 = new Tag("exhilirating");
		Tag tag3 = new Tag("breath taking");
		Tag tag4 = new Tag("thrlling");
		Tag tag5 = new Tag("meh");
		Tag tag6 = new Tag("exhausting");
		Tag tag7 = new Tag("creepy");
		Tag tag8 = new Tag("humorous");
		Tag tag9 = new Tag("adequate");
		Tag tag10 = new Tag("brilliant");
								
		categoryStorage.addCategory(category1);
		categoryStorage.addCategory(category2);
		categoryStorage.addCategory(category3);
		categoryStorage.addCategory(category4);
		categoryStorage.addCategory(category5);
		categoryStorage.addCategory(category6);
		categoryStorage.addCategory(category7);
		categoryStorage.addCategory(category8);
		
		tagStorage.addTag(tag1);
		tagStorage.addTag(tag2);
		tagStorage.addTag(tag3);
		tagStorage.addTag(tag4);
		tagStorage.addTag(tag5);
		tagStorage.addTag(tag6);
		tagStorage.addTag(tag7);
		tagStorage.addTag(tag8);
		tagStorage.addTag(tag9);
		tagStorage.addTag(tag10);
		
		
		Review review1 = new Review("Chirp Chirp", "The Birds", "Jimmy Roe", 
				category1,"Scared me so much!");
		Review review2 = new Review("My Favorite Book", "I Hope They Serve Beer in Hell", "Brian B.", 
				category2, "Reee-diculous!!!");
		Review review3 = new Review("Always Evolving", "Jane Eyre", "Barbara Taylor", 
				category3,"Read at least once every 5 years!");
		Review review4 = new Review("Pleasing to the Soul", "Dragon: Bruce Lee", "Charles Smith", 
				category4, "Left me Kicking!!!");
		Review review5 = new Review("Don't Even", "To Kill a Mockingbird", "Tom Robison", 
				category5,"Takes a turn for the worst.");
		Review review6 = new Review("Boring", "Steve Jobs by Walter Isaacson", "Bill Gates", 
				category6, "Do I have to say more?");
		Review review7 = new Review("Abosolute Masterpiece", "What's That Smell? pt. 2", "Kesha", 
				category7,"It really had me thinking... where is that god awful smell coming from? After further inner reflection I realized maybe it's me? Either way I can't wait for part 3! ");
		Review review8 = new Review("I almost sold my seaside property", "Big Whale: Chapter 3 Return of the Whale", "Elon Musk", 
				category8, "I hid in my Tesla for weeks after finishing this book.");

		reviewStorage.addReview(review1);
		reviewStorage.addReview(review2);
		reviewStorage.addReview(review3);
		reviewStorage.addReview(review4);
		reviewStorage.addReview(review5);
		reviewStorage.addReview(review6);
		reviewStorage.addReview(review7);
		reviewStorage.addReview(review8);		
		

	}
	
	

	
	public void test() {

		ArrayList<String> categoryListNonFiction = new ArrayList<String>();
		
		categoryListNonFiction.add("Health & Wellness");
		categoryListNonFiction.add("Education");
		categoryListNonFiction.add("Biography");
		categoryListNonFiction.add("History");
		categoryListNonFiction.add("Computer");
		categoryListNonFiction.add("Religion");
		categoryListNonFiction.add("Art & Music");
	}
}
