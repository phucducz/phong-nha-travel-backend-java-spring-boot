package com.phongnhatravel.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.phongnhatravel.dto.TourCategoriesDTO;
import com.phongnhatravel.service.TourCategoryService;

@CrossOrigin
@RestController
public class ToursCategoriesAPI {

	@Autowired
	TourCategoryService tourCategoryService;

	@GetMapping("/tourCategories")
	public List<TourCategoriesDTO> getList(@RequestParam(name = "id", required = false) Long id) {
		if (id != null)
			return tourCategoryService.getListTourCategoryById(id);
		
		return tourCategoryService.getListTourCategory();
	}
}
