package com.kaushik.spring.springProject.springHibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component("custDao")
public class CustomerDaoImpl implements CustomerDao{
	
	@Autowired(required=true)
	private HibernateTemplate hibernateTemplate;
	
	public CustomerDaoImpl() {}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void save(final Customer c) {
		hibernateTemplate.execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				Integer iRef = (Integer) session.save(c);
				return iRef;
			}
		});
		//or shortcut way
		//hibernateTemplate.save(c);
	}

	@Override
	public void update(Customer c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int cno) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer get(int cno) {
		// TODO Auto-generated method stub
		return null;
	}

}
