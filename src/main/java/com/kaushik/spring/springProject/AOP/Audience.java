package com.kaushik.spring.springProject.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	@Pointcut("execution(* com.kaushik.spring.springProject.AOP.Performer.perform(..))")
	public void performance() {}
	
	@Before("performance()")
	public void takeSeats() {         //before advice
		System.out.println("The audience is taking there seats...");
	}
	
	@Before("performance()")
	public void turnOffCellPhones() {  //before advice
		System.out.println("The audience is turning off there cellphones...");
	}
	
	@AfterReturning("performance()")
	public void applaud() {            //afterReturing advice
		System.out.println("CLAP CLAP CLAP CLAP...");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund() {	   //afterThrowing advice
		System.out.println("Boo!! We want our money back...");
	}
	
	@Around("performance()")	       //Around advice
	public void watchPerformance(ProceedingJoinPoint joinpoint) {
		try {
			long start = System.currentTimeMillis();
			joinpoint.proceed();
			long end = System.currentTimeMillis();
			System.out.println("***The performance took:"+(end-start)+"milliseconds***");
		} catch (Throwable e) {
			System.out.println("Boo!!... we want our refunds...");
		}
	}
}
