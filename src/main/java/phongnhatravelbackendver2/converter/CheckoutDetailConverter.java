package phongnhatravelbackendver2.converter;

import org.springframework.stereotype.Component;

import phongnhatravelbackendver2.dto.CheckoutDetailsDTO;
import phongnhatravelbackendver2.entity.CheckoutDetailsEntity;

@Component
public class CheckoutDetailConverter {
	public CheckoutDetailsDTO toDTO(CheckoutDetailsEntity entity) {
		CheckoutDetailsDTO dto = new CheckoutDetailsDTO();
		
		dto.setId(entity.getId());
		dto.setCompanyName(entity.getCompanyName());
		dto.setCountry(entity.getCountry());
		dto.setAddress(entity.getAddress());
		dto.setZipcode(entity.getZipcode());
		dto.setCity(entity.getCity());
		dto.setNote(entity.getNote());
		dto.setFirstName(entity.getFirstName());
		dto.setLastName(entity.getLastName());
		dto.setFullName(entity.getFullName());
		dto.setApartment(entity.getApartment());
		dto.setPhoneNumber(entity.getPhoneNumber());
		dto.setEmailAddress(entity.getEmailAddress());
		
		dto.setUserId(entity.getUser().getId());
		
		return dto;
	}
	
	public CheckoutDetailsEntity toEntity(CheckoutDetailsDTO dto) {
		CheckoutDetailsEntity entity = new CheckoutDetailsEntity();
		
		entity.setCompanyName(dto.getCompanyName());
		entity.setCountry(dto.getCountry());
		entity.setAddress(dto.getAddress());
		entity.setZipcode(dto.getZipcode());
		entity.setCity(dto.getCity());
		entity.setNote(dto.getNote());
		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setFullName(dto.getFullName());
		entity.setApartment(dto.getApartment());
		entity.setPhoneNumber(dto.getPhoneNumber());
		entity.setEmailAddress(dto.getEmailAddress());
		
		return entity;
	}
	
	public CheckoutDetailsEntity toEntity(CheckoutDetailsEntity oldEntity, CheckoutDetailsDTO newDTO) {
		oldEntity.setCompanyName(newDTO.getCompanyName());
		oldEntity.setCountry(newDTO.getCountry());
		oldEntity.setAddress(newDTO.getAddress());
		oldEntity.setZipcode(newDTO.getZipcode());
		oldEntity.setCity(newDTO.getCity());
		oldEntity.setNote(newDTO.getNote());
		oldEntity.setFirstName(newDTO.getFirstName());
		oldEntity.setLastName(newDTO.getLastName());
		oldEntity.setFullName(newDTO.getFullName());
		oldEntity.setApartment(newDTO.getApartment());
		oldEntity.setPhoneNumber(newDTO.getPhoneNumber());
		oldEntity.setEmailAddress(newDTO.getEmailAddress());
		
		return oldEntity;
	}
}
