package com.phongnhatravel.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.phongnhatravel.dto.CategoriesDTO;
import com.phongnhatravel.entity.CategoriesEntity;

@Component
public class CategoryConverter {
	public CategoriesDTO toDTO(CategoriesEntity entity) {
		CategoriesDTO dto = new CategoriesDTO();
		
		dto.setTitle(entity.getTitle());
		dto.setId(entity.getId());
		
		return dto;
	}
	
	public List<CategoriesDTO> toListDTO(List<CategoriesEntity> listEntity) {
		List<CategoriesDTO> listDTO = new ArrayList<CategoriesDTO>();
		
		for(CategoriesEntity entity:listEntity)
			listDTO.add(toDTO(entity));
		
		return listDTO;
	}
	
	public CategoriesEntity toEntity(CategoriesDTO dto) {
		CategoriesEntity entity = new CategoriesEntity();
		
		entity.setTitle(dto.getTitle());
//		entity.setListTour(dto.getListTour());
		
		return entity;
	}
	
	public List<CategoriesEntity> toListEntity(List<CategoriesDTO> listDTO) {
		List<CategoriesEntity> listEntity = new ArrayList<CategoriesEntity>();
		
		for(CategoriesDTO dto:listDTO)
			listEntity.add(toEntity(dto));
		
		return listEntity;
	}
}
