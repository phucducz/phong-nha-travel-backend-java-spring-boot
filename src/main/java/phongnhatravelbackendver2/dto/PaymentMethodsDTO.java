package phongnhatravelbackendver2.dto;

public class PaymentMethodsDTO {
	private Long id;
	private String name;
//	private List<PaymentMethodsDTO> listPaymentMethod;
//
//	public List<PaymentMethodsDTO> getListPaymentMethod() {
//		return listPaymentMethod;
//	}
//
//	public void setListPaymentMethod(List<PaymentMethodsDTO> listPaymentMethod) {
//		this.listPaymentMethod = listPaymentMethod;
//	}

	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
