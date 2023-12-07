package main;

public class Employee {
	private String name;
	private int age;
	private long salary;
	public Employee(String name, int age, long salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}
