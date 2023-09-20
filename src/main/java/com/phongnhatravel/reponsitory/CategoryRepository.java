package com.phongnhatravel.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phongnhatravel.entity.CategoriesEntity;

public interface CategoryRepository extends JpaRepository<CategoriesEntity, Long> {
	List<CategoriesEntity> findByTitle(String title);
	
	List<CategoriesEntity> findAll();
	
	CategoriesEntity findOneById(Long id);
}
