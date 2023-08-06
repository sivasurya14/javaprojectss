package oneSoftTest3;

public class SwitchTest4 {
	public static void main(String[] args) {
		String lang = "Assembly language";
		switch (lang) {
		case "java", "php":
			System.out.println("High level language ");
			break;
		case "python":
			System.out.println(" Advance High level language");
			break;

		case "Machine language", "Assembly language":
			System.out.println("Low level language");

		}
	}
}
