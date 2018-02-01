package com.kaushik.spring.springProject.dependencyInjection;

public class GreetingServiceImpl implements GreetingService{
	
	private String greeting;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void sayGreeting() {
		System.out.println("Hai "+greeting);
	}

}
