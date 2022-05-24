package com.example.appointmentCRUD;

import org.apache.log4j.Logger;  


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AppointmentCrudApplication {
	public static void main(String[] args) {
		final Logger log = Logger.getLogger(AppointmentCrudApplication.class.getName());  
		log.debug("Hello this is a debug message");  
	    log.info("Hello this is an info message");  
		SpringApplication.run(AppointmentCrudApplication.class, args);
	}
}
