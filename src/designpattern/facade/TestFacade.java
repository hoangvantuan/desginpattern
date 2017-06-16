package designpattern.facade;

public class TestFacade {

	public static void main(String args[]) {

		SimpleProductFacade simple = new SimpleProductFacade();

		simple.setName("Tuan");
		System.out.println(simple.getName());
	}
}
