package designpattern.flyweight;

public class FlyweightTest {

	public static void main(String args[]) {
		String names[] = {"yamada", "santo", "maria"};
		int ids[] = {1001, 1002, 1003};
		int scores[] = {45, 55, 65};

		double total = 0;
		for(int i=0; i<scores.length; i++) {
			total +=scores[i];
		}

		double avarageScore = total/scores.length;

		Student student = new Student(avarageScore);

		for(int i=0; i<scores.length; i++) {
			student.setName(names[i]);
			student.setId(ids[i]);
			student.setScore(scores[i]);

			System.out.println("Name: " + student.getName());
			System.out.println("Standing: " + Math.round(student.getStanding()) + "\n");

		}
	}
}
