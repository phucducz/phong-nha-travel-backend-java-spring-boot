package phongnhatravelbackendver2.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import phongnhatravelbackendver2.converter.ImageConverter;
import phongnhatravelbackendver2.dto.ImagesDTO;
import phongnhatravelbackendver2.entity.ImagesEntity;
import phongnhatravelbackendver2.repository.ImageRepository;

@RestController
public class ImagesAPI {
	@Autowired
	private ImageRepository imageRepository;
	@Autowired
	private ImageConverter imageConverter;
	
	@PostMapping("/images")
	public ImagesEntity save(@RequestBody ImagesDTO imageModel) {
		return imageRepository.save(imageConverter.toEntity(imageModel));
	}
}
