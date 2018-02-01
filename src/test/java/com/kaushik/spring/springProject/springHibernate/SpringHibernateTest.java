package com.kaushik.spring.springProject.springHibernate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext_HibernateTemplate.xml")
public class SpringHibernateTest {
	
	@Autowired
	ApplicationContext context;
	
	@Test
	public void testSpringHibernate() {
		CustomerDao custDao = (CustomerDao) context.getBean("custDao");
		Customer c = new Customer();
		c.setCno(1);
		c.setCname("Amit");
		c.setAddress("HSR");
		c.setPhone(1234567890);
		
		custDao.save(c);
		
		System.out.println("Records inserted successfully....");
	}

}
