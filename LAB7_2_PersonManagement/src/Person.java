
public class Person {
	
	private String name;
	private String address;
	private double salary;

	public Person(String name, String address, double salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public Person() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Tên: " + name + 
				"\nĐịa chỉ: " + address + 
				"\nLương: " + salary;
	}

	public Person inputPersonInfo() {
		Inputter ip = new Inputter();
		String name = ip.inputNotBlank("Nhập tên");
		String address = ip.inputNotBlank("Nhập địa chỉ");
		double salary = ip.inputNumber("Nhập lương", 1, Double.MAX_VALUE);
		Person newPerson = new Person(name, address, salary);
		return newPerson;
	}

	public void displayPersonInfo(Person person) {
		System.out.println(person);
	}
	
	public Person[] sortBySalary(Person[] list) {
		for (int i = 0; i < list.length; i++) {
			for (int j = 1; j < list.length - i; j++) {
				if (list[j-1].getSalary() > list[j].getSalary()) {
					Person temp = list[j];
					list[j] = list[j-1];
					list[j-1] = temp;
				}
			}
		}
		return list;
	}

	
}
