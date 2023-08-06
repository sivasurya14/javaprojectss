package ExampleLinked;




	import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
	
	public class Book{

		public static void main(String[] args) {

			List<String> sg = new LinkedList<String>();

			sg.add("book name");
			sg.add("ponniyin selvan");
			sg.add("yavana raani");
			//sg.remove(1);
			System.out.println("intial values are :" + sg);
			Collections.replaceAll(sg, "yavana raani", "guru");
			System.out.println("after values are :" + sg);

			for (int i = 0; i < sg.size(); i++) {
				System.out.println("intial values are :" + sg.get(i));
			}

		}

	}



