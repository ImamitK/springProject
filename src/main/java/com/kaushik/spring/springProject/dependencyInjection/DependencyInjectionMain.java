package com.kaushik.spring.springProject.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		GreetingService gs1 = (GreetingService) context.getBean("gs1");
		GreetingService gs2 = (GreetingService) context.getBean("gs2");
		gs1.sayGreeting();
		gs2.sayGreeting();
	}

}
