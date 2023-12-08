package com.onlineexhibition.backend.services;

import java.util.Optional;



import com.onlineexhibition.backend.models.Stall;


public interface StallService {
    
    Optional<Stall> getStallById(Long id);
}
