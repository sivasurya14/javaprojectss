import java.util.ArrayList;
import java.util.Collections;

public class Student1  {
public static void main(String[] args) {
	
	ArrayList<Student>students=new ArrayList<>();
	students.add(new Student(3,"cat","be"));
	students.add(new Student(4,"arun","ece"));
	students.add(new Student(1,"baskar","arts"));
	students.add(new Student(2,"dog","msc"));
	System.out.println("comparable");
	//Collections.sort(al);
	students.forEach(x->System.out.println(x));

 System.out.println("###### COMPARE BY Depart###### "); 
	Collections.sort(students,new CompareByDepart());
	students.forEach(x->System.out.println(x));
   System.out.println("*****copmpare by name****** ");
   System.out.println();
	Collections.sort(students,new CompareByName());
	students.forEach(x->System.out.println(x));
	

	 System.out.println("###### COMPARE BY Id###### "); 
		Collections.sort(students,new CompareById());
		students.forEach(x->System.out.println(x));

}
	
}
