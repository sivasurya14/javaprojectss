package Java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterUsingLamdaEx {
	public static void main(String[] args) {

		HashMap<Integer, Student> li = new HashMap<>();
		li.put(1, new Student(101, "siva", 450));
		li.put(2, new Student(202, "shiva", 448));
		li.put(3, new Student(303, "arun", 452));
		li.put(4, new Student(404, "ezhil", 453));
		// li.forEach((k, v) -> System.out.println(k + " " + v));
		// for (Map.Entry m : li.entrySet()) {
		// System.out.println(m.getKey() + " " + m.getValue());

		List<Integer> sd = li.keySet().stream().collect(Collectors.toList());

		Iterator<Integer> itr = sd.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		List<Student> ss = li.values().stream().collect(Collectors.toList());

		Iterator<Student> itr1 = ss.iterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		int marks = ss.stream().collect(Collectors.summingInt(List -> List.mark));

		System.out.println("total marks of the student ");
		System.out.println("    ");
		System.out.println("Total mark is " + marks);
		System.out.println("   ");
		System.out.println("filter the name :");
		System.out.println("   ");
		List<Student> ma = ss.stream().filter(a -> a.getName().contains("s")).collect(Collectors.toList());
		System.out.println(ma);
		System.out.println("get names less than 450 marks :");
		System.out.println("   ");

		List<Student> mar = ss.stream().filter(s -> s.getMark() > 450).collect(Collectors.toList());
		System.out.println(mar);

		System.out.println("    ");
//		for(Student ad  :ss) {
//			System.out.println(ad.name+" "+ad.mark);
//		}

		System.out.println("<<<<<<<<<<get only marks from students>>>>>");
		System.out.println(" ");

		List<Integer> avera = new ArrayList<>();

		for (Student ave : ss) {
			avera.add(ave.mark);
		}
		System.out.println(avera);

		System.out.println("filter the value using stream method in java>>>>>");

		ss.stream().filter(passmark -> passmark.mark > 400 && passmark.mark < 460)
				.forEach(passmark -> System.out.println(passmark.name));

		System.out.println("filter the marks using stream method in java>>>>>");

		ss.stream().filter(passmark -> passmark.mark > 400 && passmark.mark < 460)
				.forEach(passmark -> System.out.println(passmark.mark));

		System.out.println("find the average of the total marks of student >>>>>");

		ss.stream().filter(passmark -> passmark.mark > 400 && passmark.mark < 460)
				.forEach(passmark -> System.out.println(passmark.name));

		System.out.println("average marks of the value >>>>>");

		double average = ss.stream().collect(Collectors.averagingDouble(List -> List.mark));
		System.out.println("  ");
		System.out.println("average marks of the student " + average);
		System.out.println();

		List<Integer> avera1 = new ArrayList<>();

		for (Student ave : ss) {
			avera1.add(ave.mark);
		}

		System.out.println("Count total of the values using stream count method :");
		System.out.println("  ");
		Long noOfElements = ss.stream().count();
		System.out.println("Total count of the marks is :" + noOfElements);
		
		System.out.println("find first student of the values using findfirst metod ");
		System.out.println("    ");
		Optional<Student> noOf = ss.stream().findFirst();
		
		System.out.println(noOf);
	}
}
