package designpattern.factory.method;

public class OracleSQL implements Connection {

	@Override
	public void description() {
		System.out.println("This is Oracle Connection");
	}

}
