package listToMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class ListToMapEx2 {
	
	public static void main(String[] args) {
		
		List<Integer,String> ss=new ArrayList<Integer,String>();
		
		
		ss a1=new ss(101,"suresh");
		//Student a2=new Student(102,"anu","physics");
		//Student a3=new Student(103,"dhinesh","computer");
		 //Student a4=new Student(104,"viji","biology");
		//Student a5=new Student(105,"naveen","statics");
		
		
		Map<Integer,String>li=ss.stream().collect(Collectors.toMap(Student:: getId,Function.identity()));
	    li.forEach((k,v)->System.out.println(k+" "+v));
			
		}}
		
		
		
	
	


