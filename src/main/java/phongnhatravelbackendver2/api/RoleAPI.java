package phongnhatravelbackendver2.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import phongnhatravelbackendver2.dto.RolesDTO;
import phongnhatravelbackendver2.service.impl.RoleService;

@CrossOrigin
@RestController
public class RoleAPI {
	@Autowired
	private RoleService roleService;
	
	@GetMapping("/roles")
	public List<RolesDTO> getListRole() {
		return roleService.getListRole();
	}
}
