package phongnhatravelbackendver2.dto;

import java.util.List;

public class RolesDTO {
	private Long id;
	private String role;
	
	private List<UsersDTO> listUser;

	public List<UsersDTO> getListUser() {
		return listUser;
	}

	public void setListUser(List<UsersDTO> listUser) {
		this.listUser = listUser;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Long getId() {
		return id;
	}
}