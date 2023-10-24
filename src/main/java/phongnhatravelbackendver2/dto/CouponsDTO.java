package phongnhatravelbackendver2.dto;

import java.util.List;

public class CouponsDTO {
	private Long id;
	private String code;
	private float value;
	
	private List<CartDTO> listCart;

	public List<CartDTO> getListCart() {
		return listCart;
	}

	public void setListCart(List<CartDTO> listCart) {
		this.listCart = listCart;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

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