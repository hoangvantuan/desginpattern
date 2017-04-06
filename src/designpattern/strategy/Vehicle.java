package designpattern.strategy;

import designpattern.strategy.algorithm.Go;

public abstract class Vehicle {

	private Go go;

	public void setGo(Go go) {
		this.go = go;
	}

	public Go getGo() {
		return go;
	}
}
