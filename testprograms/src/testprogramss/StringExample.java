package testprogramss;

import java.util.*;

public class StringExample {
	public static void main(String[] args) {
		String a = "siva";
		String b = "siva";
		String c = new String("siva");
		int aa = a.hashCode();
		int bb = b.hashCode();
		int cc = c.hashCode();

		System.out.println(aa + " " + bb + " " + cc);

	}

}
