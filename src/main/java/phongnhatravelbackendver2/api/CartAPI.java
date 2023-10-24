package phongnhatravelbackendver2.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import phongnhatravelbackendver2.dto.CartDTO;
import phongnhatravelbackendver2.dto.MessageDTO;
import phongnhatravelbackendver2.entity.CartEntity;
import phongnhatravelbackendver2.repository.CartRepository;
import phongnhatravelbackendver2.service.impl.CartService;

@CrossOrigin
@RestController
public class CartAPI {
	@Autowired
	private CartService cartService;
	
	@Autowired
	private CartRepository cartRepository;

	@GetMapping("/cart")
	public List<CartEntity> getCart(@RequestParam(name = "userId", required = false) Long userId) {
		List<CartEntity> cartEntity = cartRepository.findAllByUserIdCheckoutIdIsNull(userId);
		
		return cartEntity;
	}
	
	@PostMapping("/cart")
	public MessageDTO createCart(@RequestBody CartDTO cartModel) {
		MessageDTO message = new MessageDTO();

		boolean isSucceed = cartService.save(cartModel);

		if (isSucceed) {
			message.setStatus(200);
			message.setMessage("Insert successfully!");
		} else {
			message.setStatus(500);
			message.setMessage("Internal server error, insert failure!");
		}

		return message;
	}

	@PutMapping("/cart")
	public MessageDTO updateCartQuantityById(@RequestBody CartDTO cartModel) {
		MessageDTO message = new MessageDTO();

		boolean result = cartService.updateCartQuantityById(cartModel.getQuantity(), cartModel.getId());

		if (result) {
			message.setStatus(200);
			message.setMessage("Update successfully");
		} else {
			message.setStatus(500);
			message.setMessage("Internal server error, update failure!");
		}

		return message;
	}

	@DeleteMapping("/cart")
	public MessageDTO deleteCartById(@RequestParam(name = "id", required = true) Long id) {
		MessageDTO message = new MessageDTO();

		boolean result = cartService.deleteCartById(id);

		if (result) {
			message.setStatus(200);
			message.setMessage("Delete successfully!");
		} else {
			message.setStatus(500);
			message.setMessage("Internal server error, delete failure!");
		}

		return message;
	}
}