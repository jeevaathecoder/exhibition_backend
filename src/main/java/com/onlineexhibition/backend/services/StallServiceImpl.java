package com.onlineexhibition.backend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexhibition.backend.models.Stall;
import com.onlineexhibition.backend.repository.StallRepository;

@Service
public class StallServiceImpl implements StallService {

    @Autowired
    private StallRepository theStallRepository;

    @Override
    public Optional<Stall> getStallById(Long id) {

        return theStallRepository.findById(id);
    }

}
