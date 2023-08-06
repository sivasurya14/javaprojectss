package useOFRegex;

public class RegularEx {
	public static void main(String[] args) {
		String name = "siva9877";

		boolean istrue = name.matches("[a-zA-Z0-9]{10}");

		if (istrue)
			System.out.println("name contians numbers ");
		else
			System.out.println("it does not contains");

	}

}
