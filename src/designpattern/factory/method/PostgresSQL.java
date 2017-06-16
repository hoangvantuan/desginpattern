package designpattern.factory.method;

public class PostgresSQL implements Connection {

	@Override
	public void description() {
		System.out.println("This is PostgresSQL Connection");
	}
}
