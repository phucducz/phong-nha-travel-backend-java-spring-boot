package phongnhatravelbackendver2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import phongnhatravelbackendver2.entity.ImagesEntity;

public interface ImageRepository extends JpaRepository<ImagesEntity, Long>{
	List<ImagesEntity> findAll();
	
	ImagesEntity findOneById(Long id);
}
