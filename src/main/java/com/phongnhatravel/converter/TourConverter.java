package com.phongnhatravel.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.phongnhatravel.dto.ToursDTO;
import com.phongnhatravel.entity.ToursEntity;

@Component
public class TourConverter {
	public ToursEntity toEntity(ToursDTO dto) {
		ToursEntity entity = new ToursEntity();

		entity.setName(dto.getName());
		entity.setDescription(dto.getDescription());
		entity.setEndDate(dto.getEndDate());
		entity.setStartDate(dto.getStartDate());
		entity.setPriceAdult(dto.getPriceAdult());
		entity.setPriceChildren(dto.getPriceChildren());

		return entity;
	}

	public ToursDTO toDTO(ToursEntity entity, Long[] categoryIds, Long[] topicIds) {
		ToursDTO dto = new ToursDTO();

		if (entity.getId() != null)
			dto.setId(entity.getId());

		dto.setName(entity.getName());
		dto.setDescription(entity.getDescription());
		dto.setEndDate(entity.getEndDate());
		dto.setStartDate(entity.getStartDate());
		dto.setPriceAdult(entity.getPriceAdult());
		dto.setPriceChildren(entity.getPriceChildren());

		dto.setCategoryIds(categoryIds);
		dto.setTopicIds(topicIds);

		return dto;
	}

	public ToursEntity toEntity(ToursDTO dto, ToursEntity entity) {
		entity.setName(dto.getName());
		entity.setDescription(dto.getDescription());
		entity.setEndDate(dto.getEndDate());
		entity.setStartDate(dto.getStartDate());
		entity.setPriceAdult(dto.getPriceAdult());
		entity.setPriceChildren(dto.getPriceChildren());

		return entity;
	}

	public List<ToursDTO> toListDTO(List<ToursEntity> listEntity, Long[] categoryIds, Long[] topicIds) {
		List<ToursDTO> listDTO = new ArrayList<ToursDTO>();
		
		for(ToursEntity entity:listEntity)
			listDTO.add(toDTO(entity, categoryIds, topicIds));
		
		return listDTO;
	}
}
