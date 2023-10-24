package phongnhatravelbackendver2.service;

import phongnhatravelbackendver2.dto.CartDTO;

public interface ICartService {
	boolean updateCartQuantityById(int quantity, Long id);
	
	boolean deleteCartById(Long id);
	
	boolean save(CartDTO cart);
	
	boolean updateCheckoutIdByUserId(Long userId, Long checkoutsId);
}
