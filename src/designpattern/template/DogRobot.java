package designpattern.template;

public class DogRobot extends RobotTemplate {

	@Override
	protected void getPart() {
		System.out.println("Get ball");
	}
}
