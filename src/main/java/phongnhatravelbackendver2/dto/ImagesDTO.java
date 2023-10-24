package phongnhatravelbackendver2.dto;

public class ImagesDTO {
	private Long id;
	private String image;
	private boolean isMain;
	private Long tourId;

	private ToursDTO tour;

	public Long getTourId() {
		return tourId;
	}

	public void setTourId(Long tourId) {
		this.tourId = tourId;
	}

	public ToursDTO getTour() {
		return tour;
	}

	public void setTour(ToursDTO tour) {
		this.tour = tour;
	}

	public boolean isMain() {
		return isMain;
	}

	public void setMain(boolean isMain) {
		this.isMain = isMain;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}