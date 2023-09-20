package com.phongnhatravel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phongnhatravel.entity.TopicsEntity;
import com.phongnhatravel.reponsitory.TopicRepository;
import com.phongnhatravel.service.impl.ITopicService;

@Service
public class TopicService implements ITopicService {
	@Autowired
	private TopicRepository topicRepository;

	@Override
	public List<TopicsEntity> getListTopicByIds(Long[] ids) {
		List<TopicsEntity> listEntity = new ArrayList<TopicsEntity>();

		if (ids != null)
			for (Long id : ids)
				listEntity.add(topicRepository.findOneById(id));
		else
			listEntity = topicRepository.findAll();

		return listEntity;
	}
}
