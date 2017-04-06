package designpattern.decorator;

public class RedDecorator extends ShapeDecorator {

	public RedDecorator(Shape shape) {

		super(shape);
	}

	@Override
	public String draw() {
		return super.draw() + " with red color ";
	}

}
