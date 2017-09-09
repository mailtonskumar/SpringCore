package com.santhoshonjava.core.app.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.santhoshonjava.core.app.services.Coach;


public class BeanScopeDemo {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope-applicationContext.xml");

		// retrieve bean from spring container
		Coach coach1 = context.getBean("tennisCoach", Coach.class);
		Coach coach2 = context.getBean("tennisCoach", Coach.class);

		System.out.println("Pointing to the same object ? " + (coach1 == coach2));
		
		System.out.println("Memory location for coach1: " + coach1);

		System.out.println("Memory location for coach2: " + coach2 );
		
		// close the context
		context.close();
	}
	
	
}
