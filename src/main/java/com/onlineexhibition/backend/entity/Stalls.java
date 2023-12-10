package com.onlineexhibition.backend.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Stalls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stallName;

    private String stallDescription;

    private String photoUrl;

    private String videoUrl;

    private String broucherUrl;

    @OneToOne(mappedBy = "stalls")
    private User user;
    
}
