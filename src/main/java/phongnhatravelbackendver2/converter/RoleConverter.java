package phongnhatravelbackendver2.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import phongnhatravelbackendver2.dto.RolesDTO;
import phongnhatravelbackendver2.entity.RolesEntity;

@Component
public class RoleConverter {
	public RolesDTO toDTO(RolesEntity entity) {
		RolesDTO dto = new RolesDTO();

		dto.setId(entity.getId());
		dto.setRole(entity.getRole());

		return dto;
	}

	public RolesEntity toEntity(RolesDTO dto) {
		RolesEntity entity = new RolesEntity();

		entity.setRole(dto.getRole());
		entity.setListUser(null);

		return entity;
	}

	public List<RolesDTO> toListDTO(List<RolesEntity> listEntity) {
		List<RolesDTO> listDTO = new ArrayList<RolesDTO>();

		for (RolesEntity entity : listEntity)
			listDTO.add(toDTO(entity));
		
		return listDTO;
	}
}
