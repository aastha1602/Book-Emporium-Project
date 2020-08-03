package com.bookemporium;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookemporium.domain.User;
import com.bookemporium.domain.security.Role;
import com.bookemporium.domain.security.UserRole;
import com.bookemporium.service.UserService;
import com.bookemporium.utility.SecurityUtility;

@SpringBootApplication
public class BookEmporiumApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(BookEmporiumApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		User user1 = new User();
		user1.setFirstName("Dev");
		user1.setLastName("Yadav");
		user1.setUsername("d");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("p123"));
		user1.setEmail("DevYadav@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1= new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));
		
		userService.createUser(user1, userRoles);
	}
}
