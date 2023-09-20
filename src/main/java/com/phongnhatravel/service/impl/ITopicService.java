package com.phongnhatravel.service.impl;

import java.util.List;

import com.phongnhatravel.entity.TopicsEntity;

public interface ITopicService {
	List<TopicsEntity> getListTopicByIds(Long[] ids);
}
