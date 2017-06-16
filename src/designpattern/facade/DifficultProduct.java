package designpattern.facade;

public class DifficultProduct {

	char name[] = new char[7];

	public DifficultProduct() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void setFirsChar(char c) {
		name[0] = c;
	}

	public void setSecondChar(char c) {
		name[1] = c;
	}

	public void setThirdChar(char c) {
		name[2] = c;
	}

	public void setFourthChar(char c) {
		name[3] = c;
	}

	public void setFiftChar(char c) {
		name[4] = c;
	}

	public void setSixChar(char c) {
		name[5] = c;
	}

	public void setSevenChar(char c) {
		name[6] = c;
	}

	public String getName() {
		return new String(name);
	}

}
