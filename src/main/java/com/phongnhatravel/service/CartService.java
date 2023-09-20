package com.phongnhatravel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phongnhatravel.converter.CartConverter;
import com.phongnhatravel.dto.CartDTO;
import com.phongnhatravel.entity.CartEntity;
import com.phongnhatravel.reponsitory.CartRepository;
import com.phongnhatravel.service.impl.ICartService;

@Service
public class CartService implements ICartService {
	
	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private CartConverter cartConverter;

	@Override
	public List<CartDTO> get() {
		List<CartEntity> cartEntity = cartRepository.findAll();
		
		return cartConverter.toListDTO(cartEntity);
	}
	
}
