package com.example.appointmentCRUD.service;

import java.util.List

import com.example.appointmentCRUD.Entity.Appointment;

public interface AppointmentService {
	public Appointment findById(long id);
	public List<Appointment> findAll();
	public Appointment save(Appointment a);
	public void deleteById(long id);
	public Appointment findByIdAndUpdate(long id,Appointment a);
}
