package phongnhatravelbackendver2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import phongnhatravelbackendver2.entity.ToursEntity;

public interface TourRepository extends JpaRepository<ToursEntity, Long> {
	ToursEntity findOneById(Long id);

	List<ToursEntity> findAll();

	@Query("SELECT t FROM ToursEntity t, CategoriesEntity e WHERE e.code in :categoryCode")
	List<ToursEntity> findAllByCategoryCode(String categoryCode);
}
