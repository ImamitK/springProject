package com.kaushik.spring.springProject.DAO;

public interface AccountDao {
	
	public void save(Account account);

	public void update(Account account);

	public void remove(int accno);

	public Account get(int accno);
}
