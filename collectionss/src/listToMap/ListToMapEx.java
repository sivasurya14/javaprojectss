package listToMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import pojoclass.Student;

public class ListToMapEx {
	
	public static void main(String[] args) {
		Student a1 = new Student(101, "suresh", "maths");
		Student a2 = new Student(102, "anu", "physics");
		Student a3 = new Student(103, " ", "computer");
		Student a4 = new Student(104, "viji", "biology");
		Student a5 = new Student(105, "viji", "statics");
		List<Student> ss = new ArrayList<Student>();
		ss.add(a5);
		ss.add(a4);
		ss.add(a3);
		ss.add(a2);
		ss.add(a1);
		// Map<Integer, Student> li =
		// ss.stream().collect(Collectors.toMap(Student::getId, Function.identity()));
		Map<Integer, Student> li = ss.stream().collect(Collectors.toMap(x -> x.getId(), y -> y));
		li.forEach((k, v) -> System.out.println(k + " " + v));
	}
}
