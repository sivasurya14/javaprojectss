package vectorExample;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorInt {
		public static void main(String[] args) {

			List<Integer> sg = new Vector<Integer>();

			sg.add(33);
			sg.add(243);
			sg.add(344);
			System.out.println("intial values are :" + sg);
			sg.remove(1);
			//Collections.replaceAll(sg, "siva", "guru");
			System.out.println("after the remove the values are :" + sg);

			for (int i = 0; i <= sg.size(); i++) {
				System.out.println("intial values are :" + sg.get(i));
			}

	}}


