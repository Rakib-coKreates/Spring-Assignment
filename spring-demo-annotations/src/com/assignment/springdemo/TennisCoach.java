package com.assignment.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		
		return "Practice your backend volly";
	}

}
