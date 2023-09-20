package com.phongnhatravel.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phongnhatravel.entity.TourViewsEntity;

public interface TourViewRepository extends JpaRepository<TourViewsEntity, Long> {
	TourViewsEntity findOneById(Long id);
}
