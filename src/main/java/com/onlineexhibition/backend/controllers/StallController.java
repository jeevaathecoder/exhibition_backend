package com.onlineexhibition.backend.controllers;


import com.onlineexhibition.backend.models.Stall;
import com.onlineexhibition.backend.services.StallService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stalls")
public class StallController {

    private final StallService stallService;

    @Autowired
    public StallController(StallService stallService) {
        this.stallService = stallService;
    }

    @GetMapping
    public List<Stall> getAllStalls() {
        return stallService.getAllStalls();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Stall> getStallById(@PathVariable Long id) {
        return stallService.getStallById(id);
    }
}
/**
 *  Stall theStall = stallService.findById(id);
 *   if(thstall =null)
 *   throw new RuntimeException("Stall not found" + id);
 *   return theStall;
 */