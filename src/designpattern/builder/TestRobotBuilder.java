package designpattern.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestRobotBuilder {

	public static void main(String[] args) {

		RobotBuilder builder;
		RobotBuildable robot;
		String response = "a";

		System.out.println("Do you want cookie robot [c] or an Automotive one [a] ?");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			response = reader.readLine();
		} catch(IOException e) {
			e.printStackTrace();
		}

		builder = new CookieRobotBuilder();

		builder.addStart();
		builder.addTest();
		builder.addGetParts();
		builder.addStop();

		robot = builder.getRobot();

		robot.go();

	}

}
