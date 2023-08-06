package testprogramss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class SuccessiveOfNumbers {
	
	public static void main(String[] args) {
		String b ="2,3,4,5,6,7,8";
		List<String> al = new ArrayList<>();
		al =Arrays.asList(b.split(","));
		List<Integer> num = new ArrayList<>();
		for(String sd:al) {
		int number =Integer.parseInt(sd);
		num.add(number);
		}
		int sum=0,temp;
		System.out.println("####  SUCCESSIVE NUMBES ####");
		for(int i =0; i<num.size();i++) {
			
		    sum = num.get(i) + 1 + num.get(i);
		      
		    
		
			System.out.print(sum);
			System.out.print("  ");
		}


			}
	
}
