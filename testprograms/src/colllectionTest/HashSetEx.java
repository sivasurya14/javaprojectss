package colllectionTest;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashSetEx {
	public static void main(String args[]) {
		// Creating HashSet and adding elements
		Hashtable<Integer, String> set = new Hashtable<>();
		set.put(22, "siva");
		set.put(23, "guru");
		set.put(24, "dhinesh");
		set.put(25, "suresh");
		for (Map.Entry<Integer, String> map : set.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}
	}
}
