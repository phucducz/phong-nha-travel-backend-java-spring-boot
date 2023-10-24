package phongnhatravelbackendver2.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import phongnhatravelbackendver2.dto.CartDTO;
import phongnhatravelbackendver2.entity.CartEntity;

@Component
public class CartConverter {
	@Autowired
	private TourConverter tourConverter;
	@Autowired
	private TopicConverter topicConverter;
	@Autowired
	private CategoryConverter categoryConverter;
	@Autowired
	private CheckoutConverter checkoutConverter;

	public CartDTO toDTO(CartEntity entity) {
		CartDTO dto = new CartDTO();

		dto.setBookingDate(entity.getBookingDate());
		dto.setId(entity.getId());
		dto.setQuantity(entity.getQuantity());

		if (entity.getCheckout() != null)
			dto.setCheckout(checkoutConverter.toDTO(entity.getCheckout()));

		dto.setTour(
				tourConverter.toDTO(entity.getTour(), categoryConverter.toLongIds(entity.getTour().getListCategory()),
						topicConverter.toLongIds(entity.getTour().getListTopic())));

		return dto;
	}

	public List<CartDTO> toListDTO(List<CartEntity> listEntity) {
		List<CartDTO> listDTO = new ArrayList<CartDTO>();

		for (CartEntity entity : listEntity)
			listDTO.add(toDTO(entity));

		return listDTO;
	}

	public CartEntity toEntity(CartDTO dto) {
		CartEntity entity = new CartEntity();

		entity.setBookingDate(dto.getBookingDate());
		entity.setQuantity(dto.getQuantity());
		entity.setCheckout(null);

		return entity;
	}
	
	public CartEntity toNewEntity(CartEntity oldEntity, CartEntity newEntity) {
		int quantity = oldEntity.getQuantity() + newEntity.getQuantity();
		
		if(quantity > 9)
			return null;
		
		oldEntity.setQuantity(quantity);
		
		return oldEntity;
	}

	public List<CartEntity> toListEntity(List<CartDTO> listDTO) {
		List<CartEntity> listEntity = new ArrayList<CartEntity>();

		for (CartDTO dto : listDTO)
			listEntity.add(toEntity(dto));

		return listEntity;
	}
}
