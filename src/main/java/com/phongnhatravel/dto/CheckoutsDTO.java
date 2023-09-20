package com.phongnhatravel.dto;

public class CheckoutsDTO {
	private Long id;
	private Long checkout_details_id;
	private Long cart_id;

	public Long getCheckout_details_id() {
		return checkout_details_id;
	}

	public void setCheckout_details_id(Long checkout_details_id) {
		this.checkout_details_id = checkout_details_id;
	}

	public Long getCart_id() {
		return cart_id;
	}

	public void setCart_id(Long cart_id) {
		this.cart_id = cart_id;
	}

	public Long getId() {
		return id;
	}
}
