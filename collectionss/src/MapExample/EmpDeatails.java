package MapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpDeatails {
	
	public static void main (String []args) {
		
		Emp a1=new Emp(1,"siva","BE");
		Emp a2=new Emp(2,"guru","arts");
		Emp a3=new Emp(3,"suresh","maths");
		Emp a4=new Emp(4,"dhinesh","physics");
		Emp a5=new Emp(5,"anu","computer");

		List<Emp> li=new ArrayList<Emp>();
		li.add(a1);
		li.add(a2);
		li.add(a3);
		li.add(a4);
		li.add(a5);
	
		System.out.println(li);
		li.forEach(a->System.out.println(a));
		 for(Map.Entry m :li.entryset()) {
		
		
			
		}
		
	}


