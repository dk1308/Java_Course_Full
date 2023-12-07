import java.util.Scanner;

public class OfficialEmployee extends Employee{
	private double basicSalary;
	private double salaryCoefficient;	
	
	public OfficialEmployee(String fullName, String address, int age,double basicSalary,double salaryCoefficient) {
		super(fullName, address, age);
		// TODO Auto-generated constructor stub
		this.basicSalary = basicSalary;
		this.salaryCoefficient = salaryCoefficient;
	}	
	
	public OfficialEmployee()
	{
		
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSalaryCoefficient() {
		return salaryCoefficient;
	}

	public void setSalaryCoefficient(double salaryCoefficient) {
		this.salaryCoefficient = salaryCoefficient;
	}

	

	public double countSalary() {
		double salary = this.basicSalary*this.salaryCoefficient;
		return salary;	
	}

	
	public void inputOfficialEmployee()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter fullName of official employee: ");
		String fullName = sc.nextLine();
		this.setFullName(fullName);
		System.out.println("Enter address of official employee: ");
		String address = sc.nextLine();
		this.setAddress(address);
		System.out.println("Enter age of official employee: ");
		int age = sc.nextInt();
		this.setAge(age);
		System.out.println("Enter basicSalary of official employee: ");
		double basicSalary = sc.nextDouble();
		this.setBasicSalary(basicSalary);
		System.out.println("Enter salaryCoefficient of official employee: ");
		double salaryCoefficient = sc.nextDouble();
		this.setSalaryCoefficient(salaryCoefficient);
	}

	public void outputOfficialEmployee()
	{
		System.out.println(this);
	}
	
	public void checkSameEmployee(Employee o)
	{
		if (this.getAddress().equals(o.getAddress()))
		{
			System.out.println(this.getFullName()+" address is the same "+o.getFullName());
		} else System.out.println(this.getFullName()+" address is not duplicated");
	}
	@Override
	public String toString() {
		return this.getFullName()
		+"\nSalary: "+(int)countSalary();
	}
}
