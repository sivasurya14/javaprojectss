package dateAndTime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Year;
import java.util.Calendar;

public class DateCeckEX {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomo = date.plusDays(1);
		LocalDate year = date.now();
         Year sd=Year.now();
         Clock c =Clock.systemUTC();
        int cl = Calendar.DAY_OF_MONTH;
        
         
         
        LocalDate y =sd.atDay(365);
     	boolean d1 = sd.isLeap();
		LocalTime time = LocalTime.now();

		System.out.println("to print date"+date);
		System.out.println("To print a yesterday"+yesterday);
		System.out.println(d1);
		System.out.println(sd);
		System.out.println(time);
		System.out.println(c);
		System.out.println(cl);


		
		if (d1)
			System.out.println(sd+ " is  a leap year ");
		else
			System.out.println(sd+ " is not a leap year");
	}
}
