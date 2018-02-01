package com.kaushik.spring.springProject.Autowiring.XML;

public class Instrument {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instrument [name=" + name + "]";
	}
}
