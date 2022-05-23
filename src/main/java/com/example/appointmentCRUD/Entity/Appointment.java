package com.example.appointmentCRUD.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope(value="prototype")
public class Appointment implements Serializable{
	private static final long serialVersionUID = -1348024592255334017L;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String appointmentDesc;
	private long customerId;
	private long dealerId;
	private LocalTime appointmentStartTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private LocalTime appointmentEndTime;
	private Date appointmentDate;
	public Appointment() {
		super();
	}
	public Appointment(String appointmentDesc, long customerId, long dealerId, LocalTime appointmentStartTime,
			LocalTime appointmentEndTime, Date appointmentDate) {
		super();
		this.appointmentDesc = appointmentDesc;
		this.customerId = customerId;
		this.dealerId = dealerId;
		this.appointmentStartTime = appointmentStartTime;
		this.appointmentEndTime = appointmentEndTime;
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentDesc() {
		return appointmentDesc;
	}
	public void setAppointmentDesc(String appointmentDesc) {
		this.appointmentDesc = appointmentDesc;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getDealerId() {
		return dealerId;
	}
	public void setDealerId(long dealerId) {
		this.dealerId = dealerId;
	}
	public LocalTime getAppointmentStartTime() {
		return appointmentStartTime;
	}
	public void setAppointmentStartTime(LocalTime appointmentStartTime) {
		this.appointmentStartTime = appointmentStartTime;
	}
	public LocalTime getAppointmentEndTime() {
		return appointmentEndTime;
	}
	public void setAppointmentEndTime(LocalTime appointmentEndTime) {
		this.appointmentEndTime = appointmentEndTime;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	
}
