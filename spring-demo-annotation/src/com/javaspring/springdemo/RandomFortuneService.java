package com.javaspring.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// craete an array of string
	private String[] data = {
			"Beware of the wolf in sheep's clothinng",
			"Deligence is the mother of good luck",
			"The Journey is the reward"
	};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		// get a random fortune
		int index = random.nextInt(data.length);
		return "inside getFortune in RandomFortuneService : "+data[index];
	}

}
