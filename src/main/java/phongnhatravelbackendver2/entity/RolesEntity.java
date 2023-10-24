package phongnhatravelbackendver2.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "roles")
public class RolesEntity extends BaseEntity {
	@Column
	private String role;

	@OneToMany(mappedBy = "role")
	private List<UsersEntity> listUser;

	public RolesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RolesEntity(String role, List<UsersEntity> listUser) {
		super();
		this.role = role;
		this.listUser = listUser;
	}

	@JsonBackReference
	public List<UsersEntity> getListUser() {
		return listUser;
	}

	public void setListUser(List<UsersEntity> listUser) {
		this.listUser = listUser;
	}

	public RolesEntity(String role) {
		this.setRole(role);
	}

	public RolesEntity(int id, String role) {
		this.setRole(role);
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}