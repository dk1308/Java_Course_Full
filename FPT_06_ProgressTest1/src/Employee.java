
public abstract class Employee {
	String fullName;
	String address;
	int age;
	
	public Employee(String fullName, String address, int age) {
		this.fullName = fullName;
		this.address = address;
		this.age = age;
	}
	
	public Employee()
	{
		
	}
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract double countSalary();
}
