package day3class;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashEx {
	public static void main(String[] args) throws ConcurrentModificationException {

		Map<Integer, String> map = new ConcurrentHashMap<>();

		map.put(1, "laptop");
		map.put(2, "mobile");
		map.put(3, "mouse");

		for (Entry<Integer, String> x : map.entrySet()) {

			if (x.getKey().equals(1)) {

				map.remove(1);
			}

			System.out.println(x.getValue());

			map.put(5, "ball");

		}
	}
}
