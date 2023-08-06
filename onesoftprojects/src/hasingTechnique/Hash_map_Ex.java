package hasingTechnique;

import java.util.concurrent.ConcurrentHashMap;

public class Hash_map_Ex {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> values = new ConcurrentHashMap<>();
		values.put(101, "dinesh");
		values.put(102, "davitha");
		values.put(103, "suresh");
		values.put(104, "guru");

		for (Integer i : values.keySet()) {
         // if(!values.get(i).equals("viji")) {
		//	values.put(105, "viji");
			values.putIfAbsent(105, "viji");
			
			//values.put(105, "viji");
			System.out.println(i + " " + values.get(i));
           }
		}

	}

