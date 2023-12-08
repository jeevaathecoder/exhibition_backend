package com.onlineexhibition.backend.services;

import com.onlineexhibition.backend.models.Stall;
import com.onlineexhibition.backend.repository.StallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StallService {

    private final StallRepository stallRepository;

    @Autowired
    public StallService(StallRepository stallRepository) {
        this.stallRepository = stallRepository;
    }

    public List<Stall> getAllStalls() {
        return stallRepository.findAll();
    }

    public ResponseEntity<Stall> getStallById(Long id) {
        Optional<Stall> stall = stallRepository.findById(id);
        return stall.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}