package phongnhatravelbackendver2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import phongnhatravelbackendver2.converter.CartConverter;
import phongnhatravelbackendver2.dto.CartDTO;
import phongnhatravelbackendver2.entity.CartEntity;
import phongnhatravelbackendver2.entity.CheckoutsEntity;
import phongnhatravelbackendver2.entity.ToursEntity;
import phongnhatravelbackendver2.entity.UsersEntity;
import phongnhatravelbackendver2.repository.CartRepository;
import phongnhatravelbackendver2.repository.CheckoutRepository;
import phongnhatravelbackendver2.repository.TourRepository;
import phongnhatravelbackendver2.repository.UserRepository;
import phongnhatravelbackendver2.service.ICartService;

@Service
public class CartService implements ICartService {
	@Autowired
	private CartRepository cartRepository;
	@Autowired
	private TourRepository tourRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CheckoutRepository checkoutRepository;

	@Autowired
	private CartConverter cartConverter;

	@Transactional
	public boolean deleteCartById(Long id) {
		if (id == null)
			return false;

		int result = cartRepository.deleteCartById(id);

		return result > 0;
	}

	public boolean save(CartDTO cartDTO) {
		CartEntity cartEntity = new CartEntity();

		cartEntity.setBookingDate(cartDTO.getBookingDate());
		cartEntity.setQuantity(cartDTO.getQuantity());

		ToursEntity tourEntity = tourRepository.findOneById(cartDTO.getTourId());
		UsersEntity userEntity = userRepository.findOneById(cartDTO.getUserId());

		cartEntity.setTour(tourEntity);
		cartEntity.setUser(userEntity);
		cartEntity.setCheckout(null);

		List<Long> checkoutIds = cartRepository.findCheckoutsIdByUsersId(cartDTO.getUserId());

		if (checkoutIds.size() > 0) {
			CheckoutsEntity checkoutEntity = checkoutRepository.findOneById(checkoutIds.get(0));

			cartEntity.setCheckout(checkoutEntity);
		}

		CartEntity oldCartEntity = cartRepository.findOneByUsersIdAndToursId(cartDTO.getUserId(), cartDTO.getTourId());

		if (oldCartEntity != null)
			cartEntity = cartConverter.toNewEntity(oldCartEntity, cartEntity);

		if (cartEntity != null) {
			cartEntity = cartRepository.save(cartEntity);

			if (cartEntity.getId() != null)
				return true;
		}

		return false;
	}

	@Transactional
	public boolean updateCheckoutIdByUserId(Long userId, Long checkoutsId) {
		int result = cartRepository.updateCheckoutIdByUserId(userId, checkoutsId);

		return result > 0;
	}

	@Transactional
	public boolean updateCartQuantityById(int quantity, Long id) {
		if (id == null)
			return false;

		int result = cartRepository.updateQuantityById(quantity, id);

		return result > 0;
	}
}
