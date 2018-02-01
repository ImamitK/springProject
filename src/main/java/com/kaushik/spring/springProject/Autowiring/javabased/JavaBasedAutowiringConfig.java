package com.kaushik.spring.springProject.Autowiring.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBasedAutowiringConfig {
	
	@Bean(name="gs1")
	public GreetingService getGs1() {
		GreetingServiceImpl gs = new GreetingServiceImpl();
		gs.setGreeting("Good Morning");
		return gs;
	}
	
	@Bean(name="gs2")
	public GreetingService getGs2() {
		GreetingServiceImpl gs = new GreetingServiceImpl("Good Evening");
		return gs;
	}
}
