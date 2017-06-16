package designpattern.factory;

import designpattern.factory.abtract.NormalConnection;
import designpattern.factory.abtract.SecondFactory;
import designpattern.factory.abtract.SecureConnection;
import designpattern.factory.method.FirstFactory;

public class FactoryTest {

	public static void main(String[] args) {
		FirstFactory factory;

		System.out.println("--------------------FACTORY METHOD----------------------------------");

		factory = new FirstFactory("MySQL");
		factory.createConnect().description();

		factory = new FirstFactory("Oracle");
		factory.createConnect().description();

		factory = new FirstFactory("PostgresSQL");
		factory.createConnect().description();

		System.out.println("--------------------ABSTRACT FACTORY METHOD----------------------------------");

		SecondFactory factory2 = new NormalConnection("MySQL");
		factory2.createConnection().description();

		factory2 = new SecureConnection("OracleSQL");
		factory2.createConnection().description();
	}


}
