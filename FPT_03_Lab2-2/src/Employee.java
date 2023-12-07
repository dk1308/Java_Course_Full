import java.util.Scanner;


public class Employee {
	private String name;
	private int age;
	private String address;
	private double salary;
	private double salaryCoeffi;
	
	
	public Employee(String name, int age, String address, double salary, double salaryCoeffi) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
		this.salaryCoeffi = salaryCoeffi;
	}
	
	public Employee()
	{
		
	}
	
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public double getSalary() {
		return salary;
	}

	public double getSalaryCoeffi() {
		return salaryCoeffi;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setSalaryCoeffi(double salaryCoeffi) {
		this.salaryCoeffi = salaryCoeffi;
	}

	
	
	//	1/ Nhap nhan vien
	public void inputEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Ten: ");
		this.name =sc.nextLine();
		System.out.print("Dia chi: ");
		this.address =sc.nextLine();
		System.out.print("Tuoi: ");
		this.age =sc.nextInt();
		System.out.print("Luong: ");
		this.salary =sc.nextDouble();
		System.out.print("He so luong: ");
		this.salaryCoeffi =sc.nextDouble();
	}
	
	
	
	
	
//	2/ Hien thi nhan vien
	public void disEmployee()
	{
		System.out.println("Ten: "+this.name);
		System.out.println("Tuoi: "+this.age);
		System.out.println("Dia chi: "+this.address);
		System.out.println("Luong: "+(int)this.salary);
		System.out.println("He so luong: "+(int)this.salaryCoeffi);
	}
	
	
	
//	3/ Tinh luong
	public double calSalary()
	{
		return this.salary*this.salaryCoeffi;
	}
	

	
}
