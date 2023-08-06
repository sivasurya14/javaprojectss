package timetest;

import java.time.LocalTime;
import java.util.Date;

public class TimeTest {
	public static void main(String[] args) {
		LocalTime sd = LocalTime.now();
		Date dd = new Date();
		
		int hours = dd.getHours();
		
		int min =dd.getMinutes();
		
		int sec =dd.getSeconds();
		
		System.out.println();
		System.out.println(min +" "+sec);
		if (hours > 16)
			System.out.println("good evening");
		else if (hours >12) 
			System.out.println("good after noon");
		else	
		System.out.println("good morning");
		
		System.out.println(hours);
	
		System.out.println(sd);
	}
	
	
}
