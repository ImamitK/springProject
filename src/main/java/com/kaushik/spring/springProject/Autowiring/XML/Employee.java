package com.kaushik.spring.springProject.Autowiring.XML;

public class Employee {
	
	//Employee has a dependency of EmployeeAddress, So in case of byType Employee which has a 
	//property of type as "ApplicationUser" which matches with the type of a bean "employeeAddress"
	//defined in spring context, that bean will be wired automatically.
	private EmployeeAddress employeeAddress;

	public EmployeeAddress getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(EmployeeAddress employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	@Override
	public String toString() {
		return "Employee [employeeAddress=" + employeeAddress + "]";
	}
}
