package phongnhatravelbackendver2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import phongnhatravelbackendver2.converter.TopicConverter;
import phongnhatravelbackendver2.dto.TopicsDTO;
import phongnhatravelbackendver2.entity.TopicsEntity;
import phongnhatravelbackendver2.repository.TopicRepository;
import phongnhatravelbackendver2.service.ITopicService;

@Service
public class TopicService implements ITopicService {
	@Autowired
	private TopicRepository topicRepository;
	
	@Autowired
	private TopicConverter topicConverter;

	public List<TopicsDTO> getListTopicByIds(Long[] ids) {
		List<TopicsEntity> listEntity = new ArrayList<TopicsEntity>();

		if (ids != null)
			for (Long id : ids)
				listEntity.add(topicRepository.findOneById(id));
		else
			listEntity = topicRepository.findAll();

		return topicConverter.toListDTO(listEntity);
	}

	public List<TopicsEntity> getListTopicEntityByIds(Long[] ids) {
		List<TopicsEntity> listEntity = new ArrayList<TopicsEntity>();

		if (ids != null)
			for (Long id : ids)
				listEntity.add(topicRepository.findOneById(id));
		else
			listEntity = topicRepository.findAll();

		return listEntity;
	}
}

