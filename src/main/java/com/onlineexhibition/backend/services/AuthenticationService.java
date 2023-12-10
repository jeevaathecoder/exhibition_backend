package com.onlineexhibition.backend.services;

import com.onlineexhibition.backend.dtos.UserLoginDto;
import com.onlineexhibition.backend.entity.User;
import com.onlineexhibition.backend.entity.UserRole;
import com.onlineexhibition.backend.repository.UserRepository;
import com.onlineexhibition.backend.repository.UserRoleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.security.core.AuthenticationException;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Service
@Transactional
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    public User register(String email, String password) {
        String encodedPassword = passwordEncoder.encode(password);

        UserRole userRole = userRoleRepository.findByName("USER").get();
        Set<UserRole> authorities = new HashSet<>();

        authorities.add(userRole);

        User user = User.builder()
                .id(0L)
                .email(email)
                .password(encodedPassword)
                .roles(authorities)
                .build();

        return userRepository.save(user);
    }

    public UserLoginDto login(String email, String password) {
        try{
            Authentication auth = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(email, password)
            );

            String token = tokenService.generateJwt(auth);

            return new UserLoginDto(userRepository.findByEmail(email).get(), token);

        } catch(AuthenticationException e){
            return new UserLoginDto(null, "");
        }
    }
}
