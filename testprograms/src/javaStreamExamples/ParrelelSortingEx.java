package javaStreamExamples;

import java.util.Arrays;

public class ParrelelSortingEx {
	public static void main(String[] args) {
	    	
	 	int a[] = {1,4,6,8,2,9,10};	
	 	Arrays.parallelSort(a);
	      int b[]	=a; 
    	System.out.print("[");
    	 for(int j=0; j<b.length-1;j++) {
 	    	System.out.print(b[j]+" ");
    	int i=0;
    	if(i==0) {
    		i=i+1;
    	}else {
    		
	    	System.out.println(",");
	    }
    	}
	   System.out.println("]");
	}
}
