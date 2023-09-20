package com.phongnhatravel.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "payment_methods")
public class PaymentMethodsEntity {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@OneToMany(mappedBy = "paymentMethod", fetch = FetchType.LAZY)
	private List<CheckoutDetailsEntity> listCheckoutDetail;

	public Long getId() {
		return id;
	}

	public List<CheckoutDetailsEntity> getListCheckoutDetail() {
		return listCheckoutDetail;
	}

	public void setListCheckoutDetail(List<CheckoutDetailsEntity> listCheckoutDetail) {
		this.listCheckoutDetail = listCheckoutDetail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
