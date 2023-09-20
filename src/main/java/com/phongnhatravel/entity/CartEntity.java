package com.phongnhatravel.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class CartEntity extends BaseEntity {
	@Column(name = "booking_date")
	private LocalDate bookingDate;

	@Column
	private int quantity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tour_id")
	private ToursEntity tour;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private UsersEntity user;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coupon_id")
	private CouponsEntity coupon;

	@ManyToMany
	@JoinTable(name = "checkouts", joinColumns = @JoinColumn(name = "cart_id"), inverseJoinColumns = @JoinColumn(name = "checkout_detail_id"))
	private List<CheckoutDetailsEntity> listCheckoutDetail = new ArrayList<CheckoutDetailsEntity>();

	public ToursEntity getTour() {
		return tour;
	}

	public void setTour(ToursEntity tour) {
		this.tour = tour;
	}

	public List<CheckoutDetailsEntity> getListCheckoutDetail() {
		return listCheckoutDetail;
	}

	public void setListCheckoutDetail(List<CheckoutDetailsEntity> listCheckoutDetail) {
		this.listCheckoutDetail = listCheckoutDetail;
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

	public ToursEntity getTourId() {
		return tour;
	}

	public void setTourId(ToursEntity tour) {
		this.tour = tour;
	}

	public UsersEntity getUser() {
		return user;
	}

	public void setUser(UsersEntity user) {
		this.user = user;
	}

	public CouponsEntity getCoupon() {
		return coupon;
	}

	public void setCoupon(CouponsEntity coupon) {
		this.coupon = coupon;
	}
}