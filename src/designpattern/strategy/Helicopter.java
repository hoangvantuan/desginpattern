package designpattern.strategy;

import designpattern.strategy.algorithm.Fly;

public class Helicopter extends Vehicle {

	public Helicopter() {
		setGo(new Fly());
	}

}
