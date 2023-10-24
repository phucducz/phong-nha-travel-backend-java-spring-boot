package phongnhatravelbackendver2.dto;

import java.util.List;

public class TopicsDTO {
	private Long id;
	private String title;
	
	private List<ToursDTO> listTour;

	public List<ToursDTO> getListTour() {
		return listTour;
	}

	public void setListTour(List<ToursDTO> listTour) {
		this.listTour = listTour;
	}

	public Long getId() {
		return id;
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
}

