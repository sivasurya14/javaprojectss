package MaptoSet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import pojoclass.Student;

public class MapToSetEx {

	public static void main(String[] args) {
		
		Student a1=new Student(1,"suresh","maths");
		Student a2=new Student(2,"anu","physics");
		Student a3=new Student(103,"dhinesh","computer");
		Student a4=new Student(104,"viji","biology");
		Student a5=new Student(105,"naveen","statics");
		
		Map<Integer,Student> ss=new HashMap<Integer,Student>();
		ss.put(1,a5);
		ss.put(2,a4);
		ss.put(3,a3);
		ss.put(4,a2);
		ss.put(5,a1);
		
		Set<Integer>sa=ss.keySet().stream().collect(Collectors.toSet());
		Iterator sd=sa.iterator();
		while(sd.hasNext()) {
			System.out.println(sd.next());
			Set<Student>valuelist=ss.values().stream().collect(Collectors.toSet());
			Iterator itr =valuelist.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				
				
				
			
			
		}

}}}
