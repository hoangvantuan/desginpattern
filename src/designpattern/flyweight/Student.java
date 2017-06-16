package designpattern.flyweight;

public class Student {

	String name;
	int id;
	int score;
	double avarageScore;

	public Student(double avarageScore) {
		this.avarageScore = avarageScore;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public double getAvarageScore() {
		return avarageScore;
	}
	public void setAvarageScore(double avarageScore) {
		this.avarageScore = avarageScore;
	}

	public double getStanding() {
		return (((double) score)/ avarageScore - 1.0)*100.0;
	}

}
