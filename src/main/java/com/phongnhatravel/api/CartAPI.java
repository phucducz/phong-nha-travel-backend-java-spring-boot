package com.phongnhatravel.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phongnhatravel.dto.CartDTO;
import com.phongnhatravel.service.CartService;

@RestController
public class CartAPI {
	@Autowired
	private CartService cartService;
	
	@GetMapping("/cart")
	public List<CartDTO> getCart() {
		return cartService.get();
	}
}
