package com.phongnhatravel.service.impl;

import java.util.List;

import com.phongnhatravel.entity.CategoriesEntity;

public interface ICategoryService {
	List<CategoriesEntity> getListCategoryByIds(Long[] ids);
}
