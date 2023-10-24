package phongnhatravelbackendver2.service;

import java.util.List;

import phongnhatravelbackendver2.entity.ImagesEntity;

public interface IImageService {
	List<ImagesEntity> getListImageByIds(Long[] ids);
}
