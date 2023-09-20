package com.phongnhatravel.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phongnhatravel.entity.TopicsEntity;

public interface TopicRepository extends JpaRepository<TopicsEntity, Long>{
	List<TopicsEntity> findByTitle(String title);

	TopicsEntity findOneById(Long id);
	
	List<TopicsEntity> findAll();
}
