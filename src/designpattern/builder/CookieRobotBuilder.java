package designpattern.builder;

import java.util.ArrayList;

public class CookieRobotBuilder implements RobotBuilder {

	public CookieRobotBuildable robot;
	public ArrayList<Integer> actions;

	public CookieRobotBuilder() {
		robot = new CookieRobotBuildable();
		actions = new ArrayList<Integer>();
	}

	@Override
	public void addGetParts() {
		actions.add(2);
	}

	@Override
	public void addStart() {
		actions.add(1);
	}

	@Override
	public void addStop() {
		actions.add(3);
	}

	@Override
	public void addTest() {
		actions.add(4);
	}

	@Override
	public RobotBuildable getRobot() {
		robot.loadActions(actions);
		return robot;
	}
}
