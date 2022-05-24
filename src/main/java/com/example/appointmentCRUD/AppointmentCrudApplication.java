package com.example.appointmentCRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import org.apache.log4j.Logger;  
  
import java.io.*;  
import java.sql.SQLException;  
import java.util.*;  

@SpringBootApplication
@EnableCaching
public class AppointmentCrudApplication {
	/* Get the class name to be printed on */  
   	static Logger log = Logger.getLogger(Example.class.getName());  

	public static void main(String[] args) {
		SpringApplication.run(AppointmentCrudApplication.class, args);
		log.debug("Hello this is a debug message");  
      		log.info("Hello this is an info message");  
	}
}
