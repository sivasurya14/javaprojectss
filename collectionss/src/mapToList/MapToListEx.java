package mapToList;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import pojoclass.Student;

public class MapToListEx {

	public static void main(String[] args) {

		Student a1 = new Student(101, "suresh", "maths");
		Student a2 = new Student(102, "anu", "physics");
		Student a3 = new Student(103, "dhinesh", "computer");
		Student a4 = new Student(104, "viji", "biology");
		Student a5 = new Student(105, "naveen", "statics");
		Student a6 = new Student(106, "naveen", "statics");

		Map<Integer, Student> ss = new HashMap<Integer, Student>();
		ss.put(1, a5);
		ss.put(2, a4);
		ss.put(3, a3);
		ss.put(4, a2);
		ss.put(5, a1);

		List<Integer> li = ss.keySet().stream().collect(Collectors.toList());

		// System.out.println(li);

		List<Student> valuelist = ss.values().stream().collect(Collectors.toList());
		long countDistinct = valuelist.stream().distinct().count();

		System.out.println("Count of distinct value " + countDistinct);
		for (Student sd : valuelist) {
			System.out.println(sd);

		}

	}
}
