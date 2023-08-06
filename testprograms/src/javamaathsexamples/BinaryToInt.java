package javamaathsexamples;

public class BinaryToInt {
	public static void main(String[] args) {
		int num = 6;
		String str = "";
		while(num>0) {
			str=num%2+str;
			num=num/2;
			
		}
		System.out.println(str);
		
		
		
	}

}
