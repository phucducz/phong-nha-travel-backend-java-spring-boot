package phongnhatravelbackendver2.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import phongnhatravelbackendver2.dto.CategoriesDTO;
import phongnhatravelbackendver2.entity.CategoriesEntity;
import phongnhatravelbackendver2.entity.ToursEntity;

@Component
public class CategoryConverter {
	@Autowired
	private TourConverter tourConverter;

	public Long[] toLongIds(List<CategoriesEntity> listEntity) {
		Long[] ids = new Long[listEntity.size()];
		int index = 0;

		for (CategoriesEntity entity : listEntity) {
			ids[index] = entity.getId();
			index++;
		}

		return ids;
	}

	public CategoriesDTO toDTO(CategoriesEntity entity) {
		CategoriesDTO dto = new CategoriesDTO();
		Long[] tourIds = tourConverter.toLongIds(entity.getListTour());
		List<ToursEntity> listTourEntity = entity.getListTour();

		dto.setTitle(entity.getTitle());
		dto.setId(entity.getId());
		dto.setCode(entity.getCode());

		dto.setTourIds(tourIds);

		dto.setListTour(tourConverter.toListDTO(listTourEntity));

		return dto;
	}

	public List<CategoriesDTO> toListDTO(List<CategoriesEntity> listEntity) {
		List<CategoriesDTO> listDTO = new ArrayList<CategoriesDTO>();

		for (CategoriesEntity entity : listEntity)
			listDTO.add(toDTO(entity));

		return listDTO;
	}

	public CategoriesEntity toEntity(CategoriesDTO dto) {
		CategoriesEntity entity = new CategoriesEntity();

		entity.setTitle(dto.getTitle());
		entity.setCode(dto.getCode());
		entity.setListTour(tourConverter.toListEntity(dto.getListTour()));

		return entity;
	}

	public List<CategoriesEntity> toListEntity(List<CategoriesDTO> listDTO) {
		List<CategoriesEntity> listEntity = new ArrayList<CategoriesEntity>();

		for (CategoriesDTO dto : listDTO)
			listEntity.add(toEntity(dto));

		return listEntity;
	}
}
