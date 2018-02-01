package com.kaushik.spring.springProject.springJDBC;

public interface EmployeeDao {
	
	public void save(Employee e);

	public void update(Employee e);

	public void delete(int eno);

	public Employee get(int eno);
}
