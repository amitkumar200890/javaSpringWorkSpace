package com.javaspring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp{

	public static void main(String[] args) {
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach firstCoach = context.getBean("myCoach", Coach.class);
		
		Coach secondCoach = context.getBean("myCoach", Coach.class);
		System.out.println("Singleton Bena: "+(firstCoach == secondCoach));
		context.close();
	}

	
}
