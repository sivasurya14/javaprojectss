package com.collectiontest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseStudent {

	static void add(int no) {
		Scanner scan = new Scanner(System.in);

		ArrayList<Student> details = new ArrayList<>();

		while (true) {
			System.out.println("enter id");
			int id = scan.nextInt();

			System.out.println("enter name");
			String name = scan.next();

			System.out.println("enter depart ");
			String depart = scan.next();

			System.out.println("enter year");
			int year = scan.nextInt();

			System.out.println("enter college name ");
			String college = scan.next();

			details.add(new Student(id, name, depart, year, college, null));

			System.out.println();
			System.out.println("your entered details are ");
			details.forEach(x -> System.out.println(x));
		}

	}

	public static void main(String[] args) {
		System.out.println("enter the number 0 to add student data");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		UseStudent sd = new UseStudent();
		if (no == 0)
			sd.add(no);

	}
}
