package designpattern.observer.chain;

public class FrontEnd implements Help {

	final int FRONT_END_HELP = 1;
	Help help;

	public FrontEnd(Help help) {
		this.help = help;
	}

	@Override
	public void getHelp(int helpConstant) {

		if(helpConstant != FRONT_END_HELP) {
			help.getHelp(helpConstant);
		} else {
			System.out.println("This is the front end Helper");
		}
	}

}
