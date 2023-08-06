package oneSoftTest;

public class NestedIfTest5 {
	public static void main(String[] args) {
		int marks =49;

		if (marks <=50)
			System.out.println(marks + " is Fail");
		if (marks <= 100 & marks >= 90)
			System.out.println(marks + " is First Class");
		if (marks < 90 && marks >= 80)
			System.out.println(marks + " is Second class");
		if (marks < 80 && marks >= 70)
			System.out.println(marks + " is Third class");
		if (marks < 70 && marks >=50)
			System.out.println(marks + " just pass");

	}

}
