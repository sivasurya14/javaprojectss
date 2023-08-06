package streamexample2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseStudents2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		UseStudents2 val = new UseStudents2();

		Scanner scan = new Scanner(System.in);

		System.out.println("enter name1");

		String name = scan.next();
		list.add(name);
		System.out.println("entred college");
		String college = scan.next();
		list.add(college);
		System.out.println("enter department");
		String depart = scan.next();
		list.add(depart);
        
		
		list.forEach(x-> System.out.println(x));
	}

}
