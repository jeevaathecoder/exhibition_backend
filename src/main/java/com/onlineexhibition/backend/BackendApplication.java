package com.onlineexhibition.backend;



import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Stalls API", version = "2.0", description = "Exhibition"))
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
