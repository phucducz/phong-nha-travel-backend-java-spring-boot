package phongnhatravelbackendver2.service;

import java.util.List;

import phongnhatravelbackendver2.dto.ToursDTO;

public interface ITourService {
	ToursDTO save(ToursDTO tour);
	
	List<ToursDTO> getTour(Long id);
	
	List<ToursDTO> getListTour();
	
	List<ToursDTO> getListTourByCategoryCode(String categoryCode);
	
	void delete(Long id);
}