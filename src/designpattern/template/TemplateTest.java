package designpattern.template;

public class TemplateTest {

	public static void main(String[] args) throws InterruptedException {

		RobotTemplate rb = new DogRobot();
		rb.active();
	}

}
