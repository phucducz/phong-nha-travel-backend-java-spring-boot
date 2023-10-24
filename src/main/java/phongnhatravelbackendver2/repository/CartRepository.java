package phongnhatravelbackendver2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import phongnhatravelbackendver2.entity.CartEntity;

public interface CartRepository extends JpaRepository<CartEntity, Long> {
	List<CartEntity> findAll();

	CartEntity findOneById(Long id);

	List<CartEntity> findAllByUserId(Long usersId);

	@Modifying
	@Query(value = "UPDATE cart SET quantity = :quantity WHERE id = :id", nativeQuery = true)
	int updateQuantityById(int quantity, Long id);

	@Modifying
	@Query(value = "DELETE FROM cart WHERE id = :id", nativeQuery = true)
	int deleteCartById(Long id);

	@Query(value = "SELECT * FROM cart WHERE users_id = :userId AND checkouts_id is null", nativeQuery = true)
	List<CartEntity> findAllByUserIdCheckoutIdIsNull(Long userId);

	@Modifying
	@Query(value = "UPDATE cart SET checkouts_id = :checkoutsId "
			+ "WHERE users_id = :usersId AND checkouts_id is null", nativeQuery = true)
	int updateCheckoutIdByUserId(Long usersId, Long checkoutsId);
	
	@Query(value = "SELECT c.checkouts_id FROM CART AS c, checkouts AS cs WHERE c.checkouts_id = cs.id AND "
			+ "cs.status = 'unpaid' AND cs.date_of_paid IS NULL AND users_id = :usersId", nativeQuery = true)
	List<Long> findCheckoutsIdByUsersId(Long usersId);
	
	@Query(value = "SELECT c.* FROM cart AS c, checkouts AS cs WHERE c.users_id = :usersId AND c.tours_id = :toursId AND "
			+ "((c.checkouts_id = cs.id AND ((cs.status = 'unpaid' AND cs.date_of_paid IS NULL) OR c.checkouts_id IS NULL)) "
			+ "OR c.checkouts_id IS NULL) GROUP BY ID", nativeQuery = true)
	CartEntity findOneByUsersIdAndToursId(Long usersId, Long toursId);
}
