package com.phongnhatravel.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.phongnhatravel.dto.TourCategoriesDTO;
import com.phongnhatravel.entity.TourCategoriesEntity;

@Component
public class TourCategoryConverter {
	public TourCategoriesDTO toDTO(TourCategoriesEntity entity) {
		TourCategoriesDTO dto = new TourCategoriesDTO();
		
		dto.setCategoryId(entity.getCategoryId());
		dto.setTourId(entity.getTourId());
		
		return dto;
	}
	
	public List<TourCategoriesDTO> toListDTO(List<TourCategoriesEntity> listEntity) {
		List<TourCategoriesDTO> listDTO = new ArrayList<TourCategoriesDTO>();
		
		for(TourCategoriesEntity entity:listEntity)
			listDTO.add(toDTO(entity)); 
		
		return listDTO;
	}
}
