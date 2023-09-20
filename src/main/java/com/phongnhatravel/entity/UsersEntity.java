package com.phongnhatravel.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UsersEntity extends BaseEntity {
	@Column(name = "user_name")
	private String userName;

	@Column
	private String password;

	@Column
	private String email;

	@Column(name = "phone_number")
	private String phone_number;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id")
	private RolesEntity role;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<CartEntity> listCart;

	@OneToOne(mappedBy = "user")
	private CheckoutDetailsEntity checkoutDetail;
	
	public CheckoutDetailsEntity getCheckoutDetail() {
		return checkoutDetail;
	}

	public void setCheckoutDetail(CheckoutDetailsEntity checkoutDetail) {
		this.checkoutDetail = checkoutDetail;
	}

	public RolesEntity getRole() {
		return role;
	}

	public void setRole(RolesEntity role) {
		this.role = role;
	}

	public List<CartEntity> getListCart() {
		return listCart;
	}

	public void setListCart(List<CartEntity> listCart) {
		this.listCart = listCart;
	}

	public RolesEntity getRoleId() {
		return role;
	}

	public void setRoleId(RolesEntity role) {
		this.role = role;
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
}
