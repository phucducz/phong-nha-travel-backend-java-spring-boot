package phongnhatravelbackendver2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import phongnhatravelbackendver2.converter.CheckoutConverter;
import phongnhatravelbackendver2.dto.CheckoutDetailsDTO;
import phongnhatravelbackendver2.dto.CheckoutsDTO;
import phongnhatravelbackendver2.entity.CheckoutsEntity;
import phongnhatravelbackendver2.repository.CheckoutRepository;
import phongnhatravelbackendver2.service.ICheckoutService;

@Service
public class CheckoutService implements ICheckoutService {
	@Autowired
	private CheckoutRepository checkoutRepository;

	@Autowired
	private CheckoutDetailService checkoutDetailService;
	@Autowired
	private CartService cartService;

	@Autowired
	private CheckoutConverter checkoutConverter;

	private boolean createCheckout(CheckoutsDTO dto) {
		CheckoutsEntity checkoutEntity = checkoutConverter.toEntity(dto);

		if (dto.getCheckoutsId() != null) {
			CheckoutsEntity oldCheckoutEntity = checkoutRepository.findOneById(dto.getCheckoutsId());
			checkoutEntity = checkoutConverter.toNewEntity(dto, oldCheckoutEntity);
			
			checkoutEntity = checkoutRepository.save(checkoutEntity);

			return checkoutEntity.getId() != null;
		}
		
		checkoutEntity = checkoutRepository.save(checkoutEntity);

		return cartService.updateCheckoutIdByUserId(dto.getUserId(), checkoutEntity.getId());
	}

	public boolean save(CheckoutsDTO dto) {
		boolean result = false;

		if (dto.getType().equals("pay")) {
			CheckoutDetailsDTO checkoutDetailsDTO = checkoutConverter.toCheckoutDetailDTO(dto);

			if (checkoutDetailService.save(checkoutDetailsDTO))
				result = createCheckout(dto);

			return result;
		}

		return createCheckout(dto);
	}
}
