package phongnhatravelbackendver2.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "types")
public class TypesEntity extends BaseEntity {
	@Column
	private String title;
	
	@Column 
	private String code;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@OneToMany(mappedBy = "type", fetch = FetchType.LAZY)
	private List<ToursEntity> listTour;

	@JsonBackReference
	public List<ToursEntity> getListTour() {
		return listTour;
	}

	public void setListTour(List<ToursEntity> listTour) {
		this.listTour = listTour;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
