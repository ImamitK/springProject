package com.kaushik.spring.springProject.Autowiring.AnottationBasedWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloMainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("applicationContext_Anotation_Based_Wiring.xml");
		Profile profile = (Profile) context.getBean("profile");
		profile.printAge();
		profile.printName();
	}

}
