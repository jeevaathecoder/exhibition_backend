package com.onlineexhibition.backend.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineexhibition.backend.models.Stalls;



@Repository
public interface StallRepository extends JpaRepository<Stalls,Long> {

    java.util.List<Stalls> findStallById(long id);
    
}
