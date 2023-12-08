//package com.onlineexhibition.backend.services;
//
//import com.onlineexhibition.backend.models.Stall;
//import com.onlineexhibition.backend.repository.StallRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class StallServiceImpl extends StallService {
//    //define the field
//    private StallRepository stallRepository;
//
//    @Autowired
//    public StallServiceImpl(StallRepository stallRepository) {
//        this.stallRepository = stallRepository;
//    }
//
//    @Override
//    public Stall findById(Long id) {
//        Optional<Stall> theStall = stallRepository.findById(id);
//
//        Stall theResult = null;
//        if (theStall.isPresent()) {
//            theResult = theStall.get();
//        } else {
//            try {
//                throw new Exception("The stall not found" + id);
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        return theResult;
//
//
//    }
//}
//
