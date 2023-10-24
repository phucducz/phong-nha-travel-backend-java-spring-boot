package phongnhatravelbackendver2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import phongnhatravelbackendver2.entity.PaymentMethodsEntity;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethodsEntity, Long>{
	List<PaymentMethodsEntity> findAll();
	
	PaymentMethodsEntity findOneById(Long id);
}
