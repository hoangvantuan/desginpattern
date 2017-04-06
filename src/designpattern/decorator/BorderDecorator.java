package designpattern.decorator;

public class BorderDecorator extends ShapeDecorator {

	public BorderDecorator(Shape shape) {

		super(shape);
	}

	@Override

	public String draw() {
		return super.draw() + " with border ";
	}
}
