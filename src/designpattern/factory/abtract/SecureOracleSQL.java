package designpattern.factory.abtract;

public class SecureOracleSQL implements Connection {

	@Override
	public void description() {
		System.out.println("This is Secure Oracle Connection");
	}

}
