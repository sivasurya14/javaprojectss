package collectionsExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pen {

	public static void main(String[] args) {

		List<Integer> sg = new ArrayList<Integer>();

		sg.add(12);
		sg.add(23);
		sg.add(35);
		sg.remove(2);
		System.out.println(sg);
//			sg.set(2,213);
//			System.out.println("intial values are :" + sg);
		// Collections.replaceAll(sg, "siva", "guru");
//			System.out.println("after values are :" + sg);

		// for (int i = 0; i < sg.size(); i++) {
		/// System.out.println("intial values are :" + sg.get(i));
	}

}
