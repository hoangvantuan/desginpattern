package designpattern.factory.method;

public class MySQL implements Connection {

	@Override
	public void description() {
		System.out.println("This is MySQL Connection");
	}
}
