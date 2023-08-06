package testprogramss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeanOfTheSeries {
	public static void main(String[] args) {
		String b = "2,3,4,5,6,7,8";
		List<String> al = new ArrayList<>();
		al = Arrays.asList(b.split(","));
		List<Integer> num = new ArrayList<>();
		for (String sd : al) {
			int number = Integer.parseInt(sd);
			num.add(number);
		}
     System.out.println("****Mean of the numbers ");
     System.out.println("  ");
       int sum=0,temp=0;
     for(int i=0;i<num.size();i++) {
    	 sum=sum+num.get(i);
    	 temp=sum/num.size();
			}
     System.out.println(temp);
		}
   
}
