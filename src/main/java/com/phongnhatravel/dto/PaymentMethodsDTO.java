package com.phongnhatravel.dto;

import java.util.List;

public class PaymentMethodsDTO {
	private int id;
	private String name;
	private List<PaymentMethodsDTO> listPaymentMethod;

	public List<PaymentMethodsDTO> getListPaymentMethod() {
		return listPaymentMethod;
	}

	public void setListPaymentMethod(List<PaymentMethodsDTO> listPaymentMethod) {
		this.listPaymentMethod = listPaymentMethod;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
}
