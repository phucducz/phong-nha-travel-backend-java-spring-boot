package phongnhatravelbackendver2.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import phongnhatravelbackendver2.dto.CouponsDTO;
import phongnhatravelbackendver2.service.impl.CouponService;

@CrossOrigin
@RestController
public class CouponsAPI {
	@Autowired
	private CouponService couponService;
	
	@GetMapping("/coupons")
	public CouponsDTO checkCoupon(@RequestParam(name = "code", required = false) String code) {
		CouponsDTO coupon = couponService.checkCouponByCode(code);
		
		if(coupon == null) {
			coupon = new CouponsDTO();
			
			coupon.setCode("");
			coupon.setId(null);
			coupon.setValue(0);
		}
		
		return coupon;
	}
}
