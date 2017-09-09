package com.santhoshonjava.core.app.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.santhoshonjava.core.app.services.impl.VolleyBallCoach;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {

		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("bean-life-cycle-applicationContext.xml");
				
		// retrieve bean from spring container
		VolleyBallCoach theCoach = context.getBean("volleyBallCoach", VolleyBallCoach.class);

		// close the context
		context.close();
	}
}
