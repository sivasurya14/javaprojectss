package MapExample;

import java.util.Hashtable;

public class Hash_Table_TestEx {
	public static void main(String[] args) {

//	Hashtable< Integer,String> values = new Hashtable<>(10);
//	values.put(121, "vivo");
//	values.put(226, "samsung");
//	values.put(333, "redmi");
//	
//	for(Integer value : values.keySet()) {
//		
//		System.out.println(value.hashCode()%10 +" "+ value + " "+values.get(value));
//	}

		Hashtable<String, String> values = new Hashtable<>();
		values.put("121", "vivo");
		values.put("232", "samsung");
		values.put("333", "redmi");

		for (String value : values.keySet()) {

			System.out.println(value.hashCode() % 10 + " " + value.hashCode() + " " + values.get(value));
		}

	}

}
