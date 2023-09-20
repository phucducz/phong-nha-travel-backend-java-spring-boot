package com.phongnhatravel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phongnhatravel.entity.CategoriesEntity;
import com.phongnhatravel.reponsitory.CategoryRepository;
import com.phongnhatravel.service.impl.ICategoryService;

@Service
public class CategoryService implements ICategoryService {
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<CategoriesEntity> getListCategoryByIds(Long[] ids) {
		List<CategoriesEntity> listEntity = new ArrayList<CategoriesEntity>();

		if (ids != null)
			for (Long id : ids)
				listEntity.add(categoryRepository.findOneById(id));
		else
			listEntity = categoryRepository.findAll();

		return listEntity;
	}
}
