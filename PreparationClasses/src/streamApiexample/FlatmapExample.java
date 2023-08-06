package streamApiexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FlatmapExample {

	public static void main(String[] args) {

		List<Integer> alllist = new ArrayList<>();

		List<Integer> list1 = Arrays.asList(1,3,3, 5, 3, 5);
		List<Integer> list2 = Arrays.asList(10, 32, 15, 13, 15);
		List<Integer> list3 = Arrays.asList(100, 300, 500, 20, 50);

		List<List<Integer>> list = Arrays.asList(list1, list2, list3);

		List<Integer> distinctvalue = list.stream().flatMap(x -> x.stream()).distinct()
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		distinctvalue.forEach(x -> System.out.println(x));
		
		Object[] a=list1.toArray();
		
//		int [] b = a;
//		for (Object b : a) {
//			System.out.println("array :" + b );
//		}
//		
		
	}

}
