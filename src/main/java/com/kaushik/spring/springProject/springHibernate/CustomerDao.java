package com.kaushik.spring.springProject.springHibernate;

public interface CustomerDao {
	
	public void save(Customer c);

	public void update(Customer c);

	public void delete(int cno);

	public Customer get(int cno);
}
