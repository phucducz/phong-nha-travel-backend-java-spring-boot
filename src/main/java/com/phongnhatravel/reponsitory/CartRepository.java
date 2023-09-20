package com.phongnhatravel.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phongnhatravel.entity.CartEntity;

public interface CartRepository extends JpaRepository<CartEntity, Long> {
	List<CartEntity> findAll();
}
