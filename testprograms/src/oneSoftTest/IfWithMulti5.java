package oneSoftTest;

public class IfWithMulti5 {
	public static void main(String[] args) {
		int marks = 60;
		String medium = "English";
		String state = "Tamilnadu";

		if (marks >= 60) {
			if (medium == "English" && state == "Tamilnadu") {
				System.out.println("Get Admission");
			} else
				System.out.println("No admission");
		} else
			System.out.println("No admission");
	}
}
