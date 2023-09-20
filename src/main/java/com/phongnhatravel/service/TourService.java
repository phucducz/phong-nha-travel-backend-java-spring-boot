package com.phongnhatravel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phongnhatravel.converter.TourConverter;
import com.phongnhatravel.dto.ToursDTO;
import com.phongnhatravel.entity.CategoriesEntity;
import com.phongnhatravel.entity.TopicsEntity;
import com.phongnhatravel.entity.ToursEntity;
import com.phongnhatravel.reponsitory.TourRepository;
import com.phongnhatravel.service.impl.ITourService;

@Service
public class TourService implements ITourService {
	@Autowired
	private TourRepository tourRepository;

	@Autowired
	private CategoryService categoryService;
	@Autowired
	private TopicService topicService;

	@Autowired
	private TourConverter tourConverter;

	@Override
	public ToursDTO save(ToursDTO tour) {
		Long[] categoryIds = tour.getCategoryIds();
		Long[] topicIds = tour.getTopicIds();

		ToursEntity toursEntity = new ToursEntity();

		if (tour.getId() != null) {
			ToursEntity oldTourEntity = tourRepository.findOneById(tour.getId());
			toursEntity = tourConverter.toEntity(tour, oldTourEntity);
		} else
			toursEntity = tourConverter.toEntity(tour);

		List<CategoriesEntity> listCategory = categoryService.getListCategoryByIds(categoryIds);
		List<TopicsEntity> listTopic = topicService.getListTopicByIds(topicIds);

		toursEntity.setListCategories(listCategory);
		toursEntity.setListTopics(listTopic);

		toursEntity = tourRepository.save(toursEntity);

		return tourConverter.toDTO(toursEntity, categoryIds, topicIds);
	}

	@Override
	public void delete(Long id) {

	}

	@Override
	public ToursDTO getTour(Long id) {
//		ToursEntity toursEntity = new ToursEntity();
//		toursEntity = tourRepository.findOneById(id);
//
//		return tourConverter.toDTO(toursEntity);

		return null;
	}

	@Override
//	public List<ToursEntity> getListTour() {
//		return tourRepository.findAll();
//	}
	public List<ToursDTO> getListTour() {
		List<ToursEntity> listEntity = tourRepository.findAll();
		List<ToursDTO> listDTO = new ArrayList<ToursDTO>();

		for (ToursEntity tourEntity : listEntity) {
			int categoryIndex = 0;
			int topicIndex = 0;
			
			Long[] categoryIds = new Long[tourEntity.getListCategories().size()];
			Long[] topicIds = new Long[tourEntity.getListTopics().size()];
			
			ToursEntity newEntity = tourEntity;

			if (categoryIds.length != 0)
				for (CategoriesEntity categoryEntity : newEntity.getListCategories()) {					
					Long id = categoryEntity.getId();
					categoryIds[categoryIndex] = id;
					categoryIndex++;
				}

			if (topicIds.length != 0)
				for (TopicsEntity topicEntity : newEntity.getListTopics()) {
					topicIds[topicIndex] = topicEntity.getId();
					topicIndex++;
				}

			listDTO.add(tourConverter.toDTO(newEntity, categoryIds, topicIds));
		}

		return listDTO;
	}
}
