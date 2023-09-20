package com.phongnhatravel.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "categories")
public class CategoriesEntity extends BaseEntity {
	@Column
	private String title;
	
	@ManyToMany(mappedBy = "listCategories")
	@JsonBackReference
	private List<ToursEntity> listTour = new ArrayList<ToursEntity>();

	public List<ToursEntity> getListTour() {
		return listTour;
	}

	public void setListTour(List<ToursEntity> listTour) {
		this.listTour = listTour;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
