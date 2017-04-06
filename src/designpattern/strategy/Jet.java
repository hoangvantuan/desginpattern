package designpattern.strategy;

import designpattern.strategy.algorithm.FlyFast;

public class Jet extends Vehicle {

	public Jet() {
		setGo(new FlyFast());
	}
}
