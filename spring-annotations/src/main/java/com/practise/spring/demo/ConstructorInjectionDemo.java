package com.practise.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practise.spring.Vehicle;

public class ConstructorInjectionDemo {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get the bean from spring container
		Vehicle vehicle = context.getBean("twoWheeler", Vehicle.class);

		// call a method on the bean
		System.out.println(vehicle.drive());

		// close the context
		context.close();
	}
}
