package phongnhatravelbackendver2.dto;

import java.time.LocalDate;

public class CartDTO {
	private Long id;
	private int quantity;
	private LocalDate bookingDate;
	
	private Long userId;
	
	private Long tourId;
	private ToursDTO tour;
	
	private Long checkoutId;
	private CheckoutsDTO checkout;

	public Long getCheckoutId() {
		return checkoutId;
	}

	public void setCheckoutId(Long checkoutId) {
		this.checkoutId = checkoutId;
	}

	public Long getTourId() {
		return tourId;
	}

	public void setTourId(Long tourId) {
		this.tourId = tourId;
	}

	public CheckoutsDTO getCheckout() {
		return checkout;
	}

	public void setCheckout(CheckoutsDTO checkout) {
		this.checkout = checkout;
	}

	public ToursDTO getTour() {
		return tour;
	}

	public void setTour(ToursDTO tour) {
		this.tour = tour;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
