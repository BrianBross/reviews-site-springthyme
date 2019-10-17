package org.wcci.reviewssite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryStorage {
	@Autowired
	CategoryRepository categoryRepo;

	public Category addCategory(Category categoryToAdd) {
		return categoryRepo.save(categoryToAdd);
	}

	public Category findCategory(Long id) {
		return categoryRepo.findById(id).get();
	}

	public Iterable<Category> findAllTheCategories() {
		return categoryRepo.findAllByOrderByCategoryNameAsc();
	}
}
