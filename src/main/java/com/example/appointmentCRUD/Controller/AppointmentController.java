package com.example.appointmentCRUD.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.appointmentCRUD.Entity.Appointment;
import com.example.appointmentCRUD.service.AppointmentService;

@RestController
public class AppointmentController {
	private AppointmentService Repository;
	@GetMapping("/appointment/{id}")
	public Appointment getAppointment(@PathVariable long id) {
		Appointment a=Repository.findById(id);
		return a;
	}
	@GetMapping("/appointment/all")
	public List<Appointment> getAllAppointment() {
		List<Appointment> app = new ArrayList<Appointment>();
		for(Appointment a:Repository.findAll()) {
			app.add(a);
		}
		return app;
	}
	@PostMapping("/appointment")
	public Appointment saveAppointment(@RequestBody Appointment a) {
			Repository.save(a);
			return a;
	}
	@DeleteMapping("/appointment/{id}")
	public String deleteAppointment(@PathVariable long id) {
		Repository.deleteById(id);
		return "Appointment Deleted Successfully!!!";
	}
	@PutMapping("/appointment")
	public Appointment updateAppointment(@RequestBody Appointment a) {
		long id=a.getId();
		return Repository.findByIdAndUpdate(id,a);
	}	
	
}
