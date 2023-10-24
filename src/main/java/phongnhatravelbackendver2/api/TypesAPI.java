package phongnhatravelbackendver2.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import phongnhatravelbackendver2.entity.TypesEntity;
import phongnhatravelbackendver2.service.impl.TypeService;

@CrossOrigin
@RestController
public class TypesAPI {
	@Autowired
	private TypeService typeService;
	
	@GetMapping("/types")
	public TypesEntity getType(@RequestParam(name = "title", required = false) String title) {
		return typeService.getTypeByTitle(title);
	}
}
