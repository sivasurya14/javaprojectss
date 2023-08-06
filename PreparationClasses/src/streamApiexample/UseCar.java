package streamApiexample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UseCar {

	public static void main(String[] args) {

		List<CarDetails> car = new ArrayList<>();

		CarDetails a1 = new CarDetails(1, "honda", 25000);
		CarDetails a2 = new CarDetails(2, "hundai", 20000);
		CarDetails a3 = new CarDetails(3, "MBW", 30000);
		CarDetails a4 = new CarDetails(4, "Maruthi", 54000);
		CarDetails a5 = new CarDetails(5, "minicoper", 100000);
		CarDetails a6 = new CarDetails(6, "benz", 13000);
		CarDetails a7 = new CarDetails(7, "inova", 150000);
		CarDetails a8 = new CarDetails(8, "white", 60000);
		CarDetails a9 = new CarDetails(9, "car", 80000);
		
		car.add(a8);
		car.add(a9);
		car.add(a7);	
	    car.add(a6);
		car.add(a5);
		car.add(a4);
		car.add(a3);
		car.add(a2);
		car.add(a1);

		CarDetails carr = car.stream().max(Comparator.comparing(CarDetails::getPrice)).get();

		CarDetails secondMax = car.stream().sorted(Comparator.comparingInt(CarDetails::getPrice).reversed()).skip(1)
				.findFirst().get();

		System.out.println(secondMax);
		System.out.println("\n");
		System.out.println("top 3 salary :");
		List<CarDetails> Top3salary = car.stream().distinct().sorted(Comparator.comparingInt(CarDetails::getPrice).reversed())
				.limit(2).toList();

		for (CarDetails s : Top3salary) {

			System.out.println(s);
		}
		
		System.out.println("\n");
		System.out.println("top 4 to 5 salary :");
		List<CarDetails> Top4to5salary = car.stream().distinct().sorted(Comparator.comparingInt(CarDetails::getPrice).reversed())
				.skip(3).limit(2).toList();

		for (CarDetails s : Top4to5salary) {

			System.out.println(s);
		}

		CarDetails secondMin = car.stream().sorted(Comparator.comparingInt(CarDetails::getPrice)).skip(1).findFirst()
				.get();

		System.out.println(secondMax);
		// Cardetails carsecond = car.stream().

		// System.out.println(carr);

		Set<CarDetails> set = car.stream().collect(Collectors.toSet());

		System.out.println("\n");

		for (CarDetails s : set) {
			System.out.println(s);
		}

		Map<Integer, CarDetails> map = car.stream().collect(Collectors.toMap(x -> x.getId(), y -> y));

		List<CarDetails> list = map.values().stream().collect(Collectors.toList());

		System.out.println("\n");
		System.out.println("Convert map into list: ");

		for (CarDetails s : list) {
			System.out.println(s);
		}

		System.out.println("\n");
		System.out.println("Converting Map into List : ");

		map.forEach((k, v) -> System.out.println(k + " " + v));

	}

}
