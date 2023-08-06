package day3class;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArraylist {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> ArrLis1 = new CopyOnWriteArrayList<String>();

		ArrLis1.add("laptop");
		ArrLis1.add("mouse");
		ArrLis1.add("ball");

		System.out.println("CopyOnWriteArrayList: " + ArrLis1);
		for (String val : ArrLis1)

			// if (val.equals("laptop"))
			ArrLis1.remove("laptop");
		ArrLis1.add("mobile");

		System.out.println(ArrLis1);
	}
}