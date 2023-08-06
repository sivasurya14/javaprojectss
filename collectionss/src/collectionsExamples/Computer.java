package collectionsExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Computer {

	public static void main(String[] args) {

		List<String> sg = new LinkedList<String>();

		sg.add("siva");
		sg.add("sridhar");
		sg.add("surya");
		sg.add(" ");
		sg.add(" ");
		sg.add("surya");
		sg.set(1,"anu")
		;
		//sg.remove(1);
		System.out.println("intial values are :" + sg);
		//Collections.replaceAll(sg, "siva", "guru");
		//System.out.println("after values are :" + sg);

		for (int i = 0; i < sg.size(); i++) {
			System.out.println( sg.get(i));
		}

	}

}
