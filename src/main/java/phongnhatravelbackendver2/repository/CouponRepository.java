package phongnhatravelbackendver2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import phongnhatravelbackendver2.entity.CouponsEntity;

public interface CouponRepository extends JpaRepository<CouponsEntity, Long> {
	List<CouponsEntity> findAll();
	
	CouponsEntity findOneById(Long id);
	
	CouponsEntity findOneByCode(String code);
}
