package com.onlineexhibition.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.onlineexhibition.backend.models.Stall;
import com.onlineexhibition.backend.services.StallService;

@Controller
@RequestMapping("/api")
public class StallController {

    @Autowired
    private StallService stallService;
    

     @GetMapping("/stall/{id}")
        public ResponseEntity<Stall> getStallById(@PathVariable Long id) {
        return stallService.getStallById(id)
                .map(stall -> ResponseEntity.ok().body(stall))
                .orElseGet(() -> ResponseEntity.notFound().build());
    

    }
}
