package com.javaspring.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// create the object
		//Coach theCoach = new BaseBallCoach();
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.print(theCoach.getDailyWorkout());
	}

}
