package testprogramss;

import java.util.Arrays;

public class StringToInt {

	public static void main(String[] args) {
		String val = "1,2,3,4,5,6,7";
		String val1[] = val.split(",");
		int a[] = new int[val1.length];
		for (int i = 0; i < val1.length; i++) {
			a[i] = Integer.parseInt(val1[i]);
		}
		System.out.println(Arrays.toString(a));
	}
	
}
