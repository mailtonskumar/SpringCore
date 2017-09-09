package com.santhoshonjava.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author SanthoshKumarN
 *
 */
public class ClassPathApplicationContextTest {


	public static void main(String ... args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Person person = (Person)context.getBean("person1");
		person.speak();
		
		((ClassPathXmlApplicationContext)context).close();
		
	}
	
}
