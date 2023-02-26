package com.javaspring.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService theFortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 5k In the morning";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: "+theFortuneService.getFortune();
	}

}
