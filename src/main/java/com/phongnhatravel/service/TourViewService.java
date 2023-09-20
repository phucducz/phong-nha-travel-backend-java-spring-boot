package com.phongnhatravel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phongnhatravel.converter.TourViewConverter;
import com.phongnhatravel.dto.TourViewsDTO;
import com.phongnhatravel.entity.TourViewsEntity;
import com.phongnhatravel.reponsitory.TourViewRepository;
import com.phongnhatravel.service.impl.ITourViewService;

@Service
public class TourViewService implements ITourViewService {
	
	@Autowired
	private TourViewRepository tourViewRepository;
	
	@Autowired
	private TourViewConverter tourViewConverter;
	
	@Override
	public List<TourViewsDTO> getListTour() {
		List<TourViewsEntity> listTourViewEntity = tourViewRepository.findAll();
		
		return tourViewConverter.toListDTO(listTourViewEntity);
	}

	@Override
	public TourViewsDTO getTourById(Long id) {
		TourViewsEntity tourEntity = tourViewRepository.findOneById(id);
		
		return tourViewConverter.toDTO(tourEntity);
	}
}
