package day3class;

import java.util.Hashtable;

public class UseStudents {

	public static void main(String[] args) {

		Hashtable<Integer, Student> list = new Hashtable<>(10);

		Student s1 = new Student(101, "siva", 101, 21);
		Student s2 = new Student(102, "siva", 1001, 23);

		list.put(s1.getRollno(), s1);
		list.put(s2.getRollno(), s2);

		System.out.println(s1.hashCode() + " " + s1.hashCode() % 10);
		System.out.println(s2.hashCode() + " " + s2.hashCode() % 10);
		System.out.println(s1.equals(s2));

		list.forEach((k, v) ->

		System.out.println(k + " " + v + " " + k.hashCode() % 5)

		);

	}

}
