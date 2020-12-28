package library.maxwell.module.book.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import library.maxwell.module.book.entity.BookDetailEntity;

@Repository
public interface BookDetailRepository extends JpaRepository<BookDetailEntity, Integer> {
	
	@Query(value = "SELECT * FROM book_detail WHERE status IS true", nativeQuery = true)
	List<BookDetailEntity> findAllActive();
	
	@Query(value = "SELECT * FROM book_detail WHERE status IS false", nativeQuery = true)
	List<BookDetailEntity> findAllInactive();
	
	List<BookDetailEntity> findByTypeOfDamage(String typeOfDamage);

	
}
