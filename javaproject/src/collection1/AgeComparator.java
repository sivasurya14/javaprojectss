package collection1;


	import java.util.*;  
	 class AgeComparator implements Comparator<StudentTest>{  
	public int compare(StudentTest s1,StudentTest s2){  
	if(s1.age==s2.age)  
	return 0;  
	else if(s1.age>s2.age)  
	return 1;  
	else  
	return -1;  
	}  
	}  

