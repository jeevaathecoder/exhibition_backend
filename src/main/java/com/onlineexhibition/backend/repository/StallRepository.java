package com.onlineexhibition.backend.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineexhibition.backend.entity.Stalls;



@Repository
public interface StallRepository extends JpaRepository<Stalls,Long> {

    Stalls findStallById(long id);
    
}
