package designpattern.observer;

public class Start {

	public static void main(String[] args) {
		Subject subject = new Database("INSERT", "Customer");

		Observer manager = new Manager();
		Observer tester = new ObserverTest();

		subject.register(manager);
		subject.register(tester);

		subject.notifyToObservers();
	}
}
