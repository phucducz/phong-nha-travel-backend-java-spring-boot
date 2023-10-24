package phongnhatravelbackendver2.service;

import java.util.List;

import phongnhatravelbackendver2.dto.CategoriesDTO;
import phongnhatravelbackendver2.entity.CategoriesEntity;

public interface ICategoryService {
	List<CategoriesDTO> getListCategoryByIds(Long[] ids);
	
	CategoriesDTO getCategoryByCode(String code);
	
	List<CategoriesDTO> getAll();
	
	List<CategoriesEntity> getListCategoryEntityByIds(Long[] ids);
}

