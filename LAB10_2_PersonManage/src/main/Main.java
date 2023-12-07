package main;

import control.Inputter;
import control.Management;
import control.Menu;

public class Main {
	public static void main(String[] args) {
		Management m = new Management();
		Inputter input = new Inputter();
		String[] menuList = new String[] { "Thêm nhân viên(ae)", "Thêm khách hàng(ac)", "Hiển thị nhân viên(dae)", "Hiển thị khách hàng(dac)", "Thoát(ea)" };
		Menu menu = new Menu(menuList);
		int choice = 0;
		do {
			choice = menu.inputChoice();
			switch (choice) {
			case 1: {
				m.addEmployee();
				break;
			}
			case 2: {
				m.addCustomer();
				break;
			}
			case 3: {
				m.displayAllEmp();
				break;
			}
			case 4: {
				m.displayAllCus();
				break;
			}
			case 5: {
				System.out.println("Bai bai!");
				break;
			}
			}
		} while (choice <= 4 && choice >= 1);
	}
}
