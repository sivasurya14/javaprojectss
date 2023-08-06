package MapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class EmployeeMap {
	

	public static void main (String []args) {
		
		Emp a1=new Emp(1,"siva","BE");
		Emp a2=new Emp(1,"guru","arts");
		Emp a3=new Emp(3,"suresh","maths");
		Emp a4=new Emp(4,"dhinesh","physics");
		Emp a5=new Emp(5,"anu","computer");

		Map<Integer,Emp> sd=new HashMap<Integer,Emp>();
		sd.put(1,a1);
		sd.put(2,a2);
		sd.put(3,a3);
		sd.put(4,a4);
		sd.put(5,a5);
	
		//System.out.println(sd);
		
		 Iterator<ConcurrentHashMap.Entry<Integer, Emp> > itr = sd.entrySet().iterator();

     // The hasNext() method is used to check if there is
     // a next element The next() method is used to
     // retrieve the next element
     while (itr.hasNext()) {
         ConcurrentHashMap.Entry<Integer, Emp> entry
             = itr.next();
         System.out.println("Key = " + entry.getKey()
                            + ", Value = "
                            + entry.getValue());
     }
		
		
		
		
		
		sd.forEach((k,v)->System.out.println(k+" "+v));
			
		}
		
	}





