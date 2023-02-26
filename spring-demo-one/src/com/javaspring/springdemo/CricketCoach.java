package com.javaspring.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;

	private String emailAddress;
	private String team;
	
	private String coach;
	
	

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setFortuneService method");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside the setEmailAddress method");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("Inside the setTeam method");
		this.team = team;
	}

	public String getEmailAddress() {
		System.out.println("Inside the getEmailAddress method");
		return emailAddress;
	}

	public String getTeam() {
		System.out.println("Inside the getTeam method");
		return team;
	}
	
	public String getCoach() {
		System.out.println("Inside the getCoach method");
		return coach;
	}

	public void setCoach(String coach) {
		System.out.println("Inside the setCoach method");
		this.coach = coach;
	}

}
