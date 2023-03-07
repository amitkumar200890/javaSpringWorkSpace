package com.javaspring.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.college}")
	private String college;
	
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Inside getDailyWorkOut from SwimCoach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Inside getDailyFortune from SwimCoach";
	}
	
	
	public String getEmail() {
		return email;
	}
	public String getCollege() {
		return college;
	}

}
