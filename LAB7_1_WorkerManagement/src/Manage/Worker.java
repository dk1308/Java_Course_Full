package Manage;

import java.util.Comparator;

public class Worker implements Comparator<Worker>, Cloneable{
	private String id;
	private String name;
	private int age;
	private double salary;
	
	public Worker(String id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	private String salStatus;
	
	public Worker(String salStatus) {
		this.salStatus = salStatus;
	}

	public Worker() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		if (!this.salStatus.isEmpty()) {
			return id +"\t"+ name +"\t"+ age +"\t"+ salary +"\t"+ salStatus;
		}
		return id +"\t"+ name +"\t"+ age +"\t"+ salary;
	}
	

	@Override
	public int compare(Worker o1, Worker o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getSalStatus() {
		return salStatus;
	}

	public void setSalStatus(String salStatus) {
		this.salStatus = salStatus;
	}
	
	public Worker clone() throws CloneNotSupportedException {
		return (Worker)super.clone();
	}
}
