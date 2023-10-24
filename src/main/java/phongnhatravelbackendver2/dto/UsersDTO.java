package phongnhatravelbackendver2.dto;

import java.util.List;

public class UsersDTO {
	private Long id;
	private String userName;
	private String password;
	private String email;
	private String phoneNumber;
	private String firstName;
	private String lastName;
	private boolean active;
	private String avatar;
	
	private String roleName;
	private RolesDTO role;
	private List<CartDTO> listCart;
	private CheckoutDetailsDTO checkoutDetail;

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public CheckoutDetailsDTO getCheckoutDetail() {
		return checkoutDetail;
	}

	public void setCheckoutDetail(CheckoutDetailsDTO checkoutDetail) {
		this.checkoutDetail = checkoutDetail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public RolesDTO getRole() {
		return role;
	}

	public void setRole(RolesDTO role) {
		this.role = role;
	}

	public List<CartDTO> getListCart() {
		return listCart;
	}

	public void setListCart(List<CartDTO> listCart) {
		this.listCart = listCart;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}
}

