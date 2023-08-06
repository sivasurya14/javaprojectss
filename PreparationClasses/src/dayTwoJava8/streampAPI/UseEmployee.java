package dayTwoJava8.streampAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
  public class UseEmployee {
	public static void main(String[] args) {

		List<Employee> employelist = new ArrayList<>();

		Employee e1 = new Employee(1, "siva", 21, "female", "HR", 22000);
		Employee e2 = new Employee(2, "dinesh", 21, "male", "qa", 12000);
		Employee e3 = new Employee(3, "siva", 21, "male", "Developer", 28000);
		Employee e4 = new Employee(4, "Guru", 25, "male", "manager", 22000);
		Employee e5 = new Employee(5, "Anu", 18, "female", "fresher", 18000);
		Employee e6 = new Employee(6, "arun", 26, "male", "BA", 41000);
		Employee e7 = new Employee(7, "Vicky", 28, "male", "qa", 41000);
		Employee e8 = new Employee(8, "Viji", 27, "female", "HR", 41000);

		employelist.add(e1);
		employelist.add(e2);
		employelist.add(e3);
		employelist.add(e4);
		employelist.add(e5);
		employelist.add(e6);
		employelist.add(e7);
		employelist.add(e8);

		// for()

		System.out.println("Find the Second Highet salary of the Employee : ");
		Employee emp = employelist.stream().distinct().sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				.skip(1).findFirst().orElse(null);
		Employee secondHighestSalaryEmployee = employelist.stream().distinct()
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().orElse(null);

		System.out.println(secondHighestSalaryEmployee);
		System.out.println("\n");
		System.out.println("Find the Second Highest Salary of the Employee with distinct keyword :");

		long secondMaxSalary = employelist.stream().map(x -> x.getSalary()).distinct().sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();
		System.out.println(secondMaxSalary);
     
		System.out.println("Get second maximum  salary");
		long salary = employelist.stream().map(x -> x.getSalary()).distinct().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().get();
		System.out.println(salary);

		System.out.println("\n");
		System.out.println("Using Filter method : Get list of Employees who age is less than 20 :");

		List<Employee> ageLessThanTwenty = employelist.stream().filter(x -> x.getAge() < 22).toList();
		System.out.println(ageLessThanTwenty);
		System.out.println("\n");
		System.out.println("Using Map method to get Name of Employee :");

		List<String> nameOfEmployee = employelist.stream().map(x -> x.getName()).toList();
		System.out.println(nameOfEmployee);

		System.out.println("\n");
		System.out.println("Using count method to Count number of female Employees :");

		long countOfFemale = employelist.stream().filter(x -> x.getGender().equalsIgnoreCase("female")).count();
		System.out.println("Total number of female employee is " + countOfFemale);

		System.out.println("\n");
		System.out.println("Remove Duplicate name from Employee List USing Distinct Method :");

		List<String> distinctvalues = employelist.stream().map(x -> x.getName()).distinct().toList();

		System.out.println(distinctvalues);
		System.out.println("\n");
		System.out.println("Sorting list of Employees in Acending order :");

		List<Employee> accendingOrder = employelist.stream()
				.sorted(Comparator.comparingInt(Employee::getSalary).reversed()).distinct().toList();

		System.out.println(accendingOrder);

		System.out.println("\n");
		System.out.println("List Employees in Decending Order");
		List<Employee> decendingOrder = employelist.stream().sorted(Comparator.comparingInt(Employee::getId).reversed())
				.toList();
		System.out.println(decendingOrder);

		System.out.println("\n");
		System.out.println("Max Salary of Employee");

		Employee maxSalary = employelist.stream().max(Comparator.comparingInt(Employee::getSalary)).get();
		System.out.println(maxSalary);

		System.out.println("\n");
		System.out.println("min salary of Employee :");
		Employee minSalary = employelist.stream().min(Comparator.comparingInt(Employee::getSalary)).get();
		System.out.println(minSalary);

		System.out.println("\n");
		System.out.println("Total salary of the Employees :");
		long totalSalary = employelist.stream().collect(Collectors.summingLong(Employee::getSalary));
		System.out.println(totalSalary);

		System.out.println("\n");
		System.out.println("Using AnY Match to determine if any female Employee is there in Employe list ");

		boolean female = employelist.stream().anyMatch(x -> x.getGender().equals("female"));

		System.out.println(female);

		System.out.println("\n");
		System.out.println("sorting name by accending order : ");

		List<String> namesInAccendingorder = employelist.stream().map(x -> x.getName())
				.sorted(Comparator.naturalOrder()).limit(5).toList();
		System.out.println(namesInAccendingorder);

		System.out.println("\n");
		System.out.println("Get Second highest Salary of an Employee ");
		Employee emp2 = employelist.stream().distinct().sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				.distinct().toList().get(2);

		System.out.println(emp2);
//			 
//		      Employee emp3 =employelist.stream().distinct().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1)
//		    		  .map(x->employelist.stream().filter(z->z.getSalary()==x)).findFirst().orElse(null).findFirst().get();

		System.out.println("\n");
		System.out.println("Converting List into Map :");

		Map<Integer, Employee> listIntoMap = employelist.stream().collect(Collectors.toMap(x -> x.getId(), y -> y));

		listIntoMap.forEach((k, v) -> System.out.println(k + " " + v));
		System.out.println("\n");
		System.out.println("Coverting list into Set : ");
		Set<Employee> listToSet = employelist.stream().collect(Collectors.toSet());

		System.out.println(listToSet);

		System.out.println("\n");
		System.out.println("converting Map into List");

		List<Employee> newList = listIntoMap.values().stream().collect(Collectors.toList());

		newList.forEach(x -> System.out.println(x));

		System.out.println("\n");

		System.out.println("Using GroupingByID:");

		Map<Integer, List<Employee>> group = employelist.stream().collect(Collectors.groupingBy(Employee::getAge));

		group.forEach((k, v) -> System.out.println("Age: " + k + " " + v));

		// for (Map.entry(null, null))

		String name = "This is example    method ";

		System.out.println(name.replaceAll("\\s", ""));

		// New Method to find Second maximum of the Employee

		System.out.println();
		System.out.println("Find The Second Maximum Salary of the EMployees : ");
		Employee seconMaxSalary = employelist.stream().map(Employee::getSalary).distinct()
				.sorted(Comparator.reverseOrder()).skip(1)
				.map(x -> employelist.stream().filter(z -> z.getSalary() == x)).findFirst().orElse(null).findFirst()
				.get();

		System.out.println(seconMaxSalary);
		System.out.println();
		System.out.println("Sort By salary Less than 250000 : ");
		List<Employee> sortBySalary = employelist.stream().filter(x -> x.getSalary() <= 30000)
				.sorted(Comparator.comparing(Employee::getSalary)).toList();

		sortBySalary.forEach(System.out::println);

		System.out.println();
		System.out.println("Get Female Employee ");
		List<Employee> getFemaleEmployees = employelist.stream().filter(x -> x.getGender().equalsIgnoreCase("female"))
				.collect(Collectors.toList());
		getFemaleEmployees.forEach(System.out::println);
		
		
		System.out.println();
		System.out.println("Using groupBY Get Male and Female Count :");
		Map<String, Long>   genderCount=employelist.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		genderCount.forEach((gender,count)->System.out.println(gender +" : "+ count));
	}
}
