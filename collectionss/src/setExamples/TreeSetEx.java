package setExamples;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	

	public static void main(String[] args) {

		Set<String> sg = new TreeSet<String>();

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







