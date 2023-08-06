package streamapiexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentRFilter {
	public static void main(String[] args) {

		ArrayList<StudentRecord> record = new ArrayList<>(4);
		record.add(new StudentRecord(251, "siva", "bsc", 55));
		record.add(new StudentRecord(252, "davitha", "bsc", 100));
		record.add(new StudentRecord(253, "anusuya", "bsc", 70));
		record.add(new StudentRecord(254, "suresh", "bsc", 100));
		record.add(new StudentRecord(255, "dhinesh", "bsc", 99));
		record.add(new StudentRecord(256, "viji", "bsc", 60));
		record.add(new StudentRecord(257, "gayathri", "bsc", 10));

		System.out.println();
		System.out.println("###### FILTERING THE VALUES THAT MORE THAN 50 PERCENTAGE #######");
		List<StudentRecord> sorted1 = record.stream().filter(x -> x.getPercentage() > 50).collect(Collectors.toList());
		System.out.println(sorted1);

		System.out.println();
		System.out.println("######### SORTING THE VALUES WITH COMPARING PERCENTAGE #############");
		List<StudentRecord> sorted2 = record.stream()
				.sorted((o1, o2) -> (int) (o1.getPercentage() - o2.getPercentage())).collect(Collectors.toList());
		System.out.println(sorted2);

		System.out.println();
		System.out.println("######## SORTING THE VALUES IN REVERSE ORDER USING PERCENTAGE#########");
		List<StudentRecord> sorted3 = record.stream()
				.sorted(Comparator.comparingLong(StudentRecord::getPercentage).reversed()).collect(Collectors.toList());

		System.out.println(sorted3);
		System.out.println();
		System.out.println("############ FILTER THE RECORD WITH PARTICULAR VALUES ");
		List<StudentRecord> sorted4 = record.stream().filter(x -> x.getName().startsWith("s"))

				.collect(Collectors.toList());
		System.out.println(sorted4);

		System.out.println();
		System.out.println("######### SORTING THE VALUES USING COMPARE AND SORTED METHOD ########");
		List<StudentRecord> sorted5 = record.stream().sorted(Comparator.comparing(StudentRecord::getName).reversed())
				.collect(Collectors.toList());

		System.out.println(sorted5);
		System.out.println();

		System.out.println("######### SORTING THE VALUES WITH COMPARING PERCENTAGE #############");
		List<StudentRecord> sorted8 = record.stream()
				.sorted((o1, o2) -> (int) (o1.getPercentage() - o2.getPercentage())).collect(Collectors.toList());
		sorted8.forEach(k8 -> System.out.println(k8));
		System.out.println();

		System.out.println("######### SORTING THE VALUES WITH COMPARING  PERCENTAGE ANTOHER MEETHOD #############");
		List<StudentRecord> sorted9 = record.stream().sorted(Comparator.comparingInt(StudentRecord::getPercentage))
				.collect(Collectors.toList());
		sorted9.forEach(k9 -> System.out.println(k9));
		System.out.println();
		System.out.println("######### SORTING THE VALUES WITH COMPARING  PERCENTAGE ANTOHER METHOD #############");
		List<StudentRecord> sorted10 = record.stream().sorted(Comparator.comparing(StudentRecord::getName))
				.collect(Collectors.toList());
		sorted10.forEach(k10 -> System.out.println(k10));
		System.out.println();
		System.out.println(
				"######### SORTING THE VALUES WITH COMPARING  PERCENTAGE  WITH DISTINCT ANTOHER MEETHOD #############");
		List<StudentRecord> sorted11 = record.stream().sorted(Comparator.comparing(StudentRecord::getName)).distinct()
				.collect(Collectors.toList());
		sorted11.forEach(k11 -> System.out.println(k11));
		System.out.println();
		System.out.println(
				"######### SORTING THE VALUES WITH COMPARING  PERCENTAGE  WITH DISTINCT ANTOHER MEETHOD #############");
		List<StudentRecord> sorted12 = record.stream().sorted(Comparator.comparing(StudentRecord::getName)).unordered()
				.collect(Collectors.toList());
		sorted12.forEach(k12 -> System.out.println(k12));
		System.out.println();

		HashMap<Integer, StudentRecord> map = new HashMap<>();
		StudentRecord a1 = new StudentRecord(101, "siva", "msc", 100);
		StudentRecord a2 = new StudentRecord(202, "raju", "msc", 59);
		StudentRecord a3 = new StudentRecord(303, "alex", "msc", 80);
		StudentRecord a4 = new StudentRecord(404, "ajith", "msc", 60);
		StudentRecord a5 = new StudentRecord(505, "vijay", "msc", 99);
		map.put(1, a1);
		map.put(2, a2);
		map.put(3, a3);
		map.put(4, a4);
		map.put(5, a5);

		map.forEach((k, v) -> System.out.println(k + " " + v));
		System.out.println();

		List<StudentRecord> value = map.values().stream().collect(Collectors.toList());
		List<StudentRecord> newvalue = value.stream().sorted(Comparator.comparingLong(StudentRecord::getPercentage))
				.collect(Collectors.toList());
		newvalue.forEach(sd -> System.out.println(sd));
		System.out.println();
		System.out.println("Sorting names using lamda expressions ");
		System.out.println();
		Collections.sort(record, (p1, p2) -> {
			return p1.getName().compareTo(p2.getName());
		});

		for (StudentRecord sd : record) {
			System.out.println(sd);
		}
		
	
	record.stream().max(Comparator.comparing(StudentRecord::getPercentage)).ifPresent(System.out::println);
	
	System.out.println("using order by");
	
	Map<String, List<StudentRecord>> orderby =record.stream().collect(Collectors.groupingBy(StudentRecord::getDegree));
	 System.out.println(orderby);
	}
	
}