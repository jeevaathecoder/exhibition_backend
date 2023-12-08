package com.onlineexhibition.backend;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

//	@Bean
//	CommandLineRunner run(UserRoleRepository userRoleRepository, UserRepository userRepository, PasswordEncoder passwordEncode){
//		return args ->{
//			if(userRoleRepository.findByAuthority("ADMIN").isPresent()) return;
//			UserRole adminRole = userRoleRepository.save(new UserRole("ADMIN"));
//			userRoleRepository.save(new UserRole("USER"));
//
//			Set<UserRole> roles = new HashSet<>();
//			roles.add(adminRole);
//
//			User admin = new User(1L, "admin", passwordEncode.encode("password"), roles);
//
//			userRepository.save(admin);
//		};
//	}
}
