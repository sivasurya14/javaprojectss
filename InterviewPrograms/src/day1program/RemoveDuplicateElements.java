package day1program;

public class RemoveDuplicateElements {
	public static void main(String[] args) {

		String value = "onesofttechnologieso";

		int count = 0;
		System.out.println("normal String  : " + value);

		String withoutDuplicate = "" + value.charAt(0);
		for (int i = 1; i < value.length(); i++) {
			if (!withoutDuplicate.contains(String.valueOf(value.charAt(i)))) {
				withoutDuplicate = withoutDuplicate + value.charAt(i);
			}
		}
		System.out.println("Duplicate Elements in the list :" + withoutDuplicate);

		for (int i = 0; i < withoutDuplicate.length(); i++) {
			for (int j = 0; j < value.length(); j++) {
				if (withoutDuplicate.charAt(i) == value.charAt(j)) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(withoutDuplicate.charAt(i) + ":" + count);
				count = 0;
			}

		}

	}
}
