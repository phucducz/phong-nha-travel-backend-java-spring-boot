package phongnhatravelbackendver2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import phongnhatravelbackendver2.entity.TypesEntity;

public interface TypeRepository extends JpaRepository<TypesEntity, Long> {
	TypesEntity findOneByTitle(String title);
}
