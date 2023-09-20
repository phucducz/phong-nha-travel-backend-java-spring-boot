package com.phongnhatravel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phongnhatravel.converter.TourCategoryConverter;
import com.phongnhatravel.dto.TourCategoriesDTO;
import com.phongnhatravel.entity.TourCategoriesEntity;
import com.phongnhatravel.reponsitory.TourCategoryRepository;
import com.phongnhatravel.service.impl.ITourCategoryService;

@Service
public class TourCategoryService implements ITourCategoryService {

	@Autowired
	TourCategoryRepository tourCategoryRepository;

	@Autowired
	TourCategoryConverter tourCategoryConverter;

	@Override
	public List<TourCategoriesDTO> getListTourCategoryById(Long id) {
		List<TourCategoriesEntity> listEntity = tourCategoryRepository.findAllByTourId(id);

		return tourCategoryConverter.toListDTO(listEntity);
	}

	@Override
	public TourCategoriesDTO getTourCategoryById(Long id) {
		TourCategoriesEntity tourCategoryEntity = tourCategoryRepository.findOneByTourId(id);

		return tourCategoryConverter.toDTO(tourCategoryEntity);
	}

	@Override
	public List<TourCategoriesDTO> getListTourCategory() {
		List<TourCategoriesEntity> listEntity = tourCategoryRepository.findAll();

		return tourCategoryConverter.toListDTO(listEntity);
	}

}
