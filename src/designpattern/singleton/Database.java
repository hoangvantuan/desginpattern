package designpattern.singleton;

public class Database {

	private static Database singleObject;
	private int record;
	private String name;

	private Database(String n) {
		name = n;
		record = 0;
	}

	public void editRecord(String operation) {
		System.out.println("Performing a " + operation + "operation on record " + record + " in database " + name);
	}

	public String getName() {
		return name;
	}

	public static synchronized Database getInstance(String n) {

		if(singleObject == null) {
			singleObject = new Database(n);
		}

		return singleObject;
	}
}
