package phongnhatravelbackendver2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import phongnhatravelbackendver2.converter.CategoryConverter;
import phongnhatravelbackendver2.converter.ImageConverter;
import phongnhatravelbackendver2.converter.TopicConverter;
import phongnhatravelbackendver2.converter.TourConverter;
import phongnhatravelbackendver2.dto.ToursDTO;
import phongnhatravelbackendver2.entity.CategoriesEntity;
import phongnhatravelbackendver2.entity.ImagesEntity;
import phongnhatravelbackendver2.entity.TopicsEntity;
import phongnhatravelbackendver2.entity.ToursEntity;
import phongnhatravelbackendver2.entity.TypesEntity;
import phongnhatravelbackendver2.repository.ImageRepository;
import phongnhatravelbackendver2.repository.TourRepository;
import phongnhatravelbackendver2.service.ITourService;

@Service
public class TourService implements ITourService {
	@Autowired
	private TourRepository tourRepository;
	@Autowired
	private ImageRepository imageRepository;

	@Autowired
	private CategoryService categoryService;
	@Autowired
	private TopicService topicService;
	@Autowired
	private TypeService typeService;

	@Autowired
	private TourConverter tourConverter;
	@Autowired
	private ImageConverter imageConverter;
	@Autowired
	private TopicConverter topicConverter;
	@Autowired
	private CategoryConverter categoryConverter;

	public ToursDTO save(ToursDTO tour) {
		Long[] categoryIds = tour.getCategoryIds();
		Long[] topicIds = tour.getTopicIds();
		
		ToursEntity tourEntity = new ToursEntity();

		if (tour.getId() != null) {
			ToursEntity oldTourEntity = tourRepository.findOneById(tour.getId());
			tourEntity = tourConverter.toEntity(tour, oldTourEntity);
		} else
			tourEntity = tourConverter.toEntity(tour);

		List<CategoriesEntity> listCategory = categoryService.getListCategoryEntityByIds(categoryIds);
		List<TopicsEntity> listTopic = topicService.getListTopicEntityByIds(topicIds);
		
		tourEntity.setListCategory(listCategory);
		tourEntity.setListTopic(listTopic);

		TypesEntity typeEntity = typeService.getTypeByTitle(tour.getType());
		tourEntity.setType(typeEntity);

		tourEntity = tourRepository.save(tourEntity);

		List<ImagesEntity> listImage = new ArrayList<ImagesEntity>();

		for (ImagesEntity entity : imageConverter.toListEntity(tour.getListImage())) {
			ImagesEntity imageEntity = new ImagesEntity();

			imageEntity.setImage(entity.getImage());
			imageEntity.setMain(entity.isMain());
			imageEntity.setTour(tourEntity);
			
			listImage.add(imageEntity);
		}

		imageRepository.saveAll(listImage);

		tourEntity.setListImage(listImage);

		return tourConverter.toDTO(tourEntity, categoryIds, topicIds);
	}

	public List<ToursDTO> getTour(Long id) {
		ToursEntity tourEntity = tourRepository.findOneById(id);
		List<ToursDTO> listDTO = new ArrayList<ToursDTO>();

		listDTO.add(tourConverter.toDTO(tourEntity, topicConverter.toLongIds(tourEntity.getListTopic()),
				categoryConverter.toLongIds(tourEntity.getListCategory())));

		return listDTO;
	}

	public List<ToursDTO> getListTourByCategoryCode(String categoryCode) {

		return null;
	}

	public List<ToursDTO> getListTour() {
		List<ToursEntity> listEntity = tourRepository.findAll();
		List<ToursDTO> listDTO = new ArrayList<ToursDTO>();

		for (ToursEntity tourEntity : listEntity) {
			int categoryIndex = 0;
			int topicIndex = 0;

			Long[] categoryIds = new Long[tourEntity.getListCategory().size()];
			Long[] topicIds = new Long[tourEntity.getListTopic().size()];

			ToursEntity newEntity = tourEntity;

			if (categoryIds.length != 0)
				for (CategoriesEntity categoryEntity : newEntity.getListCategory()) {
					categoryIds[categoryIndex] = categoryEntity.getId();
					categoryIndex++;
				}

			if (topicIds.length != 0)
				for (TopicsEntity topicEntity : newEntity.getListTopic()) {
					topicIds[topicIndex] = topicEntity.getId();
					topicIndex++;
				}

			listDTO.add(tourConverter.toDTO(newEntity, categoryIds, topicIds));
		}

		return listDTO;
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
}
