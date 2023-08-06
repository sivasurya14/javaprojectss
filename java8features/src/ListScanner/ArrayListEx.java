package ListScanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {

		List<StudentDet> list = new ArrayList<>();

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the details");
		
		String sc = scan.next();
		list.add(sc);
		
	}

}
