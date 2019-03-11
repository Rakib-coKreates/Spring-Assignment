package com.assignment.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {


	private FortuneService fortuneService;
	
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">>TennisCoach: inside of doMyStartupStuff() ");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff() ");
	}
	
	
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> tennisCoach: inside setFortuneService() method");
		fortuneService = theFortuneService;
	}
	*/
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkOut() {
		
		return "Practice your backend volly";
	}

	

	@Override
	public String getDailyFortune() {


		return fortuneService.getFortune();
	}

}
