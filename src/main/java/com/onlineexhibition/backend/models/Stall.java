package com.onlineexhibition.backend.models;

import com.onlineexhibition.backend.services.StallService;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name ="stalls")
@Data
public class Stall {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stallName;

    private String stallDescription;

    private String photoUrl;

    private String videoUrl;

    private String broucherUrl;


}
