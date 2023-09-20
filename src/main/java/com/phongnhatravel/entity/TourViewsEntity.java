package com.phongnhatravel.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

@Entity
@Immutable
@Table(name = "view_tours")
@Subselect("SELECT * FROM view_tours")
public class TourViewsEntity {
	@Id
	private Long id;
	private String description;
	private String name;
	private float priceAdult;
	private float priceChildren;
	private String image;
	private int quantity;
	private String type;
	private int topicId;

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

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public String getImage() {
		return image;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getType() {
		return type;
	}

	public int getTopicId() {
		return topicId;
	}
}
