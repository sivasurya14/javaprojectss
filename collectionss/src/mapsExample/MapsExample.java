package mapsExample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapsExample {
	



	public static void main(String[] args) {

		Map<Integer,String> sg = new HashMap <Integer,String>();

		sg.put(23,"apple");
		sg.put(34,"bala");
		sg.put(12,"cat");
		sg.put(21,"tommy");
		sg.put(23,"zebra");
      // for(Entry<Integer, String> m :sg.entrySet()) {
    	   
    	   
    	//   System.out.println(m.getKey()+" "+m.getValue());
		// another method of iterator for map
		
		sg.forEach((k,v)->System.out.println(k+" "+v)); 
    	   
       }
		}
		


