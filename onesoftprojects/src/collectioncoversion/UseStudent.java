package collectioncoversion;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {

		ArrayList<StudentEntity> list = new ArrayList<>();

		StudentEntity s1 = new StudentEntity(101, "siva", "BSC", "AAC", 60);
		StudentEntity s2 = new StudentEntity(102, "davitha", "MBA", "VTU", 90);
		StudentEntity s3 = new StudentEntity(103, "dinesh", "Msc", "MMS", 80);
		StudentEntity s4 = new StudentEntity(104, "Viji", "Msc", "MMS", 90);
		StudentEntity s5 = new StudentEntity(105, "suresh", "Bsc", "AAG", 75);

		list.add(s5);
		list.add(s4);
		list.add(s3);
		list.add(s2);
		list.add(s1);

		Set<StudentEntity> newlist = list.stream().collect(Collectors.toSet());
		newlist.forEach(x -> System.out.println(x));
		
		Map<Integer, StudentEntity> map = list.stream()
				.collect(Collectors.toMap(StudentEntity::getId, Function.identity()));

		map.forEach((k, v) -> System.out.println(k + " " + v));

	    //Converting Map into Set
		System.out.println("\n");
		System.out.println("Coverting map into set : ");
  	    Set<Integer> key = map.keySet().stream().collect(Collectors.toSet());
		key.forEach(x -> System.out.println(x));
     	Set<StudentEntity> values = map.values().stream().collect(Collectors.toSet());
		values.forEach(y -> System.out.println(y));
		
		//Map to List 
		System.out.println("\n");
		System.out.println("converting map into list: ");
		
	//	List<StudentEntity> newlist =map.values() 
		
   
		
		
				
	}

}
