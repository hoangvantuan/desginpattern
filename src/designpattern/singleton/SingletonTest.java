package designpattern.singleton;

public class SingletonTest {

	public static void main(String[] args) {

		Database database;

		database = Database.getInstance("Products");
		System.out.println("This is the " + database.getName() + " database.");

		database = Database.getInstance("Products2");
		System.out.println("This is the " + database.getName() + " database.");
	}
}
