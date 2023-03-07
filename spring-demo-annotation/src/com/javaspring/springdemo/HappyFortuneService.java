package com.javaspring.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Inside getFortune in HappyFortuneService";
	}

}
