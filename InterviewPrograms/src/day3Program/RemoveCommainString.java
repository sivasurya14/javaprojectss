package day3Program;

public class RemoveCommainString {

	public static void main(String[] args) {

		String value = "1,2,3,4,5,6";

		String newValue = value.replaceAll(",","");

		System.out.println(newValue);

	}
}
