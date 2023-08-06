package javaproject;

public class LabledForExample {
	  
		public static void main(String[] args) {  
		    //Using Label for outer and for loop  
		    ab:  
		        for(int i=1;i<=3;i++){  
		            bc:  
		                for(int j=1;j<=3;j++){  
		                    if(i==3&&j==4){  
		                        break bc;  
		                    }  
		                    System.out.println(i+" "+j);  
		                } 
		            
		        }  
		    System.out.println("Shiva");
		}  
		}  


