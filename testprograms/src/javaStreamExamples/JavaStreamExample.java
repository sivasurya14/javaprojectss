package javaStreamExamples;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreamExample {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		List<Float> productPriceList = productsList.stream().filter(a -> a.pricee < 90000).map(a -> a.pricee)
				.collect(Collectors.toList());
		List<String> prod = productsList.stream().filter(b -> b.pricee < 90000).map(Product::getName)
				.collect(Collectors.toList());
		System.out.println(prod);
		for (String ss : prod)
			System.out.println(ss);
		System.out.print(productPriceList);

		for (float sd : productPriceList) {
			System.out.println(sd);

		}
		productsList.forEach(x-> System.out.println(x.getName()+"        "+x.getPricee()));
	}
}