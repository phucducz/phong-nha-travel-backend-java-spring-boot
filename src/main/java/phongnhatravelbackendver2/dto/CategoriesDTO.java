package phongnhatravelbackendver2.dto;

import java.util.List;

public class CategoriesDTO {
	private Long id;
	private String title;
	private String code;
	
	private Long[] tourIds;
	private List<ToursDTO> listTour;

	public List<ToursDTO> getListTour() {
		return listTour;
	}

	public void setListTour(List<ToursDTO> listTour) {
		this.listTour = listTour;
	}

	public Long[] getTourIds() {
		return tourIds;
	}

	public void setTourIds(Long[] tourIds) {
		this.tourIds = tourIds;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
