package testprogramss;

import java.util.Arrays;
import java.util.List;

public class Test2 {
	public static void main(String []args) {
	   String a= "11,23,34,45";
	   String []sdd=a.split(",");
	  
	   for(String sd:sdd) {
		   
	   }
	   
	   List<String> str =Arrays.asList(sdd);
	   
	   str.forEach(ss->{
       String upper=ss.toUpperCase();
		            
		            System.out.print(upper+" ");
	                   }
	   
			   );
	   
	}

	
}
