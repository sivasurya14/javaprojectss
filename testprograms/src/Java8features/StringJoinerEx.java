package Java8features;

import java.util.StringJoiner;

public class StringJoinerEx {
	public static void main(String[] args) {
		
		StringJoiner name = new StringJoiner("-"," ["," ]");
		   name.add("siva");
		   name.add("dhinesh");
		   name.add("suresh");
		   name.add("anu");
		   name.add("gurubaran");
		
		   
		   
		   System.out.println(name);
		
		
	}
	

}
