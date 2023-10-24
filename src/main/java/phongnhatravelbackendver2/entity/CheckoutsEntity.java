package phongnhatravelbackendver2.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "checkouts")
public class CheckoutsEntity extends BaseEntity {
	@Column
	private LocalDate dateOfPaid;
	
	@Column
	private String status;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "payment_methods_id", referencedColumnName = "id")
	private PaymentMethodsEntity paymentMethod;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "coupons_id", referencedColumnName = "id")
	private CouponsEntity coupon;
	
	@OneToMany(mappedBy = "checkout")
	private List<CartEntity> listCart;

	@JsonBackReference
	public List<CartEntity> getListCart() {
		return listCart;
	}

	public LocalDate getDateOfPaid() {
		return dateOfPaid;
	}

	public void setDateOfPaid(LocalDate dateOfPaid) {
		this.dateOfPaid = dateOfPaid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setListCart(List<CartEntity> listCart) {
		this.listCart = listCart;
	}

	public PaymentMethodsEntity getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethodsEntity paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public CouponsEntity getCoupon() {
		return coupon;
	}

	public void setCoupon(CouponsEntity coupon) {
		this.coupon = coupon;
	}
}
