package hasingTechnique;

import java.util.HashMap;

import projects.Employee;

public class HashingTest {
	public static void main(String[] args) {
		
		Employe emp1 = new Employe("Davitha", 23, 0, "HR", 'F', 101);
		Employe emp2 = new Employe("Davitha", 23, 0, "HR", 'M', 101);
		Employe emp3 = new Employe("Vijaya keerthiga", 22, 0, "VAO", 'F', 103);
		Employe emp4 = new Employe("Suresh", 22, 0, "Bank manager", 'M', 104);
		Employe emp5 = new Employe("Anususya", 10, 0, "Bank manager", 'F', 105);
		Employe emp6 = new Employe("Naveen", 30, 0, "FSO", 'M', 106);
		Employe emp7 = new Employe("Vicky", 40, 0, "SI", 'M', 107);
		HashMap<Integer, Employe> values = new HashMap<>();
		values.put(emp1.getId(), emp1);
		values.put(emp2.getId(), emp2);
		values.put(emp3.getId(), emp3);
		values.put(emp4.getId(), emp4);
		values.put(emp5.getId(), emp5);
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.getId());
		
		int index = hashcode(emp1.getId())&15;
		int index1 = hashcode(emp2.getId())&15;
		
System.out.println(index);
System.out.println(index1);
		
	}

	private static int hashcode(int id) {
		// TODO Auto-generated method stub
		return id;
	}

}
