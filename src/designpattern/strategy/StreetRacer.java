package designpattern.strategy;

import designpattern.strategy.algorithm.Drive;

public class StreetRacer extends Vehicle {

	public StreetRacer() {
		setGo(new Drive());
	}
	
	
}
