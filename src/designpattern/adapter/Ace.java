package designpattern.adapter;

public class Ace implements IAce{

	private String name;

	public Ace(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
}
