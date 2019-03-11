package com.assignment.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
 
	@Bean
	public FortuneService greetingFortuneService() {
		return new GreetingFortunService();
	}
	//define bean for our dependency injection
	@Bean
	public Coach tennisCoach() {
		TennisCoach tenisCoach = new TennisCoach(greetingFortuneService());
		return tenisCoach;
	}
}
