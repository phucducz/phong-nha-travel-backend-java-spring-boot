package phongnhatravelbackendver2.service;

import phongnhatravelbackendver2.dto.CheckoutDetailsDTO;
import phongnhatravelbackendver2.entity.CheckoutDetailsEntity;

public interface ICheckoutDetailService {
	CheckoutDetailsDTO getCheckoutDetailByUserId(Long userId);
	
	CheckoutDetailsEntity getCheckoutDetailEntityByUserId(Long userId);
	
	CheckoutDetailsEntity getCheckoutDetailById(Long id);
	
	boolean isExist(Long userId);

	boolean save(CheckoutDetailsDTO checkoutDetailsDTO);
}
