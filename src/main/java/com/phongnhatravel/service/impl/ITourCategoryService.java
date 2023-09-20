package com.phongnhatravel.service.impl;

import java.util.List;

import com.phongnhatravel.dto.TourCategoriesDTO;

public interface ITourCategoryService {
	List<TourCategoriesDTO> getListTourCategoryById(Long id);

	List<TourCategoriesDTO> getListTourCategory();
	
	TourCategoriesDTO getTourCategoryById(Long id);
}
