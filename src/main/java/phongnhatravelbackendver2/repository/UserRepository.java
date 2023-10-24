package phongnhatravelbackendver2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import phongnhatravelbackendver2.entity.UsersEntity;

@Component
public interface UserRepository extends JpaRepository<UsersEntity, Long> {
	List<UsersEntity> findAll();
	
	UsersEntity findOneById(Long id);
	
	UsersEntity findOneByUserName(String userName);
}
