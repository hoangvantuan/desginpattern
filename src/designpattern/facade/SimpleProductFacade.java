package designpattern.facade;

public class SimpleProductFacade {

	private DifficultProduct difProduct;

	public SimpleProductFacade() {
		difProduct = new DifficultProduct();
	}

	public void setName(String n) {
		char chars[] = n.toCharArray();

		if(chars.length > 0) {
			difProduct.setFirsChar(chars[0]);
		}

		if(chars.length > 1) {
			difProduct.setSecondChar(chars[1]);
		}

		if(chars.length > 3) {
			difProduct.setThirdChar(chars[2]);
		}

		if(chars.length > 3) {
			difProduct.setFourthChar(chars[3]);
		}

		if(chars.length > 4) {
			difProduct.setFiftChar(chars[4]);
		}

		if(chars.length > 5) {
			difProduct.setSixChar(chars[5]);
		}

		if(chars.length > 6) {
			difProduct.setSevenChar(chars[6]);
		}
	}

	public String getName() {
		return difProduct.getName();
	}
}
