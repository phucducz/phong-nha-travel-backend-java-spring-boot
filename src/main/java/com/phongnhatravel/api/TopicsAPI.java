package com.phongnhatravel.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.phongnhatravel.converter.TopicConverter;
import com.phongnhatravel.dto.TopicsDTO;
import com.phongnhatravel.service.TopicService;

@CrossOrigin
@RestController
public class TopicsAPI {
	@Autowired
	private TopicService topicService;

	@Autowired TopicConverter topicConverter;
	
	@GetMapping("/topics")
	public List<TopicsDTO> getList(@RequestParam(name = "ids", required = false) Long[] ids) {
		return topicConverter.toListDTO(topicService.getListTopicByIds(ids));
	}
}
