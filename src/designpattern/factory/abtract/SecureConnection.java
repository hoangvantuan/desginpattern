package designpattern.factory.abtract;

public class SecureConnection extends SecondFactory {

	private String type;

	public SecureConnection(String type) {
		this.type = type;
	}

	@Override
	public Connection createConnection() {
		switch(type) {
		case "MySQL":
			return new SecureMySQL();
			default: return new SecureOracleSQL();
		}
	}
}
