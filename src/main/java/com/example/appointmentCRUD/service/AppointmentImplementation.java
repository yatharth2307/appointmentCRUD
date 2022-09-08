package com.example.appointmentCRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.appointmentCRUD.Entity.Appointment;
import com.example.appointmentCRUD.Repository.AppointmentRepository;


public class AppointmentImplementation implements AppointmentService{
	@Autowired
    private AppointmentRepository Repository;
    public List<Appointment>findAll() {

        return (List<Appointment>)Repository.findAll();
    }
	@Override
    public Appointment save(Appointment a) {

        Repository.save(a);
        return a;
    }
	@Override
	@Cacheable(value="Appointment", key="#id")
    public Appointment findById(long id) {
		System.out.println("Hello World");
        return Repository.findById(id);
    }
	@Override
	@CacheEvict(value="Appointment",key="#id")
	public void deleteById(long id) {
		Repository.deleteById(id);
	}
	@Override
	@CachePut(value="Appointment",key="#id")
	public Appointment findByIdAndUpdate(long id,Appointment a) {
		Appointment b=Repository.findById(a.getId()).get();
		b=a;
		Repository.save(b);
		return b;
	}
}
