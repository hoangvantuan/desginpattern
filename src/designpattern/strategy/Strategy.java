package designpattern.strategy;

public class Strategy {

	public static void start() {

		StreetRacer streetRacer = new StreetRacer();
		FomulaOne fomulaOne = new FomulaOne();
		Helicopter helicopter = new Helicopter();
		Jet jet = new Jet();

		streetRacer.getGo().go();
		fomulaOne.getGo().go();
		helicopter.getGo().go();
		jet.getGo().go();
	}

}
