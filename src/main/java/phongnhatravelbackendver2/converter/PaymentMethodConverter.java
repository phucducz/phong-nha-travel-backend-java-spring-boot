package phongnhatravelbackendver2.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import phongnhatravelbackendver2.dto.PaymentMethodsDTO;
import phongnhatravelbackendver2.entity.PaymentMethodsEntity;

@Component
public class PaymentMethodConverter {
	public PaymentMethodsDTO toDTO(PaymentMethodsEntity entity) {
		PaymentMethodsDTO dto = new PaymentMethodsDTO();
		
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		
		return dto;
	}
	
	public List<PaymentMethodsDTO> toListDTO(List<PaymentMethodsEntity> listEntity) {
		List<PaymentMethodsDTO> listDTO = new ArrayList<PaymentMethodsDTO>();
		
		for(PaymentMethodsEntity entity:listEntity)
			listDTO.add(toDTO(entity));
		
		return listDTO;
	}
}
