package designpattern.decorator;

public class DecoratorTest {

	public static void main(String[] args) {

		Shape circle = new Circle();
		RedDecorator red = new RedDecorator(circle);
		BorderDecorator border = new BorderDecorator(red);
		System.out.println(border.draw());
	}
}
