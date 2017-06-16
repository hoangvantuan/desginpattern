package designpattern.factory.abtract;

public class NormalConnection extends SecondFactory{

	private String type;

	public NormalConnection(String type) {
		this.type = type;
	}

	@Override
	public Connection createConnection() {
		switch(type) {
		case "MySQL":
			return new MySQL();
			default: return new OracleSQL();
		}
	}
}
