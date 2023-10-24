package phongnhatravelbackendver2.service;

import java.util.List;

import phongnhatravelbackendver2.dto.TopicsDTO;
import phongnhatravelbackendver2.entity.TopicsEntity;

public interface ITopicService {
	List<TopicsDTO> getListTopicByIds(Long[] ids);
	
	
	List<TopicsEntity> getListTopicEntityByIds(Long[] ids);
}