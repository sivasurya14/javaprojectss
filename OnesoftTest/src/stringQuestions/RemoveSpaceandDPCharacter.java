package stringQuestions;

public class RemoveSpaceandDPCharacter {
	public static void main(String[] args) {

		String value = "i am working as a developer";

		String newValue = value.replaceAll("\s", "");

		System.out.println("With Duplicate Elelments : " + newValue);

		String withoutDuplicate = "" + value.charAt(0);
		for (int i = 1; i < newValue.length(); i++) {
			if (!withoutDuplicate.contains(String.valueOf(newValue.charAt(i)))) {
				withoutDuplicate = withoutDuplicate + newValue.charAt(i);
			}
		}
		System.out.println("WithOut Duplicate Elements :" + withoutDuplicate);
	}
}
