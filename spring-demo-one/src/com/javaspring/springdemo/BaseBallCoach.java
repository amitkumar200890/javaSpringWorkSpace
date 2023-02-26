package com.javaspring.springdemo;

public class BaseBallCoach implements Coach {
	// define a private field for FortuneService
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseBallCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 30 minutes everyday";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneservice
		return fortuneService.getFortune();
	}

}
