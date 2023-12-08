package com.onlineexhibition.backend.dtos;

import lombok.Data;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Data
public class StallDto {


    StallDto stallDto;
    
    private Long id;

    private String stallName;

    private String stallDescription;

    private String photoUrl;

    private String videoUrl;

    private String broucherUrl;


}
