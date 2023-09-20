package com.phongnhatravel.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phongnhatravel.entity.TourCategoriesEntity;

public interface TourCategoryRepository extends JpaRepository<TourCategoriesEntity, Long> {
	List<TourCategoriesEntity> findAllByTourId(Long id);

	List<TourCategoriesEntity> findAll();
	
	TourCategoriesEntity findOneByTourId(Long id);
}
