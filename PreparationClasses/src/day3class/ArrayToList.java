package day3class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {

		String name[] = { "siva", "guru", "mani" };

		int a[] = { 1, 2, 3, 4, 5 };
		List<Integer> list2 = new ArrayList<>();

		for (Integer al : a) {

			list2.add(al);

		}
		
		//int [] no =a.t

		System.out.println(list2);

		List<String> list = Arrays.asList(name);

		System.out.println("Converting array into list : " + list);

		Object[] name1 = list.toArray();
		
		String [] name2= list.toArray(new String[name1.length]);

		System.out.println("Converting List into array : " + Arrays.toString(name1));
        System.out.println();
	}

}
