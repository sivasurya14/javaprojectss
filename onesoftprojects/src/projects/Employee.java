package projects;

public class Employee {
	private String name;
	 private int age;
	 private int salary;
	 private String role;
	 private char gender;
	 private int id;
	 public String getName() {
	  return name;
	 }
	 public void setName(String name) {
	  this.name = name;
	 }
	 public int getAge() {
	  return age;
	 }
	 public void setAge(int age) {
	  this.age = age;
	 }
	 public int getSalary() {
	  return salary;
	 }
	 public void setSalary(int salary) {
	  this.salary = salary;
	 }
	 public String getRole() {
	  return role;
	 }
	 public void setRole(String role) {
	  this.role = role;
	 }
	 public char getGender() {
	  return gender;
	 }
	 public void setGender(char gender) {
	  this.gender = gender;
	 }
	 public int getId() {
	  return id;
	 }
	 public void setId(int id) {
	  this.id = id;
	 }
	 public Employee(String name, int age, int salary, String role, char gender, int id) {
	  super();
	  this.name = name;
	  this.age = age;
	  this.salary = salary;
	  this.role = role;
	  this.gender = gender;
	  this.id = id;
	 }
	 
	 @Override
	 public String toString () {
		 return"Employee Details :" + "Employee name: " + name +" Age: "+age+ " salary: " +salary +" Role: "+ role + " Gender: " + gender +" Id: "+id ;
		 
	 }
}
