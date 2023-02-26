package com.javaspring.springdemo;

public class HappyFortuneService implements FortuneService {
	
	@Override
	public String getFortune() {
		return "Today is the lucky day";
	}

}
