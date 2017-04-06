package designpattern.decorator;

public abstract class ShapeDecorator implements Shape {

	private Shape shape;

	public ShapeDecorator(Shape shape) {

		this.shape = shape;
	}

	public String draw() {
		return shape.draw();
	}
}
