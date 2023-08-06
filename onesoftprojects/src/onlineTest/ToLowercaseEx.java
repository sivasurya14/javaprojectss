package onlineTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ToLowercaseEx {

	public List<String> getListOfNames(String names) {
		ArrayList<String> list = new ArrayList<>();

		list.add(names);
	//	List<String> tolowercase = names.toLowerCase();
		return list;
	}

	public static void main(String[] args) {
		ToLowercaseEx lowercase = new ToLowercaseEx();

		
		System.out.println("Enter the name : ");

		Scanner scan = new Scanner(System.in);

		String name = scan.next();

		System.out.println(lowercase.getListOfNames(name));
		

	}

}
