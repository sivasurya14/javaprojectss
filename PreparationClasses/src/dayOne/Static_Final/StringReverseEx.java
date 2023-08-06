package dayOne.Static_Final;

public class StringReverseEx {

	public String reverseString(String values) {

		String rev = "";
		char ch[] = values.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			rev += ch[i];
		}
		return rev;
	}
	public static void main(String[] args) {
		StringReverseEx obj = new StringReverseEx();
		System.out.println(obj.reverseString("SivaD"));
	}
}
