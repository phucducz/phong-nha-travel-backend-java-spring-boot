package phongnhatravelbackendver2.converter;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import phongnhatravelbackendver2.dto.CheckoutDetailsDTO;
import phongnhatravelbackendver2.dto.CheckoutsDTO;
import phongnhatravelbackendver2.entity.CartEntity;
import phongnhatravelbackendver2.entity.CheckoutsEntity;
import phongnhatravelbackendver2.entity.CouponsEntity;
import phongnhatravelbackendver2.entity.PaymentMethodsEntity;
import phongnhatravelbackendver2.repository.CartRepository;
import phongnhatravelbackendver2.repository.CouponRepository;
import phongnhatravelbackendver2.repository.PaymentMethodRepository;

@Component
public class CheckoutConverter {
	@Autowired
	private CouponConverter couponConverter;

	@Autowired
	private PaymentMethodRepository paymentMethodRepository;
	@Autowired
	private CouponRepository couponRepository;
	@Autowired
	private CartRepository cartRepository;

	public CheckoutsDTO toDTO(CheckoutsEntity entity) {
		CheckoutsDTO dto = new CheckoutsDTO();

		dto.setDate(entity.getDateOfPaid());
		dto.setId(entity.getId());
		dto.setPaymentMethodId(entity.getPaymentMethod().getId());
		dto.setStatus(entity.getStatus());

		if (entity.getCoupon() != null)
			dto.setCoupon(couponConverter.toDTO(entity.getCoupon()));

		return dto;
	}
	
	public CheckoutsEntity toNewEntity(CheckoutsDTO newDTO, CheckoutsEntity oldEntity) {
		oldEntity.setDateOfPaid(LocalDate.now());
		oldEntity.setStatus("paid");
		
		return oldEntity;
	}

	public CheckoutsEntity toEntity(CheckoutsDTO dto) {
		CheckoutsEntity entity = new CheckoutsEntity();

		if (dto.getType().equals("pay")) {
			entity.setDateOfPaid(LocalDate.now());
			entity.setStatus("paid");

			entity.setCoupon(null);

			PaymentMethodsEntity paymentMethodsEntity = paymentMethodRepository.findOneById(dto.getPaymentMethodId());
			entity.setPaymentMethod(paymentMethodsEntity);
		} else {
			entity.setDateOfPaid(null);
			entity.setStatus("unpaid");

			CouponsEntity couponEntity = couponRepository.findOneById(dto.getCouponId());
			entity.setCoupon(couponEntity);

			PaymentMethodsEntity paymentMethodsEntity = paymentMethodRepository.findOneById(Long.parseLong("1"));
			entity.setPaymentMethod(paymentMethodsEntity);
		}

		List<CartEntity> listCart = cartRepository.findAllByUserId(dto.getUserId());

		entity.setListCart(listCart);

		return entity;
	}

	public CheckoutDetailsDTO toCheckoutDetailDTO(CheckoutsDTO checkoutDTO) {
		CheckoutDetailsDTO checkoutDetailDTO = new CheckoutDetailsDTO();

		if(checkoutDTO.getCheckoutDetailId() != null)
			checkoutDetailDTO.setId(checkoutDTO.getCheckoutDetailId());
		
		checkoutDetailDTO.setAddress(checkoutDTO.getAddress());
		checkoutDetailDTO.setApartment(checkoutDTO.getApartment());
		checkoutDetailDTO.setCity(checkoutDTO.getCity());
		checkoutDetailDTO.setCompanyName(checkoutDTO.getCompanyName());
		checkoutDetailDTO.setCountry(checkoutDTO.getCountry());
		checkoutDetailDTO.setEmailAddress(checkoutDTO.getEmailAddress());
		checkoutDetailDTO.setFirstName(checkoutDTO.getFirstName());
		checkoutDetailDTO.setFullName(checkoutDTO.getFullName());
		checkoutDetailDTO.setLastName(checkoutDTO.getLastName());
		checkoutDetailDTO.setNote(checkoutDTO.getNote());
		checkoutDetailDTO.setPhoneNumber(checkoutDTO.getPhoneNumber());
		checkoutDetailDTO.setUserId(checkoutDTO.getUserId());
		checkoutDetailDTO.setZipcode(checkoutDTO.getZipcode());

		return checkoutDetailDTO;
	}
}
