package day3class;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentEx {
	public static void main(String[] args) {

		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();

		list.add("siva");
		list.add("dinesh");
		list.add("guru");

		// System.out.println(list);

		for (String x : list) {

			System.out.println(x);
			list.remove(0);
		}
		System.out.println(list);
	}

}
