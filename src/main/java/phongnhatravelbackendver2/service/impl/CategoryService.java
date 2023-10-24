package phongnhatravelbackendver2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import phongnhatravelbackendver2.converter.CategoryConverter;
import phongnhatravelbackendver2.dto.CategoriesDTO;
import phongnhatravelbackendver2.entity.CategoriesEntity;
import phongnhatravelbackendver2.repository.CategoryRepository;
import phongnhatravelbackendver2.service.ICategoryService;

@Service
public class CategoryService implements ICategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private CategoryConverter categoryConverter;

	public List<CategoriesDTO> getListCategoryByIds(Long[] ids) {
		List<CategoriesEntity> listEntity = new ArrayList<CategoriesEntity>();

		if (ids != null)
			for (Long id : ids)
				listEntity.add(categoryRepository.findOneById(id));
		else
			listEntity = categoryRepository.findAll();

		return categoryConverter.toListDTO(listEntity);
	}

	public CategoriesDTO getCategoryByCode(String code) {
		CategoriesEntity entity = categoryRepository.findOneByCode(code);
		
		return categoryConverter.toDTO(entity);
	}

	public List<CategoriesDTO> getAll() {
		return categoryConverter.toListDTO(categoryRepository.findAll());
	}

	public List<CategoriesEntity> getListCategoryEntityByIds(Long[] ids) {
		List<CategoriesEntity> listEntity = new ArrayList<CategoriesEntity>();

		if (ids != null)
			for (Long id : ids)
				listEntity.add(categoryRepository.findOneById(id));
		else
			listEntity = categoryRepository.findAll();

		return listEntity;
	}
}
