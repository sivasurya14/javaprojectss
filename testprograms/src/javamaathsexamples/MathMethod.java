package javamaathsexamples;

public class MathMethod {
	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		System.out.println(Math.sqrt(a) + " " + Math.sqrt(b));
		int aa[] = { 2, 3, 4, 5, 6 };
		StringBuilder string = new StringBuilder("sivad");
		StringBuilder string1 = new StringBuilder("sivasuriyan");
	    System.out.println(string);
	    System.out.println(string1);
	    string.delete(2, 3);
		string1.trimToSize();
		System.out.println(string1);
		string.deleteCharAt(3);
		System.out.println(string);
		System.out.println(string.indexOf("surya"));
		System.out.println(string.codePointAt(b));
		System.out.println(Math.max(a, b));
	}
}
