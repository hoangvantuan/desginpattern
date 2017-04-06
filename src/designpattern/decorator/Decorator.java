package designpattern.decorator;

public class Decorator {

	public static void start() {

		Shape circle = new Circle();
		RedDecorator red = new RedDecorator(circle);
		BorderDecorator border = new BorderDecorator(red);
		System.out.println(border.draw());
	}
}
