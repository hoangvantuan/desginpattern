package designpattern.observer;

public class ObserverTest implements Observer {

	@Override
	public void update(String operation, String record) {
		System.out.println("Tester was notify Database: " + operation + " with " + record);
	}
}
