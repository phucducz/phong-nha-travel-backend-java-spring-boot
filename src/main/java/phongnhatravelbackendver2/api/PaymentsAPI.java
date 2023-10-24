package phongnhatravelbackendver2.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import phongnhatravelbackendver2.dto.PaymentMethodsDTO;
import phongnhatravelbackendver2.service.impl.PaymentMethodService;

@CrossOrigin
@RestController
public class PaymentsAPI {
	@Autowired
	private PaymentMethodService paymentMethodService;
	
	@GetMapping("/payments")
	public List<PaymentMethodsDTO> getListPayment() {
		return paymentMethodService.getAll();
	}
}
