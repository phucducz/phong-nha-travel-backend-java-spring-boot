package com.phongnhatravel.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.phongnhatravel.dto.CartDTO;
import com.phongnhatravel.entity.CartEntity;

@Component
public class CartConverter {
	public CartDTO toDTO(CartEntity entity) {
		CartDTO dto = new CartDTO();
		
		dto.setId(entity.getId());
		dto.setBookingDate(entity.getBookingDate());
		dto.setQuantity(entity.getQuantity());
		
		return dto;
	}
	
	public List<CartDTO> toListDTO(List<CartEntity> listEntity) {
		List<CartDTO> listDTO = new ArrayList<CartDTO>();
		
		for(CartEntity entity:listEntity)
			listDTO.add(toDTO(entity));
		
		return listDTO;
	}
}
