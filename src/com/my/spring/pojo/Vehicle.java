package com.my.spring.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;

@Entity
@Table(name = "vehicle_table")
public class Vehicle {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private long id;
	
	@Column(name="number", unique = true, nullable = false)
	private String number;
	
	@Column(name="vehicleType")
	private String vehicleType;

	@Column(name = "color")
	private String color;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "modelName")
	private String modelName;
	
	
	public Vehicle() {
		
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}

	
	
}
