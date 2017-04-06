package designpattern.strategy;

import designpattern.strategy.algorithm.Drive;

public class FomulaOne extends Vehicle {

	public FomulaOne() {
		setGo(new Drive());
	}
}
