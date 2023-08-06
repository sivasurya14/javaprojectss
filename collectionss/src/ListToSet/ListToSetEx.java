package ListToSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import pojoclass.Student;

public class ListToSetEx {
	
	public static void main(String[] args) {
		
		Student a1=new Student(101,"suresh","maths");
		Student a2=new Student(102,"anu","physics");
		Student a3=new Student(103,"dhinesh","computer");
		Student a4=new Student(104,"viji","biology");
		Student a5=new Student(105,"naveen","statics");
		
		List<Student> ss=new ArrayList<Student>();
		ss.add(a5);
		ss.add(a4);
		ss.add(a3);
		ss.add(a2);
		ss.add(a1);
		
		Set<Student>li=ss.stream().collect(Collectors.toSet());
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}}
		
		
		
	
	


