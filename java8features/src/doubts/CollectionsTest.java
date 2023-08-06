package doubts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
public class CollectionsTest {
	public static void main(String[] args) {
		ArrayList<Integer> numbers= new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(10);
		numbers.add(3);
		numbers.add(6);
		numbers.add(4);
		numbers.add(4);
		System.out.println(numbers);
		HashSet<Integer> newvalue = new HashSet<>(numbers);
		System.out.println(newvalue);
		Collections.sort(numbers);
		System.out.println(numbers);
		

	}
}
