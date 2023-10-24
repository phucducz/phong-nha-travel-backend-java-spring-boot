package phongnhatravelbackendver2.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import phongnhatravelbackendver2.dto.TopicsDTO;
import phongnhatravelbackendver2.service.impl.TopicService;

@CrossOrigin
@RestController
public class TopicsAPI {
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/topics")
	public List<TopicsDTO> getList(@RequestParam(name = "ids", required = false) Long[] ids) {
		return topicService.getListTopicByIds(ids);
	}
}