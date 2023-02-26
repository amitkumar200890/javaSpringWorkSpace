package com.javaspring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Retrieve the bean
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call method on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		// Read field value
		System.out.println("Team: "+theCoach.getTeam());
		System.out.println("Email ADdress: "+theCoach.getEmailAddress());
		System.out.println("Coach Name: "+theCoach.getCoach());
		
		// close context
		context.close();
	}

}
