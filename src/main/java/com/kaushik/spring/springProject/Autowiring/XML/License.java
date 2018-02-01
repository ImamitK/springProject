package com.kaushik.spring.springProject.Autowiring.XML;

public class License {
	
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "License [number=" + number + "]";
	}
}
