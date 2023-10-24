package phongnhatravelbackendver2.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import phongnhatravelbackendver2.dto.ToursDTO;
import phongnhatravelbackendver2.service.impl.TourService;

@CrossOrigin
@RestController
public class ToursAPI {
	@Autowired
	private TourService tourService;

	@GetMapping("/tours")
	public List<ToursDTO> getTour(
			@RequestParam(name = "id", required = false) Long id,
			@RequestParam(name = "categoryCode", required = false) String categoryCode
	) {
		if (id != null)
			return tourService.getTour(id);
		else if(categoryCode != null)
			return null;

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
