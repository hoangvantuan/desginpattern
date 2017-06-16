package designpattern.observer;

public class Manager implements Observer {

	@Override
	public void update(String operation, String record) {
		System.out.println("Manager was notify that Database: " + operation + " with " + record );
	}
}
