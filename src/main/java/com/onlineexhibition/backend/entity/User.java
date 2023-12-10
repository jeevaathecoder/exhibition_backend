package com.onlineexhibition.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(unique = true)
   private Long id;
   private String email;
   private String password;

   @OneToOne
   @JoinColumn(name = "stalls_id", referencedColumnName = "id")
   private Stalls stalls;

   @ManyToMany(fetch = FetchType.EAGER)
   @JoinTable(name = "user_role_junction", joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "role_id")})
   private Set<UserRole> roles;

}
