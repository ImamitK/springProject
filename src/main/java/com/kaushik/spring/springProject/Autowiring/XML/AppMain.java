package com.kaushik.spring.springProject.Autowiring.XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext_Autowiring_XML.xml");
		
		Application app = (Application) context.getBean("application");
		System.out.println("Application Details : "+app);
		
		Employee emp  = (Employee) context.getBean("employee");
		System.out.println("Employee Details : "+emp);
		
		Performer per =(Performer) context.getBean("performer");
		System.out.println("Performer Details : "+per);
		
		Driver driver = (Driver) context.getBean("driver");
		System.out.println("Driver details : "+driver);
	}

}
