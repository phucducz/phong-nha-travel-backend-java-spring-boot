package com.phongnhatravel.dto;

import java.time.LocalDate;
import java.util.List;

public class CartDTO {
	private Long id;
	private int quantity;
	private LocalDate bookingDate;
	private Long couponId;
	private UsersDTO user;
	private ToursDTO tour;
	private List<CheckoutDetailsDTO> listCheckoutDetails;
	private CouponsDTO coupon;

	public UsersDTO getUser() {
		return user;
	}

	public void setUser(UsersDTO user) {
		this.user = user;
	}

	public ToursDTO getTour() {
		return tour;
	}

	public void setTour(ToursDTO tour) {
		this.tour = tour;
	}

	public CouponsDTO getCoupon() {
		return coupon;
	}

	public void setCoupon(CouponsDTO coupon) {
		this.coupon = coupon;
	}

	public List<CheckoutDetailsDTO> getListCheckoutDetails() {
		return listCheckoutDetails;
	}

	public void setListCheckoutDetails(List<CheckoutDetailsDTO> listCheckoutDetails) {
		this.listCheckoutDetails = listCheckoutDetails;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Long getCouponId() {
		return couponId;
	}

	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}
}
