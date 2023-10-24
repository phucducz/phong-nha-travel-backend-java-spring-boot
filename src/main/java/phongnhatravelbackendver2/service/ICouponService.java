package phongnhatravelbackendver2.service;

import phongnhatravelbackendver2.dto.CouponsDTO;

public interface ICouponService {
	CouponsDTO checkCouponByCode(String code);
}
