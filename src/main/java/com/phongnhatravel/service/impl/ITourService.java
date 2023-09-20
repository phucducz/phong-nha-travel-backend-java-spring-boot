package com.phongnhatravel.service.impl;

import java.util.List;

import com.phongnhatravel.dto.ToursDTO;
import com.phongnhatravel.entity.ToursEntity;

public interface ITourService {
	ToursDTO save(ToursDTO tour);
	
	ToursDTO getTour(Long id);
	
//	List<ToursEntity> getListTour();
	List<ToursDTO> getListTour();
	
	void delete(Long id);
}
