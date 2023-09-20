package com.phongnhatravel.dto;

public class ImagesDTO {
	private Long id;
	private String image;
	private boolean isMain;
	private ToursDTO tour;

	public ToursDTO getTour() {
		return tour;
	}

	public void setTour(ToursDTO tour) {
		this.tour = tour;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public boolean isMain() {
		return isMain;
	}

	public void setMain(boolean isMain) {
		this.isMain = isMain;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getToursId() {
		return toursId;
	}

	public void setToursId(int toursId) {
		this.toursId = toursId;
	}

	private int toursId;
}
