import java.util.Scanner;

public class SaleStaff extends Employee{
	private double allowance;
	private int sales;
	private double commision;
	public SaleStaff(String fullName, String address, int age,double allowance,int sales,double commision) {
		super(fullName, address, age);
		// TODO Auto-generated constructor stub
		this.allowance = allowance;
		this.sales = sales;
		this.commision = commision;
	}
	
	public SaleStaff()
	{
		
	}
	
	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}

	@Override
	public double countSalary() {
		double salary = this.allowance+this.sales*this.commision;
		return salary;
	}


	
	public void inputSaleStaff()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter fullName of sale staff: ");
		String fullName = sc.nextLine();
		this.setFullName(fullName);
		System.out.println("Enter address of sale staff: ");
		String address = sc.nextLine();
		this.setAddress(address);
		System.out.println("Enter age of sale staff: ");
		int age = sc.nextInt();
		this.setAge(age);
		System.out.println("Enter allowance of sale staff: ");
		double allowance = sc.nextDouble();
		this.setAllowance(allowance);
		System.out.println("Enter sales of sale staff: ");
		int sales = sc.nextInt();
		this.setSales(sales);
		System.out.println("Enter commision of sale staff: ");
		double commision = sc.nextDouble();
		this.setCommision(commision);
	}
	
	public void outputSaleStaff()
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
