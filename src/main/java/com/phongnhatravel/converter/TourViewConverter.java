package com.phongnhatravel.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.phongnhatravel.dto.TourViewsDTO;
import com.phongnhatravel.entity.TourViewsEntity;

@Component
public class TourViewConverter {
	public TourViewsDTO toDTO(TourViewsEntity entity) {
		TourViewsDTO dto = new TourViewsDTO();

		dto.setId(entity.getId());
		dto.setDescription(entity.getDescription());
		dto.setImage(entity.getImage());
		dto.setName(entity.getName());
		dto.setPriceAdult(entity.getPriceAdult());
		dto.setPriceChildren(entity.getPriceChildren());
		dto.setQuantity(entity.getQuantity());
		dto.setTopicId(entity.getTopicId());
		dto.setType(entity.getType());

		return dto;
	}

	public List<TourViewsDTO> toListDTO(List<TourViewsEntity> listEntity) {
		List<TourViewsDTO> listTourViewDTO = new ArrayList<TourViewsDTO>();

		for (TourViewsEntity entity : listEntity)
			listTourViewDTO.add(toDTO(entity));

		return listTourViewDTO;
	}
}
