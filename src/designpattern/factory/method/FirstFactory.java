package designpattern.factory.method;

public class FirstFactory {

	protected String type;

	public FirstFactory(String t) {
		this.type = t;
	}

	public Connection createConnect() {
		switch(type) {
		case "Oracle":
			return new OracleSQL();
		case "MySQL":
			return new MySQL();
			default: return new PostgresSQL();
		}
	}

}
