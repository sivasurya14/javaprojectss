package collection1;


	import java.util.*;  
	class NameComparator implements Comparator<StudentTest>{  
	public int compare(StudentTest s1,StudentTest s2){  
	return s1.name.compareTo(s2.name);  
	}  
	}  

