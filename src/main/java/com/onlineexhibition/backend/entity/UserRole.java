package com.onlineexhibition.backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "user_roles")
@Data
public class UserRole implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "role_id")
   private Long id;
   private String name;
}
