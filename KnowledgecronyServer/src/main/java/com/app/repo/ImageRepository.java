package com.app.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.model.Image;

public interface ImageRepository extends CrudRepository<Image, Long> {
	Image findByImageId(Long imageId);
}
