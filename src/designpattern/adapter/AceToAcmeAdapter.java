package designpattern.adapter;

public class AceToAcmeAdapter implements IAcme {

	private Ace ace;
	private String firstName;
	private String lastName;

	public AceToAcmeAdapter(Ace ace) {
		this.ace = ace;

		firstName = ace.getName().split(" ")[0];
		lastName = ace.getName().split(" ")[1];
	}

	@Override
	public void setFirstName(String fn) {
		this.firstName = fn;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public void setLastName(String ln) {
		this.lastName = ln;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

}
