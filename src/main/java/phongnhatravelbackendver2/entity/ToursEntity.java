package phongnhatravelbackendver2.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "tours")
public class ToursEntity extends BaseEntity {
	@Column
	private String name;

	@Column(length = 1000)
	private String description;

	@Column(name = "price_adult")
	private float priceAdult;

	@Column(name = "price_children")
	private float priceChildren;

	@Column(name = "start_date")
	private LocalDate startDate;

	@Column(name = "end_date")
	private LocalDate endDate;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "tour_categories", joinColumns = @JoinColumn(name = "tours_id"), inverseJoinColumns = @JoinColumn(name = "categories_id", referencedColumnName = "id"))
	private List<CategoriesEntity> listCategory;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "tour_topics", joinColumns = @JoinColumn(name = "tours_id"), inverseJoinColumns = @JoinColumn(name = "topics_id", referencedColumnName = "id"))
	private List<TopicsEntity> listTopic;

	@OneToMany(mappedBy = "tour")
	private List<CartEntity> listCart;

	@JsonIgnore
	@OneToMany(mappedBy = "tour", cascade = CascadeType.ALL)
	private List<ImagesEntity> listImage;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "types_id", referencedColumnName = "id")
	private TypesEntity type;

	@JsonBackReference
	public List<CartEntity> getListCart() {
		return listCart;
	}

	public void setListCart(List<CartEntity> listCart) {
		this.listCart = listCart;
	}

	@JsonManagedReference
//	@JsonBackReference
	public List<CategoriesEntity> getListCategory() {
		return listCategory;
	}

	public void setListCategory(List<CategoriesEntity> listCategory) {
		this.listCategory = listCategory;
	}

//	@JsonBackReference
	@JsonManagedReference
	public List<TopicsEntity> getListTopic() {
		return listTopic;
	}

	public void setListTopic(List<TopicsEntity> listTopic) {
		this.listTopic = listTopic;
	}

	@JsonManagedReference
	public TypesEntity getType() {
		return type;
	}

	public void setType(TypesEntity type) {
		this.type = type;
	}

	@JsonManagedReference
	public List<ImagesEntity> getListImage() {
		return listImage;
	}

	public void setListImage(List<ImagesEntity> listImage) {
		this.listImage = listImage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPriceAdult() {
		return priceAdult;
	}

	public void setPriceAdult(float priceAdult) {
		this.priceAdult = priceAdult;
	}

	public float getPriceChildren() {
		return priceChildren;
	}

	public void setPriceChildren(float priceChildren) {
		this.priceChildren = priceChildren;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
}
