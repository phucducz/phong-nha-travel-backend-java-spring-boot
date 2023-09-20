package com.phongnhatravel.service.impl;

import java.util.List;

import com.phongnhatravel.dto.TourViewsDTO;

public interface ITourViewService {
	List<TourViewsDTO> getListTour();
	
	TourViewsDTO getTourById(Long id);
}
