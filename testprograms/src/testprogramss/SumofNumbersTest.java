package testprogramss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumofNumbersTest {

	public static void main(String[] args) {
		String b = "4,23,45,64,11,7,8";
		List<String> al = new ArrayList<>();
		al = Arrays.asList(b.split(","));
		List<Integer> num = new ArrayList<>();
		for (String sd : al) {
			int number = Integer.parseInt(sd);
			num.add(number);
		}
     System.out.println("****INCREMENTAL ADDITION ****");
     System.out.println("  ");

        for (int i = 0; i < al.size(); i++) {
			String no = al.get(i);
			  int sdd = Integer.parseInt(no);
			   int sum=0;
			  for (int j = 0; j <= sdd; j++) {
				sum = sum + j;

			}
			System.out.print(sum);
			System.out.print("  ");
		}
	}
}
