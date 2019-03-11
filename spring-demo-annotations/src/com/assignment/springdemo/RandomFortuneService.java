package com.assignment.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of string
	private String[] data = {
	"Bangladesh",
	 "Homeland",
	 "love"
		};
	//create a random number generator
	private Random myRandom = new Random();
	
	
	
	@Override
	public String getFortune() {
		// Pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		return theFortune;
		
	}

}
