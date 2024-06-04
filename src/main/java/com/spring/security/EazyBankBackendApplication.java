package com.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity(debug = true)
public class EazyBankBackendApplication {

	public static void main(String[] args) {


		SpringApplication.run(EazyBankBackendApplication.class, args);

		System.out.println("Application started successfully!");
	}

}
