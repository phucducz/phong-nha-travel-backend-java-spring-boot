package com.phongnhatravel.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phongnhatravel.entity.ToursEntity;

public interface TourRepository extends JpaRepository<ToursEntity, Long> {
	ToursEntity findOneById(Long id);
	
	List<ToursEntity> findAll();
}
