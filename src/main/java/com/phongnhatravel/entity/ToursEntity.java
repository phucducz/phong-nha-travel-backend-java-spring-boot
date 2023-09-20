package com.phongnhatravel.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "tours")
public class ToursEntity extends BaseEntity {
	@Column
	private String name;

	@Column(length = 1000)
	private String description;

	@Column(name = "price_adult")
	private float priceAdult;

	@Column(name = "price_children")
	private float priceChildren;

	@Column(name = "start_date")
	private LocalDate startDate;

	@Column(name = "end_date")
	private LocalDate endDate;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "tour_categories", joinColumns = @JoinColumn(name = "tour_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
	@JsonManagedReference
	private List<CategoriesEntity> listCategories;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "tour_topics", joinColumns = @JoinColumn(name = "tour_id"), inverseJoinColumns = @JoinColumn(name = "topic_id"))
	@JsonManagedReference
	private List<TopicsEntity> listTopics;

	@JsonIgnore
	@OneToMany(mappedBy = "tour", fetch = FetchType.LAZY)
	private List<CartEntity> listCart;

	public List<CartEntity> getListCart() {
		return listCart;
	}

	public void setListCart(List<CartEntity> listCart) {
		this.listCart = listCart;
	}

	public List<CategoriesEntity> getListCategories() {
		return listCategories;
	}

	public void setListCategories(List<CategoriesEntity> listCategories) {
		this.listCategories = listCategories;
	}

	public List<TopicsEntity> getListTopics() {
		return listTopics;
	}

	public void setListTopics(List<TopicsEntity> listTopics) {
		this.listTopics = listTopics;
	}

	public List<CategoriesEntity> getCategories() {
		return listCategories;
	}

	public void setCategories(List<CategoriesEntity> listCategories) {
		this.listCategories = listCategories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPriceAdult() {
		return priceAdult;
	}

	public void setPriceAdult(float priceAdult) {
		this.priceAdult = priceAdult;
	}

	public float getPriceChildren() {
		return priceChildren;
	}

	public void setPriceChildren(float priceChildren) {
		this.priceChildren = priceChildren;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
}
