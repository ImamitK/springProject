package com.kaushik.spring.springProject.Autowiring.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloMainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedAutowiringConfig.class);
		GreetingService gs1 = (GreetingService) context.getBean("gs1");
		GreetingService gs2 = (GreetingService) context.getBean("gs2");
		gs1.sayGreeting();
		gs2.sayGreeting();
	}

}
