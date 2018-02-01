package com.kaushik.spring.springProject.AOP;

public class InstrumentList implements Performer{
	
	private Instrument instrument;
	
	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public void perform() throws PerformancException {
		instrument.play();
	}

}
