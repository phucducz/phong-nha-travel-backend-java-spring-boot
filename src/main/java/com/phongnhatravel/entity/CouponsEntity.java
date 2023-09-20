package com.phongnhatravel.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "coupons")
public class CouponsEntity extends BaseEntity {
	@Column
	private String code;

	@Column
	private float value;
	
	@OneToMany(mappedBy = "coupon", fetch = FetchType.LAZY)
	private List<CartEntity> listCart;
	
	public List<CartEntity> getListCart() {
		return listCart;
	}

	public void setListCart(List<CartEntity> listCart) {
		this.listCart = listCart;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
}
