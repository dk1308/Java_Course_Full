import java.util.Scanner;

public class RunFile {
	public static void main(String[] args) {
		Employee[] emp = new Employee[10];
		emp[0] = new Employee("Khoa", 19, "QN", 500, 5);
		emp[1] = new Employee("Hoang", 19, "TTH", 500, 5);
		emp[2] = new Employee("Nhien", 19, "DN", 500, 5);
		emp[3] = new Employee("Anh", 19, "KT", 500, 5);
		emp[4] = new Employee("Hoang", 20, "DN", 500, 5);
		emp[5] = new Employee("Tai", 19, "QN", 500, 5);
		emp[6] = new Employee("Quang", 20, "QN", 500, 5);
		emp[7] = new Employee("Minh", 20, "DN", 500, 5);
		
		int choice = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("MENU ---------- ");
			System.out.println("1. Input employees ");
			System.out.println("2. Display employees ");
			System.out.println("3. Calculate salary ");
			System.out.println("4. Calculate total salary ");
			System.out.println("5. Sort employee ");
			System.out.println("Nhập lựa chọn: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("---Input employee---");
				for (int i = 8; i < emp.length; i++) {
					emp[i] = new Employee();
					System.out.println("Nhan vien "+(i+1)+":");
					emp[i].inputEmployee();
					System.out.println();
				}
				System.out.println();
				break;
			}

			case 2: {
				System.out.println("---Display employee---");
				for (int i = 0; i < emp.length; i++) {
					System.out.println("Nhan vien " + (i + 1) + ":");
					emp[i].disEmployee();
					System.out.println();
				}
				break;
			}
			case 3: {
				System.out.println("---Calculate salary---");
				for (int i = 0; i < emp.length; i++) {
					System.out.println("Nhan vien " + (i + 1) + ":");
					System.out.print("Salary: ");
					System.out.println((int) emp[i].calSalary());
					System.out.println();
				}
				break;
			}
			case 4: {
				System.out.println("---Calculate total salary---");
				System.out.print("Salary: ");
				System.out.println(calTotalSalary(emp));
				break;
			}
			case 5: {
				System.out.println("---Sort employee---");
				convertName(emp);

				for (int i = 0; i < emp.length; i++) {
					System.out.println("Nhan vien " + (i + 1) + ":");
					emp[i].disEmployee();
					System.out.println();
				}
				break;
			}
			default:
				break;
			}
		} while (choice != 0);
	}

//	Other function

	public static double calTotalSalary(Employee[] emp) {
		double sum = 0;
		for (int i = 0; i < emp.length; i++) {
			sum += emp[i].calSalary();
		}
		return sum;
	}

	public static void convertName(Employee emp[]) {

		for (int i = 0; i < emp.length; i++) {
			for (int j = emp.length - 1; j > i; j--) {
				if (emp[j].getName().compareTo(emp[j - 1].getName()) > 0) {

					Employee temp = emp[j];
					emp[j] = emp[j - 1];
					emp[j - 1] = temp;
				}
			}

		}

	}

}
