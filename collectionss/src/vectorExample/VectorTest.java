package vectorExample;

import java.util.Collections;

import java.util.List;
import java.util.Vector;

public class VectorTest {
	
	public static void main(String[] args) {

		List<String> sg = new Vector<String>();

		sg.add("bike name");
		sg.add("pulsar");
		sg.add("splendor");
		System.out.println("intial values are :" + sg);
		sg.remove(1);
		Collections.replaceAll(sg, "siva", "guru");
		System.out.println("after the remove the values are :" + sg);

		for (int i = 0; i < sg.size(); i++) {
			System.out.println("intial values are :" + sg.get(i));
		}

}}
