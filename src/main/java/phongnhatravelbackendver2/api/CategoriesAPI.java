package phongnhatravelbackendver2.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import phongnhatravelbackendver2.dto.CategoriesDTO;
import phongnhatravelbackendver2.service.impl.CategoryService;

@CrossOrigin
@RestController
public class CategoriesAPI {
	@Autowired
	private CategoryService categoryService;

	@GetMapping("/categories")
	public List<CategoriesDTO> getList(@RequestParam(name = "ids", required = false) Long[] ids,
			@RequestParam(name = "categoryCode", required = false) String categoryCode) {
		if (categoryCode != null) {
			List<CategoriesDTO> listCategories = new ArrayList<CategoriesDTO>();
			listCategories.add(categoryService.getCategoryByCode(categoryCode));

			return listCategories;
		} else if (ids != null)
			return categoryService.getListCategoryByIds(ids);
		
		return categoryService.getAll();
	}
}
