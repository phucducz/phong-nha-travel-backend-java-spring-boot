package phongnhatravelbackendver2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import phongnhatravelbackendver2.entity.TypesEntity;
import phongnhatravelbackendver2.repository.TypeRepository;
import phongnhatravelbackendver2.service.ITypeService;

@Service
public class TypeService implements ITypeService {
	@Autowired
	private TypeRepository typeRepository;
	
	public TypesEntity getTypeByTitle(String title) {
		TypesEntity entity = typeRepository.findOneByTitle(title);
		
		return entity;
	}

}
