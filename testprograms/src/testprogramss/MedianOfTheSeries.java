package testprogramss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianOfTheSeries {

	public static void main(String[] args) {
		String b = "12,17,34,64,11,7,8";
		List<String> al = new ArrayList<>();
		al = Arrays.asList(b.split(","));
		List<Integer> num = new ArrayList<>();
		for (String sd : al) {
			int number = Integer.parseInt(sd);
			num.add(number);
		}
		System.out.println("****sum of the squares in index ****");
		System.out.println("  ");
		int temp = 0,temp1=0,temp2=0;
		for (int i = 0; i < num.size(); i++) {
			int temp11=num.get(i);
			for (int j = i + 1; j <= num.size(); j++) {
				int temp3=num.get(j);
				if(num.get(i)>num.get(j))
				temp=temp11;
				temp11=temp3;
				temp3=temp;
				
			}
		}
	
	for(int i=0; i<num.size();i++) {
		
		System.out.println(num.get(i));
	}
		
	}
	
}