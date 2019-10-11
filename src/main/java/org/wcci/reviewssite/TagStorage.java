package org.wcci.reviewssite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TagStorage {
	@Autowired
	TagRepository tagRepo;
	
	public Tag addTag(Tag tagToAdd) {
		return tagRepo.save(tagToAdd);
	}
	
	public Tag findTag(Long id) {
		return tagRepo.findById(id).get();
	}
	
	public Iterable<Tag> findAllTheTags() {
		return tagRepo.findAllByOrderByTagNameAsc();
	}
	
}
