package phongnhatravelbackendver2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import phongnhatravelbackendver2.converter.CouponConverter;
import phongnhatravelbackendver2.dto.CouponsDTO;
import phongnhatravelbackendver2.entity.CouponsEntity;
import phongnhatravelbackendver2.repository.CouponRepository;
import phongnhatravelbackendver2.service.ICouponService;

@Service
public class CouponService implements ICouponService {
	@Autowired
	private CouponRepository couponRepository;

	@Autowired
	private CouponConverter couponConverter;

	public CouponsDTO checkCouponByCode(String code) {
		CouponsEntity entity = couponRepository.findOneByCode(code);

		if (entity != null)
			return couponConverter.toDTO(entity);

		return null;
	}
}
