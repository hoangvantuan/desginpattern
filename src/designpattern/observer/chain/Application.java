package designpattern.observer.chain;

public class Application implements Help {

	@Override
	public void getHelp(int helpConstant) {
			System.out.println("This is Application");
	}

}
