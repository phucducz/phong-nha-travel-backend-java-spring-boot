package com.phongnhatravel.dto;

import java.util.List;

import com.phongnhatravel.entity.ToursEntity;

public class CategoriesDTO {
	private Long id;
	private String title;
	private List<ToursEntity> listTour;

	public List<ToursEntity> getListTour() {
		return listTour;
	}

	public void setListTour(List<ToursEntity> listTour) {
		this.listTour = listTour;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getId() {
		return id;
	}
}
