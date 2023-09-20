package com.phongnhatravel.dto;

import java.util.List;

public class UsersDTO {
	private Long id;
	private String userName;
	private String password;
	private String email;
	private String phone_number;
	private RolesDTO role;
	private List<CartDTO> listCart;
	private List<CheckoutDetailsDTO> listCheckoutDetails;

	public RolesDTO getRole() {
		return role;
	}

	public void setRole(RolesDTO role) {
		this.role = role;
	}

	public List<CartDTO> getListCart() {
		return listCart;
	}

	public void setListCart(List<CartDTO> listCart) {
		this.listCart = listCart;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public Long getId() {
		return id;
	}
}
