package phongnhatravelbackendver2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import phongnhatravelbackendver2.converter.RoleConverter;
import phongnhatravelbackendver2.dto.RolesDTO;
import phongnhatravelbackendver2.entity.RolesEntity;
import phongnhatravelbackendver2.repository.RoleRepository;
import phongnhatravelbackendver2.service.IRoleService;

@Service
public class RoleService implements IRoleService {
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private RoleConverter roleConverter;
	
	@Override
	public List<RolesDTO> getListRole() {
		List<RolesEntity> listEntity = roleRepository.findAll();
		
		return roleConverter.toListDTO(listEntity);
	}

}
