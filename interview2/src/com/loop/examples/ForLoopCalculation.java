package com.loop.examples;

public class ForLoopCalculation {
	public static void main(String[] args) {    
		// TODO Auto-generated method stub    
		String[] names = {"Java","C","C++","Python","JavaScript"};    
		System.out.println("Printing the content of the array names:\n");    
		int i = 1;
		for(String name:names) {   
		
		System.out.println(i++ +"."+name);
		}    

		
		
	}

}
