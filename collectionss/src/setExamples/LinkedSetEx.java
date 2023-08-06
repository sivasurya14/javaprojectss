package setExamples;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetEx {
	
		


		public static void main(String[] args) {

			Set<String> sg = new LinkedHashSet<String>();

			sg.add("bala");
			sg.add("arunkumar");
			sg.add("sooriya");
			sg.add("thamizh");
			sg.add("bala");
			sg.add("");
			//sg.remove(1);
			System.out.println("intial values are :" + sg);
			

			
			sg.forEach(a->System.out.println(a));
			{
			
			}

	}}




