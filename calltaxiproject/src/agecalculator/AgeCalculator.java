package agecalculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		
		System.out.println("enter your DOB to get your age :");

		Scanner scan = new Scanner(System.in);

		String dob = scan.next();

		System.out.println("ypur DOB is " + dob);
		
	}

}
