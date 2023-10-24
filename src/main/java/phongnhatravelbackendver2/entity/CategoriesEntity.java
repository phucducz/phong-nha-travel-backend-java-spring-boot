package phongnhatravelbackendver2.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "categories")
public class CategoriesEntity extends BaseEntity {
	@Column
	private String title;
	
	@Column
	private String code;
	
	@ManyToMany(mappedBy = "listCategory")
	private List<ToursEntity> listTour;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
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
