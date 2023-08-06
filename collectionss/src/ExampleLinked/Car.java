package ExampleLinked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Car {

	public static void main(String[] args) {

		List<Integer> sg = new LinkedList<Integer>();

		sg.add(35);
		sg.add(90);
		sg.add(31);
	sg.remove(2);
	sg.set(1,213);
	System.out.println(sg);
	
//System.out.println("intial values are :" + sg);
		
	//System.out.println("after values are :" + sg);

		//for (int i = 0; i < sg.size(); i++) {
		//	System.out.println("intial values are :" + sg.get(i));
		}

	}
