package phongnhatravelbackendver2.dto;

import java.time.LocalDate;
import java.util.List;

public class CheckoutsDTO {
	private Long id;
	private LocalDate date;
	private String status;
	
	private String address;
	private String apartment;
	private Long checkoutDetailId;
	private Long checkoutsId;
	private String city;
	private String companyName;
	private String country;
	private Long couponId;
	private String emailAddress;
	private String firstName;
	private String fullName;
	private String lastName;
	private String note;
	private String phoneNumber;
	private String type;
	private Long userId;
	private String zipcode;
	private Long paymentMethodId;

	public Long getCheckoutsId() {
		return checkoutsId;
	}

	public void setCheckoutsId(Long checkoutsId) {
		this.checkoutsId = checkoutsId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getCheckoutDetailId() {
		return checkoutDetailId;
	}

	public void setCheckoutDetailId(Long checkoutDetailId) {
		this.checkoutDetailId = checkoutDetailId;
	}

	private CouponsDTO coupon;
	private List<CartDTO> listCart;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getCouponId() {
		return couponId;
	}

	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public CouponsDTO getCoupon() {
		return coupon;
	}

	public void setCoupon(CouponsDTO coupon) {
		this.coupon = coupon;
	}

	public List<CartDTO> getListCart() {
		return listCart;
	}

	public void setListCart(List<CartDTO> listCart) {
		this.listCart = listCart;
	}

	public Long getPaymentMethodId() {
		return paymentMethodId;
	}

	public void setPaymentMethodId(Long paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
}
