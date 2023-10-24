package phongnhatravelbackendver2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;

import phongnhatravelbackendver2.entity.CheckoutDetailsEntity;

public interface CheckoutDetailRepository extends JpaRepository<CheckoutDetailsEntity, Long> {
	CheckoutDetailsEntity findOneByUserId(Long userId);
	
	CheckoutDetailsEntity findOneById(Long id);
}
