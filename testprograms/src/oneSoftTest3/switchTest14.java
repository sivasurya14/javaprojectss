package oneSoftTest3;

public class switchTest14 {
	public static void main(String[] args) {
		String workers = "manager";
		switch (workers) {

		case "manager":
			System.out.println("Arrange meeting , check accounts, collect loan documents , withdraw money");
			break;
		case "acountant":
			System.out.println("check accounts, collect loan documents, withdraw money ,");
			break;
		case "staff":
			System.out.println("loan documents , withdraw money :");
			break;
		case "customer":
			System.out.println("withdraw money");
			break;
		default:
			System.out.println("invalid");

		}

	}

}
