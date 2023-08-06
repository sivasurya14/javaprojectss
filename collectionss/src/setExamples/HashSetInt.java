package setExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetInt {

	public static void main(String[] args) {

		Set<Integer> sg = new HashSet<Integer>();

		sg.add(23);
		sg.add(34);
		sg.add(12);
		sg.add(11);
		sg.add(23);
		sg.add(0);
		//sg.remove(1);
		System.out.println("intial values are :" + sg);
		

		System.out.print("after the iteration :");
		sg.forEach(a->System.out.println(a));
		{
		
		}

}

}
