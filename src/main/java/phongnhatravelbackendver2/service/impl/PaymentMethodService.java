package phongnhatravelbackendver2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import phongnhatravelbackendver2.converter.PaymentMethodConverter;
import phongnhatravelbackendver2.dto.PaymentMethodsDTO;
import phongnhatravelbackendver2.entity.PaymentMethodsEntity;
import phongnhatravelbackendver2.repository.PaymentMethodRepository;
import phongnhatravelbackendver2.service.IPaymentMethodService;

@Service
public class PaymentMethodService implements IPaymentMethodService {
	@Autowired
	private PaymentMethodRepository paymentMethodRepository;
	
	@Autowired
	private PaymentMethodConverter paymentMethodConverter;
	
	public List<PaymentMethodsDTO> getAll() {
		List<PaymentMethodsEntity> listEntity = paymentMethodRepository.findAll();
		
		return paymentMethodConverter.toListDTO(listEntity);
	}
}
