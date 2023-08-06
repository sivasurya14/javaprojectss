package oneSoftTest3;

public class SwitchTest13 {
	public static void main(String[] args) {
		String perm = "principle";
		switch (perm) {
		case "principle":
			System.out.println(" you are allowed to go principle room , staff room, class room , exam hall ");
			break;
		case "staff":
			System.out.println(" staff room , class room , exam hall");
			break;
		case "student":
			System.out.println("class room , exam room");
			break;
		default:
			System.out.println("others not allowed ");

		}

	}

}
