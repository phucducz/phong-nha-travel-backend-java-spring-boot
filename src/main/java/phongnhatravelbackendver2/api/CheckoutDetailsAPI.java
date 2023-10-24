package phongnhatravelbackendver2.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import phongnhatravelbackendver2.dto.CheckoutDetailsDTO;
import phongnhatravelbackendver2.dto.MessageDTO;
import phongnhatravelbackendver2.service.impl.CheckoutDetailService;

@CrossOrigin
@RestController
public class CheckoutDetailsAPI {
	@Autowired
	private CheckoutDetailService checkoutDetailService;

	@GetMapping("/checkoutDetails")
	public CheckoutDetailsDTO getCheckoutDetail(@RequestParam(name = "userId", required = false) Long userId) {
		return checkoutDetailService.getCheckoutDetailByUserId(userId);
	}

	@PostMapping("/checkoutDetails")
	public MessageDTO createCheckoutDetails(@RequestBody CheckoutDetailsDTO checkoutDetailModel) {
		MessageDTO message = new MessageDTO();

		boolean result = checkoutDetailService.save(checkoutDetailModel);

		if (result) {
			message.setStatus(200);
			message.setMessage("action succeed!");
		} else {
			message.setStatus(500);
			message.setMessage("Internal server error, action failure!");
		}

		return message;
	}
}
