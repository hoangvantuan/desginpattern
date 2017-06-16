package designpattern.factory.abtract;

public class SecureMySQL implements Connection {

	@Override
	public void description() {
		System.out.println("This is Secure MySQL Connection");
	}
}
