package com.kaushik.spring.springProject.Autowiring.XML;

public class Performer {
	
	private Instrument instrument;

	public Performer(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public String toString() {
		return "Performer [instrument=" + instrument + "]";
	}
}
