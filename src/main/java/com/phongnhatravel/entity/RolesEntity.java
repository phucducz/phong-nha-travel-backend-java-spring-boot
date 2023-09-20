package com.phongnhatravel.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class RolesEntity extends BaseEntity {
	@Column
	private String role;
	
	@OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
	private List<UsersEntity> listUser;

	public RolesEntity(String role, List<UsersEntity> listUser) {
		this.role = role;
		this.listUser = listUser;
	}
	
	public RolesEntity() {}

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
