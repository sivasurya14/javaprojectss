package projects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapEx {
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(23,13,344);
		List<Integer> l2 = Arrays.asList(21,21,10);
		List<List <Integer>> flatlist = Arrays.asList(l1,l2);		
		List<Integer> result =flatlist.stream().flatMap(x->x.stream()).collect(Collectors.toList());		
		result.forEach(x-> System.out.println(x));
	}

}
