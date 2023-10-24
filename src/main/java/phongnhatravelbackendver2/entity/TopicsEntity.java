package phongnhatravelbackendver2.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "topics")
public class TopicsEntity {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId() {
		return id;
	}

	@Column
	private String title;
	
	@ManyToMany(mappedBy = "listTopic")
	private List<ToursEntity> listTour = new ArrayList<ToursEntity>();

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
