package com.santhoshonjava.core.app.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.santhoshonjava.core.app.services.impl.CricketCoach;

public class SetterInjectionDemo {
	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		CricketCoach theCoach = context.getBean("cricketCoach", CricketCoach.class);

		System.out.println(theCoach.getDailyWorkOut());

		// call our new methods to get the literal values
		System.out.println(theCoach.getEmailAddress());

		System.out.println(theCoach.getTeamName());

		// close the context
		context.close();
	}
}
