package com.kaushik.spring.springProject.Autowiring.AnottationBasedWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {

	@Autowired
	@Qualifier("student1")
	private Student student1;

	public Profile() {
		System.out.println("Inside Profile Default constructor");
	}

	public void printAge() {
		System.out.println("Age : " + student1.getAge());
	}

	public void printName() {
		System.out.println("Name : " + student1.getName());
	}
}
