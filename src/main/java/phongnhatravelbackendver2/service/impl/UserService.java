package phongnhatravelbackendver2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import phongnhatravelbackendver2.converter.UserConverter;
import phongnhatravelbackendver2.dto.UsersDTO;
import phongnhatravelbackendver2.entity.UsersEntity;
import phongnhatravelbackendver2.repository.UserRepository;
import phongnhatravelbackendver2.service.IUserService;

@Service
public class UserService implements IUserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserConverter userConverter;

	public List<UsersDTO> getUserById(Long id, String type) {
		List<UsersEntity> listEntity = new ArrayList<UsersEntity>();

		if (id != null)
			listEntity.add(userRepository.findOneById(id));
		else
			listEntity = userRepository.findAll();

		return userConverter.toListDTO(listEntity, type);
	}

	public UsersEntity getUserEntityById(Long id) {
		return userRepository.findOneById(id);
	}
}
