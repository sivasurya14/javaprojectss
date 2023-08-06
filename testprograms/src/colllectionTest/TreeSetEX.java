package colllectionTest;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEX {

	public static void main(String args[]) {
		TreeSet<Integer> set = new TreeSet();
		 set.add(22);    
         set.add(21);    
         set.add(25);   
         set.add(33);  
         set.add(35);  
		Iterator<Integer> i = set.iterator();
	    	while (i.hasNext()) {
			  System.out.println(i.next());
		}
	}
}
