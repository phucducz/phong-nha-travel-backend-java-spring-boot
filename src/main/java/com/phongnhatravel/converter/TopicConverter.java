package com.phongnhatravel.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.phongnhatravel.dto.TopicsDTO;
import com.phongnhatravel.entity.TopicsEntity;

@Component
public class TopicConverter {
	public TopicsDTO toDTO(TopicsEntity entity) {
		TopicsDTO dto = new TopicsDTO();

		dto.setId(entity.getId());
		dto.setTitle(entity.getTitle());
//		dto.setListTour(entity.getListTour());

		return dto;
	}

	public List<TopicsDTO> toListDTO(List<TopicsEntity> listEntity) {
		List<TopicsDTO> listDTO = new ArrayList<TopicsDTO>();

		for (TopicsEntity entity : listEntity)
			listDTO.add(toDTO(entity));

		return listDTO;
	}

	public TopicsEntity toEntity(TopicsDTO dto) {
		TopicsEntity entity = new TopicsEntity();

		entity.setTitle(dto.getTitle());
//		entity.setListTour(dto.getListTour());

		return entity;
	}

	public List<TopicsEntity> toListEntity(List<TopicsDTO> listDTO) {
		List<TopicsEntity> listEntity = new ArrayList<TopicsEntity>();

		for (TopicsDTO dto : listDTO)
			listEntity.add(toEntity(dto));

		return listEntity;
	}
}
