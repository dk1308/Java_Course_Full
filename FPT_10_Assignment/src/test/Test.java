package test;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import Employee.EmployeeList;
import Input.Inputter;
import Menu.Menu;

public class Test {
	public static void main(String[] args) {
		EmployeeList emp_list = new EmployeeList();
		String[] options = new String[] { "Thêm nhân viên từ 1 file", "Tính tiền lương cho từng nhân viên",
				"Cập nhật tiền lương cho nhân viên", "Sắp xếp tăng dần theo Monthly Income",
				"Sắp xếp giảm dần theo Account", "Sắp xếp tăng dần theo Role", "Sắp xếp tăng dần theo Employee ID",
				"Thêm nhân viên từ bàn phím", "In danh sách nhân viên", "Xóa danh sách sinh viên" };
		Menu menu = new Menu();
		int choice = 0;
		do {
			choice = menu.getChoice(options);
			switch (choice) {
			case 1: {
				File f = new File("C:\\Users\\ADMIN\\OneDrive\\Tài liệu\\FPT courses\\PRO\\Lab\\filecsv_saingay.csv");
				emp_list.addEmpFromFile(f);
				break;
			}
			case 2: {
				emp_list.calMoney();
				break;
			}
			case 3: {
				File f = new File("C:\\Users\\ADMIN\\OneDrive\\Tài liệu\\FPT courses\\PRO\\Lab\\filecsv_ghi.csv");
				emp_list.updateMoney(f);
				break;
			}
			case 4: {
				emp_list.listIncreaseMonthlyIncome();
				break;
			}
			case 5: {
				emp_list.listDecreaseAccount();
				break;
			}
			case 6: {
				emp_list.listIncreaseRole();
				break;
			}
			case 7: {
				emp_list.listIncreaseEmpId();
				break;
			}
			case 8: {
				File f = new File("C:\\Users\\ADMIN\\OneDrive\\Tài liệu\\FPT courses\\PRO\\Lab\\filecsv_ghi.csv");
				emp_list.addEmpFromKeyboard(f);
				break;
			}
			case 9: {
				emp_list.listAllEmployee();
				break;
			}
			case 10: {
				emp_list.clearEmployeeList();
				break;
			}
			default: {
				break;
			}
			}
		} while (choice >= 1 && choice <= 10);

	}
}