package phongnhatravelbackendver2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import phongnhatravelbackendver2.entity.ImagesEntity;
import phongnhatravelbackendver2.repository.ImageRepository;
import phongnhatravelbackendver2.service.IImageService;

public class ImageService implements IImageService {
	@Autowired 
	private ImageRepository imageRepository;

	public List<ImagesEntity> getListImageByIds(Long[] ids) {
		List<ImagesEntity> listEntity = new ArrayList<ImagesEntity>();
		
		for(Long id:ids)
			listEntity.add(imageRepository.findOneById(id));
		
		return null;
	}

}
