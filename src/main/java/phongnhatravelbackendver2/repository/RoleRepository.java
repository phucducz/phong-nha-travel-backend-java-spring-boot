package phongnhatravelbackendver2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import phongnhatravelbackendver2.entity.RolesEntity;

public interface RoleRepository extends JpaRepository<RolesEntity, Long> {
	List<RolesEntity> findAll();
}
