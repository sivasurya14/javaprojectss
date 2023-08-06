package stringQuestions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringIntoDate {
	public static void main(String[] args) throws Exception {
		
		
		String dateS1 ="2/2/2342";
		
		Date dates2 = new SimpleDateFormat("dd/MM/yyy").parse(dateS1);
	
		System.out.println(dates2);
		
		
	}

}
