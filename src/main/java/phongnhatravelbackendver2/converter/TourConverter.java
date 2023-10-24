package phongnhatravelbackendver2.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import phongnhatravelbackendver2.dto.ToursDTO;
import phongnhatravelbackendver2.entity.ToursEntity;

@Component
public class TourConverter {
	@Autowired
	private ImageConverter imageConverter;
	@Autowired
	private CategoryConverter categoryConverter;
	@Autowired
	private TopicConverter topicConverter;
	
	public Long[] toLongIds(List<ToursEntity> listEntity) {
		Long[] ids = new Long[listEntity.size()];
		int index = 0;
		
		for(ToursEntity entity:listEntity) {
			ids[index] = entity.getId();
			index++;
		}
		
		return ids;
	}
	
	public ToursEntity toEntity(ToursDTO dto) {
		ToursEntity entity = new ToursEntity();

		entity.setName(dto.getName());
		entity.setDescription(dto.getDescription());
		entity.setEndDate(dto.getEndDate());
		entity.setStartDate(dto.getStartDate());
		entity.setPriceAdult(dto.getPriceAdult());
		entity.setPriceChildren(dto.getPriceChildren());

		return entity;
	}

	public ToursDTO toDTO(ToursEntity entity, Long[] categoryIds, Long[] topicIds) {
		ToursDTO dto = new ToursDTO();

		if (entity.getId() != null)
			dto.setId(entity.getId());

		dto.setName(entity.getName());
		dto.setDescription(entity.getDescription());
		dto.setEndDate(entity.getEndDate());
		dto.setStartDate(entity.getStartDate());
		dto.setPriceAdult(entity.getPriceAdult());
		dto.setPriceChildren(entity.getPriceChildren());

		dto.setCategoryIds(categoryIds);
		dto.setTopicIds(topicIds);
		dto.setListImage(imageConverter.toListDTO(entity.getListImage()));
		dto.setType(entity.getType().getCode());

		return dto;
	}

	public ToursEntity toEntity(ToursDTO dto, ToursEntity entity) {
		entity.setName(dto.getName());
		entity.setDescription(dto.getDescription());
		entity.setEndDate(dto.getEndDate());
		entity.setStartDate(dto.getStartDate());
		entity.setPriceAdult(dto.getPriceAdult());
		entity.setPriceChildren(dto.getPriceChildren());

		return entity;
	}

	public List<ToursDTO> toListDTO(List<ToursEntity> listEntity) {
		List<ToursDTO> listDTO = new ArrayList<ToursDTO>();

		for(ToursEntity entity:listEntity) {
			Long[] categoryIds = categoryConverter.toLongIds(entity.getListCategory());
			Long[] topicIds = topicConverter.toLongIds(entity.getListTopic());
			
			listDTO.add(toDTO(entity, categoryIds, topicIds));
		}
		
		return listDTO;
	}
	
	public List<ToursEntity> toListEntity(List<ToursDTO> listDTO) {
		List<ToursEntity> listEntity = new ArrayList<ToursEntity>();
		
		for(ToursDTO dto:listDTO)
			listEntity.add(toEntity(dto));
		
		return listEntity;
	}
}
