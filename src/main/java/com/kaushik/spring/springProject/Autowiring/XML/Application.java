package com.kaushik.spring.springProject.Autowiring.XML;

public class Application {
	
	//Application has a dependency of ApplicationUser, So in case of byName Application which has a 
	//property name as "applicationUser" will be searched in xml file and it will be autowired.
	private ApplicationUser applicationUser;

	public ApplicationUser getApplicationUser() {
		return applicationUser;
	}

	public void setApplicationUser(ApplicationUser applicationUser) {
		this.applicationUser = applicationUser;
	}

	@Override
	public String toString() {
		return "Application [applicationUser=" + applicationUser + "]";
	}
}
