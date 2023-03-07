package com.javaspring.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") 
@Component // Default bean id will be class name with first letter as small
@Scope("singleton")
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")  // @Qualifier("RESTFortuneService") if first 2 character of name is caps then name wont change
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("Inside default constructor of TennisCoach");
	}
	
//	@Autowired
//	public TennisCoach(FortuneService thefortuneService) {
//		System.out.println("Inside TennisCoach parametrized constructor");
//		fortuneService = thefortuneService;
//	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("Inside setFortuneService");
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void otherMethodFortuneService(FortuneService fortuneService) {
//		System.out.println("Inside otherMethodFortuneService");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkOut() {
		return "Inside getDailyWorkOut method in class  TennisCoach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	// DEFINE INIT METHOD
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Inside doMyStartupStuff");
	}
	// define destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("Inside doMyCleanupStuff");
	}

}
