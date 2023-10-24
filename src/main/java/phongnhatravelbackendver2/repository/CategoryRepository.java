package phongnhatravelbackendver2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import phongnhatravelbackendver2.entity.CategoriesEntity;

public interface CategoryRepository extends JpaRepository<CategoriesEntity, Long> {
	List<CategoriesEntity> findByTitle(String title);
	
	List<CategoriesEntity> findAll();
	
	CategoriesEntity findOneByCode(String code);
	
	CategoriesEntity findOneById(Long id);
}
