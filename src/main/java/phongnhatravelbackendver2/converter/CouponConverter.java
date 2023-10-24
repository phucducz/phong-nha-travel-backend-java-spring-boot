package phongnhatravelbackendver2.converter;

import org.springframework.stereotype.Component;

import phongnhatravelbackendver2.dto.CouponsDTO;
import phongnhatravelbackendver2.entity.CouponsEntity;

@Component
public class CouponConverter {
	public CouponsDTO toDTO(CouponsEntity entity) {
		CouponsDTO dto = new CouponsDTO();
		
		dto.setId(entity.getId());
		dto.setCode(entity.getCode());
		dto.setValue(entity.getValue());
		
		return dto;
	}
}
