package phongnhatravelbackendver2.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import phongnhatravelbackendver2.dto.ImagesDTO;
import phongnhatravelbackendver2.entity.ImagesEntity;

@Component
public class ImageConverter {
	@Autowired
	private TourConverter tourConverter;

	public ImagesDTO toDTO(ImagesEntity entity) {
		ImagesDTO dto = new ImagesDTO();

		dto.setId(entity.getId());
		dto.setImage(entity.getImage());
		dto.setMain(entity.isMain());
		dto.setTourId(entity.getTour().getId());

		return dto;
	}

	public List<ImagesDTO> toListDTO(List<ImagesEntity> listEntity) {
		List<ImagesDTO> listDTO = new ArrayList<ImagesDTO>();

		for (ImagesEntity entity : listEntity)
			listDTO.add(toDTO(entity));

		return listDTO;
	}

	public ImagesEntity toEntity(ImagesDTO dto) {
		ImagesEntity entity = new ImagesEntity();

		entity.setImage(dto.getImage());
		entity.setMain(dto.isMain());

		if (dto.getTour() != null)
			entity.setTour(tourConverter.toEntity(dto.getTour()));

		return entity;
	}

	public List<ImagesEntity> toListEntity(List<ImagesDTO> listDTO) {
		List<ImagesEntity> listEntity = new ArrayList<ImagesEntity>();

		for (ImagesDTO dto : listDTO)
			listEntity.add(toEntity(dto));

		return listEntity;
	}
}
