package day2Program;

public class SortingArrayWithoutUsermethod {
	
public static void main(String[] args) {
	
	int arr[] = {20,10,30,40,12,11,8,9};
	
	System.out.println("Elelments after sorting : ");
	 int temp=0;
	for(int i=0;i<arr.length;i++) {
      for(int j=i+1;j<arr.length;j++) {
    	  if(arr[i]>arr[j]) {  		  
    		  temp=arr[i];
    		  arr[i]=arr[j];
    		  arr[j]=temp;
   	  }	  
      }
      System.out.println(arr[i]);
	}	
}
}
