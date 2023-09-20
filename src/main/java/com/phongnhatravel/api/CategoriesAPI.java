package com.phongnhatravel.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.phongnhatravel.converter.CategoryConverter;
import com.phongnhatravel.dto.CategoriesDTO;
import com.phongnhatravel.service.CategoryService;

@CrossOrigin
@RestController
public class CategoriesAPI {
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private CategoryConverter categoryConverter;

	@GetMapping("/categories")
	public List<CategoriesDTO> getList(@RequestParam(name = "ids", required = false) Long[] ids) {
		return categoryConverter.toListDTO(categoryService.getListCategoryByIds(ids));
	}
}
