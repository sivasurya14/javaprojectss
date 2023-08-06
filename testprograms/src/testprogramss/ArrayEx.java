package testprogramss;

import java.util.ArrayList;
import java.util.List;

public class ArrayEx {
	public static void main(String[] args) {
		List<String> al= ExampleUtil.getStringList();
		
		System.out.println("--------normal--------------- ");
		al.forEach(a->System.out.println(a));

        System.out.println("--------To print first letter as Uppper case ------");
		al.forEach(cm-> {
			String str=cm.substring(0,1);
			String upper=str.toUpperCase();
			String rest=cm.substring(1,cm.length());
			String ss=upper.concat(rest);
			System.out.println(ss);	
		});
		
		System.out.println("-------TO Print first 3 letters as uppercase--- ");
		al.forEach(cm-> {
			String str=cm.substring(0,3);
			String upper=str.toUpperCase();
			System.out.println(upper);	
		});
		System.out.println("------To Convert List to Array-----");
		String[] ss = al.toArray(new String[0]);
		for(int i=0;i<ss.length;i++) {
			System.out.println(ss[i]);
		}
		
	 System.out.println("---To Iterate the Array VALUES Using Enhanced For Loop---");
	    for(String val: ss) {
	    	System.out.println(val);
	    	}
	    
	 System.out.println("---- To Iterate the Array Values Usinng While Loop---"); 
	    int i=0;
	      while (i<ss.length) {
		    System.out.println(ss[i]);
		     i++;   
	   }
		     
	 }
	 
	 }
		
	

