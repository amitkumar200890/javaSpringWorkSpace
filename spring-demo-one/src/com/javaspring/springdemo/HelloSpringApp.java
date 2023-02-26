package com.javaspring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// Call method on bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method of fortune service
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
