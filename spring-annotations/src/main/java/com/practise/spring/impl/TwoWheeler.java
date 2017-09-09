package com.practise.spring.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.practise.spring.Vehicle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class TwoWheeler implements Vehicle {

	// define a default constructor
		public TwoWheeler() {
			System.out.println(">> TwoWheeler: inside default constructor");
		}
		
		// define my init method
		@PostConstruct
		public void doMyStartupStuff() {
			System.out.println(">> TwoWheeler: inside of doMyStartupStuff()");
		}
		
		// define my destroy method
		@PreDestroy
		public void doMyCleanupStuff() {
			System.out.println(">> TwoWheeler: inside of doMyCleanupStuff()");
		}
	
	
	
	
	public String drive() {
		// TODO Auto-generated method stub
		return "Two Wheeler : drive()";
	}

}
