package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Database implements Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private String operation;
	private String record;

	public Database(String operation, String record) {
		this.operation = operation;
		this.record = record;
	}

	@Override
	public void register(Observer o) {
		this.observers.add(o);
	}

	@Override
	public void remove(Observer o) {
		this.observers.remove(o);
	}

	@Override
	public void notifyToObservers() {
		for(Observer o : observers) {
			o.update(this.operation, this.record);
		}
	}

}
