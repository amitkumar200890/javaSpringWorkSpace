package com.javaspring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach firstCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach secondCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println("Two objects are similer? "+(firstCoach == secondCoach));
		System.out.println("Memory location of firstCoach : "+firstCoach);
		System.out.println("Memory location of secondCoach : "+secondCoach);
		
		context.close();
	}

}
