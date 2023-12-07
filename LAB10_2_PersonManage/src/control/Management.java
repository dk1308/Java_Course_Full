package control;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import model.Customer;
import model.Employee;

public class Management {
	ArrayList<Employee> listEmp = new ArrayList<>();
	ArrayList<Customer> listCus = new ArrayList<>();
	Inputter i = new Inputter();
	
	public void addEmployee() {
			String newCode = returnCorrectCode(true);
			String newName = i.inputNotBlank("Nhập tên nhân viên");
			String newGender = i.inputGender("Nhập giới tính");
			String newDegree = i.inputDegree("Nhập bằng cấp");
			String newDob = i.inputPattern("Nhập ngày sinh", "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$");
			try {
				while(new SimpleDateFormat("dd/MM/yyyy").parse(newDob).after(new Date(System.currentTimeMillis()))) {
					newDob = i.inputPattern("Nhập ngày sinh", "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$");
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Employee newEmp = new Employee(newCode, newName, newGender, newDegree, newDob);
			this.listEmp.add(newEmp);
			System.out.println("Thêm nhân viên mới thành công!");
	}
	
	public void addCustomer() {
		String newCode = returnCorrectCode(false);
		String newName = i.inputNotBlank("Nhập tên nhân viên");
		String newGender = i.inputGender("Nhập giới tính");
		String newType = i.inputType("Nhập hạng khách hàng");
		String newDob = i.inputPattern("Nhập ngày sinh", "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$");
		try {
			while(new SimpleDateFormat("dd/MM/yyyy").parse(newDob).after(new Date(System.currentTimeMillis()))) {
				newDob = i.inputPattern("Nhập ngày sinh", "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Customer newCus = new Customer(newCode, newName, newGender, newDob, newType);
		this.listCus.add(newCus);
		System.out.println("Thêm khách hàng mới thành công!");
}
	
	public String returnCorrectCode(boolean isEmployee) {
		if (isEmployee == true) {
			if (!this.listEmp.isEmpty()) {
				Employee lastEmp = this.listEmp.get(this.listEmp.size() - 1);
				int correctId = Integer.parseInt(lastEmp.getCode().substring(1))+ 1;
				return "e" + correctId;
			}
			return "e1";
		}
		if (!this.listCus.isEmpty()) {
			Customer lastCus = this.listCus.get(this.listCus.size() - 1);
			int correctId = Integer.parseInt(lastCus.getCode().substring(1))+ 1;
			return "c" + correctId;
		}
		return "c1";
	}
	
	public void displayAllEmp() {
		for (Employee emp : listEmp) {
			System.out.println(emp);
		}
	}
	public void displayAllCus() {
		for (Customer cus : listCus) {
			System.out.println(cus);
		}
	}
}
