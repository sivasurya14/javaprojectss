package day3class;

import java.util.Hashtable;

public class HashingHashtable {
	public static void main(String[] args) {

		
		Hashtable<Integer, String> list = new Hashtable<>(5);
		
		list.put(101, "siva");
		list.put(102, "guru");
		list.put(103, "davitha");
		list.put(104, "dinesh");
		list.put(111, "viji");
		
		
	    list.forEach((k,v)->
	    System.out.println(k+" "+v+ " "+k.hashCode()%5)
	    		);		
		}
	}

