package phongnhatravelbackendver2.service;

import java.util.List;

import phongnhatravelbackendver2.dto.UsersDTO;
import phongnhatravelbackendver2.entity.UsersEntity;

public interface IUserService {
	List<UsersDTO> getUserById(Long id, String type);
	
	UsersEntity getUserEntityById(Long id);
}
