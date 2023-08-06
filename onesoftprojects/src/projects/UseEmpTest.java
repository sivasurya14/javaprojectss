package projects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseEmpTest {
	public static void main(String[] args) {

		Employee emp1 = new Employee("Davitha", 23, 80000, "HR", 'F', 101);
		Employee emp2 = new Employee("Dinesh", 23, 15000, "Business", 'M', 102);
		Employee emp3 = new Employee("Vijaya keerthiga", 23, 50000, "VAO", 'F', 103);
		Employee emp4 = new Employee("Suresh", 22, 35000, "Bank manager", 'M', 104);
		Employee emp5 = new Employee("Anususya", 22, 32000, "Bank manager", 'F', 105);
		Employee emp6 = new Employee("Naveen", 22, 42000, "FSO", 'M', 106);
		Employee emp7 = new Employee("Vicky", 23, 55000, "SI", 'M', 107);

		ArrayList<Employee> details = new ArrayList<>();
		details.add(emp1);
		details.add(emp2);
		details.add(emp3);
		details.add(emp4);
		details.add(emp5);
		details.add(emp6);
		details.add(emp7);

		System.out.println("Print Employee name which is starts with  A");

		List<Employee> startswith = details.stream().filter(x -> x.getName().startsWith("V")).toList();
		System.out.println(startswith);

		System.out.println("\n");
		System.out.println("Get Top 3 salary : ");
		List<Employee> top3Salary = details.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed())
				.limit(3).toList();

		System.out.println(top3Salary);

		System.out.println("\n");
		System.out.println("Top 3 Lowest Salary :");

		List<Employee> top3LOwestSalary = details.stream().sorted(Comparator.comparingInt(Employee::getSalary)).limit(3)
				.toList();

		System.out.println(top3LOwestSalary);
		System.out.println("\n");
		System.out.println("Top 3 Lowest Salary in reversed order :");
		List<Employee> top3LowestSalaryrev = top3LOwestSalary.stream()
				.sorted(Comparator.comparingInt(Employee::getSalary).reversed()).toList();
		System.out.println(top3LowestSalaryrev);
		System.out.println("\n");
		System.out.println("Group BY Age :");

		Map<Integer, Map<Character, List<Employee>>> groupbyAgeAngender = details.stream()
				.collect(Collectors.groupingBy(Employee::getAge, Collectors.groupingBy(Employee::getGender)));

		System.out.println(groupbyAgeAngender);

		//Using StringBuilder in Stream 
		
		System.out.println("Average Salary of Employees : ");
		
		double averageprice=details.stream().collect(Collectors.averagingDouble(p->p.getSalary()));
		
		System.out.println(averageprice);
	}

}