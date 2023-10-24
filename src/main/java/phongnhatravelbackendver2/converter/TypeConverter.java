package phongnhatravelbackendver2.converter;

import org.springframework.stereotype.Component;

import phongnhatravelbackendver2.dto.TypesDTO;
import phongnhatravelbackendver2.entity.TypesEntity;

@Component
public class TypeConverter {
	public TypesDTO toDTO(TypesEntity entity) {
		TypesDTO dto = new TypesDTO();
		
		dto.setId(entity.getId());
		dto.setTitle(entity.getTitle());
		
		return dto;
	}
	
	public TypesEntity toEntity(TypesDTO dto) {
		TypesEntity entity = new TypesEntity();
		
		entity.setTitle(dto.getTitle());
		
		return entity;
	}
}
