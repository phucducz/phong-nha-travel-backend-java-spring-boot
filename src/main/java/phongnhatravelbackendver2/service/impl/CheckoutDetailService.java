package phongnhatravelbackendver2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import phongnhatravelbackendver2.converter.CheckoutDetailConverter;
import phongnhatravelbackendver2.dto.CheckoutDetailsDTO;
import phongnhatravelbackendver2.entity.CheckoutDetailsEntity;
import phongnhatravelbackendver2.entity.UsersEntity;
import phongnhatravelbackendver2.repository.CheckoutDetailRepository;
import phongnhatravelbackendver2.service.ICheckoutDetailService;

@Service
public class CheckoutDetailService implements ICheckoutDetailService {
	@Autowired
	private CheckoutDetailRepository checkoutDetailRepository;
	
	@Autowired
	private CheckoutDetailConverter checkoutDetailConverter;
	
	@Autowired
	private UserService userService;

	public CheckoutDetailsDTO getCheckoutDetailByUserId(Long userId) {
		CheckoutDetailsEntity entity = checkoutDetailRepository.findOneByUserId(userId);

		return checkoutDetailConverter.toDTO(entity);
	}

	public CheckoutDetailsEntity getCheckoutDetailById(Long id) {
		CheckoutDetailsEntity entity = checkoutDetailRepository.findOneById(id);

		return entity;
	}

	public boolean isExist(Long userId) {
		CheckoutDetailsDTO dto = getCheckoutDetailByUserId(userId);

		if (dto.getId() != null)
			return true;

		return false;
	}

	public boolean save(CheckoutDetailsDTO dto) {
		CheckoutDetailsEntity entity = new CheckoutDetailsEntity();

		if (dto.getId() != null) {
			CheckoutDetailsEntity oldCheckoutDetailsEntity = getCheckoutDetailById(dto.getId());
			entity = checkoutDetailConverter.toEntity(oldCheckoutDetailsEntity, dto);
		} else
			entity = checkoutDetailConverter.toEntity(dto);

		UsersEntity userEntity = userService.getUserEntityById(dto.getUserId());
		entity.setUser(userEntity);

		entity = checkoutDetailRepository.save(entity);

		return entity.getId() != null;
	}

	public CheckoutDetailsEntity getCheckoutDetailEntityByUserId(Long userId) {
		CheckoutDetailsEntity entity = checkoutDetailRepository.findOneByUserId(userId);

		return entity;
	}
}
