package com.kaushik.spring.springProject.Dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kaushik.spring.springProject.DAO.Account;
import com.kaushik.spring.springProject.DAO.AccountDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext_Dao.xml")
public class SpringDaoTest {
	
	@Autowired
	ApplicationContext context;
	
	@Test
	public void testSpringDao() {
		AccountDao accDao = (AccountDao) context.getBean("accdao");
		Account account = new Account();
		account.setAccno(1);
		account.setAccName("Amit");
		account.setAccType("current");
		account.setBal(100000.00);
		
		accDao.save(account);
	}
}
