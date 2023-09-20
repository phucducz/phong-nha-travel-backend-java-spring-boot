package com.phongnhatravel.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.phongnhatravel.dto.ToursDTO;
import com.phongnhatravel.entity.ToursEntity;
import com.phongnhatravel.service.TourService;

@CrossOrigin
@RestController
public class ToursAPI {
	@Autowired
	private TourService tourService;
	
//	@Autowired
//	private TourRepository tourRepository;
//	
//	@Autowired
//	private TourConverter tourConverter;

//	@GetMapping("/tours/{id}")
//	public TourViewsDTO getTour(@PathVariable Long id) {
//		return tourViewService.getTourById(id);
//	}

	@GetMapping("/tours")
//	public List<ToursEntity> getList() {
//		return tourService.getListTour();
//	}
	public List<ToursDTO> getList() {
		return tourService.getListTour();
	}

	@PostMapping("/tours")
	public ToursDTO createTour(@RequestBody ToursDTO tourModel) {
		return tourService.save(tourModel);
	}

	@PutMapping("/tours")
	public ToursDTO putTour(@RequestBody ToursDTO model) {
		return tourService.save(model);
	}

	@DeleteMapping("/tours/{id}")
	public Long deleteTour(@PathVariable Long id) {
		return id;
	}
}
