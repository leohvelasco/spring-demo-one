package com.luv2code.springdemo;
//This is a POJO!!!!
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
}
