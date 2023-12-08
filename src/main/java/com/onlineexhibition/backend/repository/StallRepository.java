package com.onlineexhibition.backend.repository;

import com.onlineexhibition.backend.models.Stall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StallRepository extends JpaRepository<Stall,Long> {
}


