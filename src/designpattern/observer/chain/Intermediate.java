package designpattern.observer.chain;

public class Intermediate implements Help {

	final int INTERMEDIATE_HELP = 2;
	Help help;

	public Intermediate(Help help) {
		this.help = help;
	}

	@Override
	public void getHelp(int helpConstant) {

		if(helpConstant != INTERMEDIATE_HELP) {
			help.getHelp(helpConstant);
		} else {
			System.out.println("This is Intermediate");
		}
	}

}
