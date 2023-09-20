package com.phongnhatravel.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "checkout_details")
public class CheckoutDetailsEntity extends BaseEntity {
	@Column(name = "company_name")
	private String companyName;

	@Column
	private String country;

	@Column
	private String zipcode;

	@Column
	private String city;

	@Column
	private String note;

	@Column
	private String apartment;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "full_name")
	private String fullName;

	@Column
	private String address;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "email_address")
	private String emailAddress;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "payment_method_id")
	private PaymentMethodsEntity paymentMethod;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private UsersEntity user;
	
	@ManyToMany(mappedBy = "listCheckoutDetail")
	private List<CartEntity> listCart = new ArrayList<CartEntity>();

	public UsersEntity getUser() {
		return user;
	}

	public void setUser(UsersEntity user) {
		this.user = user;
	}

	public List<CartEntity> getListCart() {
		return listCart;
	}

	public void setListCart(List<CartEntity> listCart) {
		this.listCart = listCart;
	}

	public PaymentMethodsEntity getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethodsEntity paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
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

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public PaymentMethodsEntity getPaymentMethodId() {
		return paymentMethod;
	}

	public void setPaymentMethodId(PaymentMethodsEntity paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public UsersEntity getUserId() {
		return user;
	}

	public void setUserId(UsersEntity user) {
		this.user = user;
	}
}
