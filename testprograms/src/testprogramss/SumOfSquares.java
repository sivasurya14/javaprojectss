package testprogramss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfSquares {
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

        for (int i = 0; i < al.size(); i++) {
			String no = al.get(i);
			  int sdd = Integer.parseInt(no);
			   int sum=0,temp=0;
			  for (int j = 0; j <= sdd; j++) {
				sum = j * j;
				if(sum<=sdd)
                  temp =temp+sum;
				}
				System.out.print(temp);
				System.out.print("  ");
			}	
		}
	}


