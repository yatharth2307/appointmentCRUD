package com.example.appointmentCRUD.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.appointmentCRUD.Entity.Appointment;

@Component
public interface  AppointmentRepository extends CrudRepository<Appointment, Long>{
	
	 Appointment findById(long id);
}