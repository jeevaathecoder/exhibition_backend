package com.onlineexhibition.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlineexhibition.backend.models.Stalls;
import com.onlineexhibition.backend.services.StallService;



@RestController
@RequestMapping("/stall")
public class StallController {
      
    @Autowired
    private StallService theStallService;

    @GetMapping("/{id}")
    public List<Stalls> findStallByGivenId(@PathVariable long id){
        return theStallService.findGivenStallById(id);
    }
}
