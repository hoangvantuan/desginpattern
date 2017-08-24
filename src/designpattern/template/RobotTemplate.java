package designpattern.template;

public abstract class RobotTemplate {

	protected void start() throws InterruptedException {
		System.out.println("Robot is starting...");
		Thread.sleep(2000);
		System.out.println("Robit is Started");
	}

	protected void run() {
		System.out.println("Robot is running");
	}

	protected void getPart() throws InterruptedException {
		System.out.println("Robot is getting part");
		Thread.sleep(1000);
		System.out.println("Part is getted");
	}

	protected void stop() throws InterruptedException  {
		System.out.println("Robot is stoppng...");
		Thread.sleep(2000);
		System.out.println("Robit is Stopped");
	}

	protected void active() throws InterruptedException {
		start();
		run();
		getPart();
		stop();
	}
}
