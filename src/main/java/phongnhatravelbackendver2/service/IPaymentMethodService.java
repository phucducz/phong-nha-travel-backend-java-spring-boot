package phongnhatravelbackendver2.service;

import java.util.List;

import phongnhatravelbackendver2.dto.PaymentMethodsDTO;

public interface IPaymentMethodService {
	List<PaymentMethodsDTO> getAll(); 
}
