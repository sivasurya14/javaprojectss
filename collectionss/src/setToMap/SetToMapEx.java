package setToMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import pojoclass.Student;

public class SetToMapEx {
	

public class StudentDetails {
	public static void main(String[] args) {	
		Student a1=new Student(101,"suresh","maths");
		Student a2=new Student(102,"anu","physics");
		Student a3=new Student(103,"dhinesh","computer");
		Student a4=new Student(104,"viji","biology");
		Student a5=new Student(105,"naveen","statics");
		Set<Student> ss=new HashSet<>();
		ss.add(a5);
		ss.add(a4);
		ss.add(a3);
		ss.add(a2);
		ss.add(a1);
		Map<Integer,Student>li=ss.stream().collect(Collectors.toMap(Student:: getId,Function.identity()));
		li.forEach((k,v)->System.out.println(k+"  "+v));;	
		}
	}}