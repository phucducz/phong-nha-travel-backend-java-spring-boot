package phongnhatravelbackendver2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import phongnhatravelbackendver2.entity.CheckoutsEntity;

public interface CheckoutRepository extends JpaRepository<CheckoutsEntity, Long> {
	CheckoutsEntity findOneById(Long id);
}
