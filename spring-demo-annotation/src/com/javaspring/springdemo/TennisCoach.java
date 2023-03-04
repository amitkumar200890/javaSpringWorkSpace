package com.javaspring.springdemo;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") 
@Component // Default bean id will be class name with first letter as small
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		return "Inside getDailyWorkOut method in class  TennisCoach";
	}

}
