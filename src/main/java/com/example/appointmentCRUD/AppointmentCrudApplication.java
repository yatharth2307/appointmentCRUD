package com.example.appointmentCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AppointmentCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppointmentCrudApplication.class, args);
		
	}
}
