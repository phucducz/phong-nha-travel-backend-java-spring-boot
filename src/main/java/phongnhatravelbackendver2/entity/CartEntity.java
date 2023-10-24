package phongnhatravelbackendver2.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "cart")
public class CartEntity extends BaseEntity {
	@Column(name = "booking_date")
	private LocalDate bookingDate;

	@Column
	private int quantity;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tours_id", referencedColumnName = "id")
	private ToursEntity tour;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "users_id", referencedColumnName = "id")
	private UsersEntity user;

	@ManyToOne
	@JoinColumn(name = "checkouts_id", referencedColumnName = "id")
	private CheckoutsEntity checkout;

	@JsonManagedReference
	public CheckoutsEntity getCheckout() {
		return checkout;
	}

	public void setCheckout(CheckoutsEntity checkout) {
		this.checkout = checkout;
	}

	@JsonManagedReference
	public ToursEntity getTour() {
		return tour;
	}

	public void setTour(ToursEntity tour) {
		this.tour = tour;
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

	@JsonBackReference
	public UsersEntity getUser() {
		return user;
	}

	public void setUser(UsersEntity user) {
		this.user = user;
	}

//	@JsonManagedReference
//	public CouponsEntity getCoupon() {
//		return coupon;
//	}
//
//	public void setCoupon(CouponsEntity coupon) {
//		this.coupon = coupon;
//	}
}
