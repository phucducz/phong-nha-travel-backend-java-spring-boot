package phongnhatravelbackendver2.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "images")
public class ImagesEntity extends BaseEntity {
	@Column
	private String image;

	@Column(name = "is_main")
	private boolean isMain;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "tours_id", referencedColumnName = "id")
	private ToursEntity tour;

	@JsonBackReference
	public ToursEntity getTour() {
		return tour;
	}

	public void setTour(ToursEntity tour) {
		this.tour = tour;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isMain() {
		return isMain;
	}

	public void setMain(boolean isMain) {
		this.isMain = isMain;
	}
}
