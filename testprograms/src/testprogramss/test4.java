package testprogramss;

import java.util.List;
import java.util.ArrayList;
public class test4 {
	
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		String a = "22,25,26";
		String []ab = a.split(",");
		for(String sd:ab) {
			int number =Integer.parseInt(sd);
			al.add(number);
		}
		
			 al.forEach(tt->{
				 
				boolean isPrime=true;
				
				for(int j=2; j<tt ; j++) {
				
				 if(tt%j==0) {
					 isPrime=false;
					 break;
				 }
				
			}
			if(isPrime) 
				
				System.out.println(tt+"is prime");
				
			   else 
				   System.out.println(tt+"is not prime");
			});
		}
		
		
		
	}


