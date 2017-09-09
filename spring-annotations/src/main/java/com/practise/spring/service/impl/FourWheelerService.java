package com.practise.spring.service.impl;

import org.springframework.stereotype.Component;

import com.practise.spring.service.VehicleService;

@Component
public class FourWheelerService implements VehicleService {

	public String doService() {
		
		return "FourWheelerService:doService()";
	}

}
