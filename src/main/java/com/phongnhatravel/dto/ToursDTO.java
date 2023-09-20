package com.phongnhatravel.dto;

import java.time.LocalDate;

public class ToursDTO {
	private Long id;
	private String name;
	private String description;
	private float priceAdult;
	private float priceChildren;
	private LocalDate startDate;
	private LocalDate endDate;
	
	private Long[] categoryIds;
	private Long[] topicIds;
	private Long[] cartIds;

	public Long[] getCategoryIds() {
		return categoryIds;
	}

	public void setCategoryIds(Long[] categoryIds) {
		this.categoryIds = categoryIds;
	}

	public Long[] getTopicIds() {
		return topicIds;
	}

	public void setTopicIds(Long[] topicIds) {
		this.topicIds = topicIds;
	}

	public Long[] getCartIds() {
		return cartIds;
	}

	public void setCartIds(Long[] cartIds) {
		this.cartIds = cartIds;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
