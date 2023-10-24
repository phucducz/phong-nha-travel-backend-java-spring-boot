package phongnhatravelbackendver2.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import phongnhatravelbackendver2.dto.UsersDTO;
import phongnhatravelbackendver2.service.impl.UserService;

@CrossOrigin
@RestController
public class UsersAPI {
	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<UsersDTO> getUser(@RequestParam(name = "id", required = false) Long id,
			@RequestParam(name = "type", required = false) String type) {
		return userService.getUserById(id, type);
	}
}
