package phongnhatravelbackendver2.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import phongnhatravelbackendver2.dto.CheckoutsDTO;
import phongnhatravelbackendver2.dto.MessageDTO;
import phongnhatravelbackendver2.service.impl.CheckoutService;

@CrossOrigin
@RestController
public class CheckoutsAPI {
	@Autowired
	private CheckoutService checkoutService;

	@PostMapping("/checkouts")
	public MessageDTO createCheckout(@RequestBody CheckoutsDTO checkoutModel) {
		MessageDTO message = new MessageDTO();

		boolean result = checkoutService.save(checkoutModel);

		if (result) {
			message.setStatus(200);
			message.setMessage("Action succeed");
		} else {
			message.setStatus(500);
			message.setMessage("Internal service error, action failure");
		}

		return message;
	}
}
