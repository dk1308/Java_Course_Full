import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		OfficialEmployee offical_emp_1 = new OfficialEmployee("Khoa", "DN", 19, 5000000, 5);
		SaleStaff sale_staff_1 = new SaleStaff("Hoang", "DN", 19, 6000000, 600, 0.1);
		
		OfficialEmployee offical_emp_2 = new OfficialEmployee();
		SaleStaff s= new SaleStaff();
//		offical_emp_1.inputOfficialEmployee();
		offical_emp_1.outputOfficialEmployee();
		
		
//		sale_staff_1.inputSaleStaff();
		sale_staff_1.outputSaleStaff();
		
		offical_emp_1.checkSameEmployee(sale_staff_1);
	}
	
	
}
