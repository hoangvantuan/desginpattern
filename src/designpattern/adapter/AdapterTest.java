package designpattern.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		Ace ace = new Ace("Hoang Tuan");
		AceToAcmeAdapter adapter = new AceToAcmeAdapter(ace);

		System.out.println("First Name: " + adapter.getFirstName());
		System.out.println("Last Name: " + adapter.getLastName());
	}
}
