package com.practise.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.practise.spring.Vehicle;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");	
				
		// retrieve bean from spring container
		Vehicle vehicle1 = context.getBean("twoWheeler", Vehicle.class);

		Vehicle vehicle2 = context.getBean("twoWheeler", Vehicle.class);
		
		// print out the results
		System.out.println("Pointing to the same object: " + (vehicle1 == vehicle2));
		
		System.out.println("Memory location for theCoach: " + vehicle1);

		System.out.println("Memory location for alphaCoach: " + vehicle2 );
		
		// close the context
		context.close();
	}

}








