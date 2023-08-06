package oneSoftTest3;

public class SwitchTest18 {
	public static void main(String[] args) {
		String day = "sunday";
		switch (day) {
		case "sunday":
			System.out.println("1,2,3,4,5,6,7");
			break;
		case "monday":
			System.out.println("2,3,4,5,6,7");
			break;
		case "tuesday":
			System.out.println("3,4,5,6,7");
			break;
		case "wednesday":
			System.out.println("4,5,6,7");
			break;
		case "thursday":
			System.out.println("5,6,7");
			break;
		case "friday":
			System.out.println("6,7");
			break;
		case "saturday":
			System.out.println("7");
			break;
		default:
			System.out.println("invalid");

		}

	}

}
