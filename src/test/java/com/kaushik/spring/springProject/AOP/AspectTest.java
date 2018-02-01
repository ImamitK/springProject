package com.kaushik.spring.springProject.AOP;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext_annotation_based_aop.xml")
//@TestExecutionListeners(listeners = {DependencyInjectionTestExecutionListener.class})
public class AspectTest {
	
	@Autowired
	ApplicationContext context;
	
	@Test
	public void audienceShouldApplaud() throws Exception{
		Performer eddie = context.getBean("eddie",Performer.class);
		eddie.perform();
	}

}
