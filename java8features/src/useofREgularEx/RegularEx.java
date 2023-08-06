package useofREgularEx;

import java.util.regex.Pattern;

public class RegularEx {
	public static void main(String[] args) {
		String name = "sivasurya@";
		boolean istrue = Pattern.matches(".*[0-9].*", name);
		if (istrue)
			System.out.println("name contians numbers ");
		else
			System.out.println("it does not contains any numbers ");
	}
}