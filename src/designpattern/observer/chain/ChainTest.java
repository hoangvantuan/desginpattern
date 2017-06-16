package designpattern.observer.chain;

public class ChainTest {

	public static void main(String[] args) {

		Application app = new Application();

		Intermediate i = new Intermediate(app);
		FrontEnd f = new FrontEnd(i);
		f.getHelp(1);
		f.getHelp(2);
		f.getHelp(3);
	}
}
