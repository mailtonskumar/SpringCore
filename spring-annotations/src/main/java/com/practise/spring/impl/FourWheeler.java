package com.practise.spring.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.practise.spring.Vehicle;
import com.practise.spring.service.VehicleService;

@Component
public class FourWheeler implements Vehicle {

	@Autowired
	@Qualifier("fourWheelerService")
	VehicleService vehicleService;
	
	
	
	public String drive() {
		// TODO Auto-generated method stub
		return vehicleService.doService();
	}

}
