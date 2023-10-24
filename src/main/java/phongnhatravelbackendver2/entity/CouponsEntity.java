package phongnhatravelbackendver2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "coupons")
public class CouponsEntity extends BaseEntity {
	@Column
	private String code;

	@Column
	private float value;

//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "user_coupons", joinColumns = @JoinColumn(name = "coupon_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
//	private List<UsersEntity> listUser;

//	@JsonBackReference
//	public List<UsersEntity> getListUser() {
//		return listUser;
//	}
//
//	public void setListUser(List<UsersEntity> listUser) {
//		this.listUser = listUser;
//	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
}