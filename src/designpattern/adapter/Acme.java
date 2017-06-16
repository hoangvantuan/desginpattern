package designpattern.adapter;

public class Acme implements IAcme {

	private String firstName;
	private String lastName;

	public Acme(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
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
