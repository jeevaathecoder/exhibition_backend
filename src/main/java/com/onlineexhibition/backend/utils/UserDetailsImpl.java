package com.onlineexhibition.backend.utils;

import com.onlineexhibition.backend.entity.User;
import com.onlineexhibition.backend.entity.UserRole;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsImpl implements UserDetails {
   private User user ;

   @Override
   public Collection<? extends GrantedAuthority> getAuthorities() {

      Set<UserRole> roles = user.getRoles();
      List<SimpleGrantedAuthority> authorities = new ArrayList<>();

      for (UserRole role : roles) {
         authorities.add(new SimpleGrantedAuthority(role.getName()));
      }
      return authorities;
   }

   @Override
   public String getPassword() {
      return user.getPassword();
   }

   @Override
   public String getUsername() {
      return user.getEmail();
   }

   @Override
   public boolean isAccountNonExpired() {
      return false;
   }

   @Override
   public boolean isAccountNonLocked() {
      return false;
   }

   @Override
   public boolean isCredentialsNonExpired() {
      return false;
   }

   @Override
   public boolean isEnabled() {
      return true;
   }
}
