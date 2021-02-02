package rc.noteit.db;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import rc.noteit.model.Event;



public interface EventRepository extends JpaRepository<Event,Long> {

	
	
//	 @Query("select c from Event c where c.name like:x")
//		public Page<Event> chercher(@Param("x") String mc, Pageable pageable);
		
}
