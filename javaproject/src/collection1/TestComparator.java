package collection1;
import java.util.*;
//import java.io.*;  
public class TestComparator { 
	public static void main(String args[]){  
	  
	ArrayList<StudentTest> sg=new ArrayList<StudentTest>();  
	sg.add(new StudentTest(101,"vijay",23));  
	sg.add(new StudentTest(106,"Ajay",27));  
	sg.add(new StudentTest(105,"Jai",21));  
	  
	System.out.println("Sorting by Name");    
	Collections.sort(sg,new NameComparator());  
	for(StudentTest sd: sg){  
	System.out.println(sd.rollno+" "+sd.name+" "+sd.age);  
	}  
	  
	System.out.println("sorting by Age");    
	Collections.sort(sg,new AgeComparator());   
	for(StudentTest sd: sg){  
	System.out.println(sd.rollno+" "+sd.name+" "+sd.age);  
	}  
	  
	}  
	}  


