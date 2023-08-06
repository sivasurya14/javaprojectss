package SetToList;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import pojoclass.Student;

public class StudentDetails {
	
	public static void main(String[] args) {
		
		Student a1=new Student(101,"suresh","maths");
		Student a2=new Student(102,"anu","physics");
		Student a3=new Student(103,"dhinesh","computer");
		Student a4=new Student(104,"viji","biology");
		Student a5=new Student(105,"naveen","statics");
		
		Set<Student> ss=new HashSet<Student>();
		ss.add(a5);
		ss.add(a4);
		ss.add(a3);
		ss.add(a2);
		ss.add(a1);
		
		List<Student>li=ss.stream().collect(Collectors.toList());
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}}
		
		
		
	
	