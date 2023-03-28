package net.codejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;  
import org.springframework.boot.autoconfigure.jdbc.*; 
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class LoginRegistrationUsingSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginRegistrationUsingSpringBootApplication.class, args);
	}

}
