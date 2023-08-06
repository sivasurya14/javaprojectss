package day4Program;

public class CombineTwoString {

	public String combineString(String name1, String name2) {

		int no = name1.length() / 2;

		String newValue = name1.substring(0, no) + name2 + name1.substring(no, name1.length());

		return newValue;
	}

	public static void main(String[] args) {

		CombineTwoString c = new CombineTwoString();

		System.out.println(c.combineString("vi", "suriya"));

	}
}
