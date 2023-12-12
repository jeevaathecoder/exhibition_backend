package com.onlineexhibition.backend.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineexhibition.backend.entity.Stalls;
import com.onlineexhibition.backend.repository.StallRepository;



@Service
public class StallService {
    @Autowired
    private StallRepository theStallRepository;

    public Stalls findGivenStallById(long id){
        return theStallRepository.findStallById(id);
    }

    public List<Stalls> getAllStalls() {
        return theStallRepository.findAll();
    }

    public Stalls addStall(Stalls stall) {
        return theStallRepository.save(stall);
    }
    
   public Stalls editTheStall(Stalls stall){
     if(theStallRepository.existsById(stall.getId())){
              return theStallRepository.save(stall);
     } else{
        throw new IllegalArgumentException("Stall with ID " + stall.getId() + " not found");
      }
   }


}
