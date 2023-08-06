package projects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseEmp {

	public static void main(String[] args) {

		Employee e1 = new Employee("gobi", 24, 190000, "developer", 'm', 1144);
		Employee e2 = new Employee("ajith", 23, 40000, "developer", 'm', 1574);
		Employee e3 = new Employee("pradeep", 22, 30000, "testing", 'm', 1454);
		Employee e4 = new Employee("rajesh", 25, 100000, "racer", 'm', 1234);
		Employee e5 = new Employee("moni", 27, 20000, "actor", 'f', 1166);
		Employee e6 = new Employee("moni", 26, 500000, "designer", 'f', 1155);
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		// filter Methods
		System.out.println("\n");
		System.out.println("Print employee details which is start with G");
		List<Employee> l1 = employees.stream().filter(x -> x.getName().startsWith("g")||x.getName().startsWith("p")).collect(Collectors.toList());
		l1.forEach(y -> System.out.println(y));

		// map
		System.out.println("\n");
		System.out.println("USing map to get ROLES ");
		List<String> map1 = employees.stream().map(x -> x.getRole()).collect(Collectors.toList());
		map1.forEach(a -> System.out.println(a));

		// List<String> map2 = employees.stream().map(x ->
		// x.getName().startsWith("g")).collect(Collectors.toList());
		// distinct//
		System.out.println("\n");
		System.out.println("Using map to get Role with duplicate :");
		List<String> l2 = employees.stream().map(x -> x.getRole()).distinct().toList();
		l2.forEach(y -> System.out.println(y));

		// sorted Descending order
		System.out.println("\n");
		System.out.println("Descending order for salary :");
		List<Integer> l3 = employees.stream().map(x -> x.getSalary()).sorted(Comparator.reverseOrder()).limit(5)
				.toList();
		l3.forEach(y -> System.out.println(y));

		// sorted Ascending order
		System.out.println("\n");
		System.out.println("Sorted Salary with Accending order");
		List<Integer> l7 = employees.stream().map(x -> x.getSalary()).sorted().toList();
		List<String> name = employees.stream().map(x -> x.getName()).sorted().toList();

		l7.forEach(y -> System.out.println(y));

		// limit//
		System.out.println("\n");
		System.out.println("");
		List<String> l4 = employees.stream().map(x -> x.getName()).limit(3).toList();
		l4.forEach(y -> System.out.println(y));

		// anyMatch//
		System.out.println("\n");
		System.out.println("Using ANymatch method to filter letter stats with : ");
		boolean l5 = employees.stream().map(x -> x.getName()).anyMatch((s) -> s.startsWith("m"));
		System.out.println(l5);
		

		// count//
		System.out.println("\n");
		System.out.println("Count the name which is ends with A");
		List<String> l6 = employees.stream().map(x -> x.getName()).filter(y -> !y.endsWith("a"))
				.collect(Collectors.toList());
		l6.forEach(a -> System.out.println(a));
		long end2 = l6.stream().count();
		System.out.println(end2);

		// maximum
		System.out.println("\n");
		System.out.println("Get maximum salary of the Employee : ");
		Employee max = employees.stream().max(Comparator.comparingInt(Employee::getSalary)).get();
		System.out.println(max);

		// minmum
		System.out.println("\n");
		System.out.println("Get minimum salary of the employee : ");

		Employee min = employees.stream().min(Comparator.comparingInt(Employee::getSalary)).get();
		System.out.println(min);

		// Second max
		System.out.println("\n");
		System.out.println("Get second maximum salary of the employee : ");
		Employee secmax = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1)
				.findFirst().get();
		System.out.println(secmax.getSalary());
		System.out.println("\n");
		System.out.println("Get second maximum salary of the employee with details : ");
		Employee sec_Max_Sal_Details = employees.stream()
				.sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst().get();
		System.out.println(sec_Max_Sal_Details);

		// Second min
		System.out.println("\n");
		System.out.println("second minimum salary of employee : ");
		Employee secmin = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary)).skip(1).findFirst()
				.get();
		System.out.println("second minimum: " + secmin.getSalary());

		// findfirst
		System.out.println("\n");
		System.out.println("Using find first : ");
		Optional<Employee> findfirst = employees.stream().findFirst();
		System.out.println(findfirst.get());

		// findany
		System.out.println("\n");
		System.out.println("Using find any method");
		Optional<Employee> findany = employees.stream().findAny();
		System.out.println(findany.get());

		// flatmap
		System.out.println("\n");
		System.out.println("Using flat map methods :");
		// List<Employee>flatmap=employees.stream().flatMap(num ->
		// Stream.of(num)).collect(Collectors.toList());
		// flatmap.forEach(System.out::println);
		// Anymatch
		System.out.println("\n");
		System.out.println("");
		System.out.println("Using Starts With method ");
		List<String> startswithName = employees.stream().map(x -> x.getName()).filter(y -> !y.endsWith("a"))
				.collect(Collectors.toList());
		System.out.println(startswithName);

		// endswith count
		System.out.println("\n");
		System.out.println("");
		System.out.println("ends with count ");
		long endswithCount = employees.stream().filter(a -> a.getName().endsWith("p")).count();
		System.out.println(endswithCount);
		// nameswithoutDuplicate values
		System.out.println("\n"); 
		System.out.println("");
		System.out.println("Names without Duplicate value");
		List<String> nameswithoutDup = employees.stream().map(x -> x.getName()).distinct().toList();
		System.out.println(nameswithoutDup);

		// sec minimum value
		System.out.println("\n");
		System.out.println("");
		List<Integer> top3salary = employees.stream().map(x -> x.getSalary()).sorted().toList();
		top3salary.forEach(x -> System.out.println(x));

		System.out.println("\n");
		System.out.println("top 3 lowest salary");
		List<Employee> top3LowestSalary = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary))
				.limit(3).collect(Collectors.toList());
		top3LowestSalary.forEach(x -> System.out.println(x));
		
		
		System.out.println("\n");
		System.out.println("4th Maximum salary of the employee with details: ");
		Employee  top4th_salary =employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(3).findFirst().get();
        System.out.println(top4th_salary);
        
        
        
	}

}
