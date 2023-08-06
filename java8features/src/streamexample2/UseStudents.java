package streamexample2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseStudents {
	public static void main(String[] args) {

		ArrayList<Students> record = new ArrayList<>();

		record.add(new Students(1, "siva", "male", "bsc", 60, "thiruvannamalai"));
		record.add(new Students(2, "guru", "male", "ba", 80, "thiruvannamalai"));
		record.add(new Students(3, "suresh", "male", "msc", 97, "villupuram"));
		record.add(new Students(4, "anu", "female", "be", 30, "chennai"));
		record.add(new Students(5, "viji", "female", "bsc", 40, "tiruchi"));
		record.add(new Students(6, "arun", "male", "ma", 80, "thindivanam"));
		record.add(new Students(7, "nithya", "female", "bsc", 80, "kadalore"));
		record.add(new Students(8, "naveen", "male", "ba", 20, "vellore"));

		System.out.println("group by depart");

		Map<String, List<Students>> newRecord = record.stream().collect(Collectors.groupingBy(Students::getGender));
		System.out.println(newRecord);

	}

}
