package rc.noteit.db;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import rc.noteit.model.Training;

public interface TrainingRepository extends JpaRepository<Training,Long> {

	 @Query("select c from Training c where c.title like:x")
	public Page<Training> chercher(@Param("x") String mc, Pageable pageable);
	
}
