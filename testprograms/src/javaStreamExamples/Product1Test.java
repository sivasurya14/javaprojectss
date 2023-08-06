package javaStreamExamples;

import java.util.*;

public class Product1Test {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	System.out.println("enter here ");
		int n=scan.nextInt();
		
		if(n>0) {
		
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		// This is more compact approach for filtering data

		productsList.stream().filter(product -> product.pricee == 30000 || product.pricee == 25000)
				.forEach(product -> System.out.println(product.name));
	}}

}
