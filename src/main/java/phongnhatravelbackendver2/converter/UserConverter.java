package phongnhatravelbackendver2.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import phongnhatravelbackendver2.dto.CheckoutDetailsDTO;
import phongnhatravelbackendver2.dto.UsersDTO;
import phongnhatravelbackendver2.entity.UsersEntity;
import phongnhatravelbackendver2.service.impl.CheckoutDetailService;

@Component
public class UserConverter {
	@Autowired
	private CartConverter cartConverter;
	@Autowired
	private RoleConverter roleConverter;

	@Autowired
	private CheckoutDetailService checkoutDetailService;

	public UsersDTO toDTO(UsersEntity entity, String type) {
		UsersDTO dto = new UsersDTO();

		dto.setId(entity.getId());
		dto.setUserName(entity.getUserName());
		dto.setPassword(entity.getPassword());
		dto.setEmail(entity.getEmail());
		dto.setPhoneNumber(entity.getPhoneNumber());
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastName());
		dto.setActive(entity.isActive());
		dto.setAvatar(entity.getAvatar());

		if (type != null && !type.equals("less")) {
			dto.setListCart(cartConverter.toListDTO(entity.getListCart()));

			try {
				CheckoutDetailsDTO checkoutDetailsDTO = checkoutDetailService.getCheckoutDetailByUserId(entity.getId());
				dto.setCheckoutDetail(checkoutDetailsDTO);
			} catch (Exception ex) {
				System.out.print(ex);
			}
		}

		dto.setRole(roleConverter.toDTO(entity.getRole()));

		return dto;
	}

	public List<UsersDTO> toListDTO(List<UsersEntity> listEntity, String type) {
		List<UsersDTO> listDTO = new ArrayList<UsersDTO>();

		for (UsersEntity entity : listEntity)
			listDTO.add(toDTO(entity, type));

		return listDTO;
	}

	public UsersEntity toEntity(UsersDTO dto) {
		UsersEntity entity = new UsersEntity();

		entity.setEmail(dto.getEmail());
		entity.setUserName(dto.getUserName());
		entity.setPassword(dto.getPassword());
		entity.setPhoneNumber(dto.getPhoneNumber());
		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setActive(dto.isActive());
		entity.setAvatar(dto.getAvatar());
		entity.setRole(roleConverter.toEntity(dto.getRole()));
		entity.setListCart(null);

		return entity;
	}
}
