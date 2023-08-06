package javaproject;

public class LogicalOr {
	  
		public static void main(String args[]){  
		int a=12;  
		int b=5;  
		int c=23;  
		System.out.println(a>b||a<c);  
		System.out.println(a>b|a<c);
		
		System.out.println(a>b||a++<c);  
		System.out.println(a);  
		System.out.println(a>b|a++<c);
		System.out.println(a);
		}}  

