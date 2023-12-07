package Employee;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.Files;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import Input.Inputter;
import throwException.ValidDateException;

public class EmployeeList {
	ArrayList<Employee> list_emp = new ArrayList<Employee>();

	public boolean isDupplicated(String o) {
		for (Employee employee : list_emp) {
			if (employee.getEmpId().equals(o)) {
				return true;
			}
		}
		return false;
	}

//	---Hàm thêm danh sách nhân viên từ file
	public void addEmpFromFile(File f) {
		try {
			BufferedReader br = Files.newBufferedReader(f.toPath());
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] dataSplit = line.split(",");
				Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataSplit[3]);
				try {
					checkValidWorkStartDate(date);
					checkValidEmpId(dataSplit[1]);
					checkValidNonBlankStr(dataSplit[0]);
					checkValidNonBlankStr(dataSplit[2]);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				if (dataSplit[0].equals("1")) {
					Management emp = new Management();
					emp.setInfor(Integer.parseInt(dataSplit[0]), dataSplit[1], dataSplit[2], date,
							Double.parseDouble(dataSplit[4]));
					emp.setResolveIssueNumber(Integer.parseInt(dataSplit[5]));
					emp.setOtherTaskNumber(Integer.parseInt(dataSplit[6]));
					if (isCalMoney(emp, f)) {
						emp.setRewardSalary(Long.parseLong(dataSplit[7].trim()));
						emp.setMonthlyIncome(Long.parseLong(dataSplit[8].trim()));
						emp.setAllowance(Long.parseLong(dataSplit[9].trim()));
					}
					this.list_emp.add(emp);
				} else if (dataSplit[0].equals("2")) {
					Leader emp = new Leader();
					emp.setInfor(Integer.parseInt(dataSplit[0]), dataSplit[1], dataSplit[2], date,
							Double.parseDouble(dataSplit[4]));
					emp.setReviewTaskNumber(Integer.parseInt(dataSplit[5]));
					emp.setSupportTaskNumber(Integer.parseInt(dataSplit[6]));
					if (isCalMoney(emp,f)) {
						emp.setRewardSalary(Long.parseLong(dataSplit[7].trim()));
						emp.setMonthlyIncome(Long.parseLong(dataSplit[8].trim()));
						emp.setAllowance(Long.parseLong(dataSplit[9].trim()));
					}
					this.list_emp.add(emp);
				} else {
					Dev emp = new Dev();
					emp.setInfor(Integer.parseInt(dataSplit[0]), dataSplit[1], dataSplit[2], date,
							Double.parseDouble(dataSplit[4]));
					emp.setDoneTaskNumber(Integer.parseInt(dataSplit[5]));
					if (isCalMoney(emp,f)) {
						emp.setRewardSalary(Long.parseLong(dataSplit[6]));
						emp.setMonthlyIncome(Long.parseLong(dataSplit[7].trim()));
					}
					this.list_emp.add(emp);
				}	
			}
			br.close();
			System.out.println("Đã đọc file xong!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

	
//	---Hàm thêm danh sách nhân viên từ bàn phím
	public void addEmpFromKeyboard(File file)
	{
		Inputter inputter = new Inputter();
		FileWriter fw;
		try {
			fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			String new_empId = inputter.inputPattern("Nhập mã nhân viên cần thêm: ", "[M][N][V][\\d]{3}");
			if (isDupplicated(new_empId)) {
				do {
					System.out.println("Mã nhân viên trùng. Vui lòng nhập lại!");
					new_empId = inputter.inputPattern("Nhập mã nhân viên cần thêm: ", "[M][N][V][\\d]{3}");
				} while (isDupplicated(new_empId));
			}
			
			int new_role = inputter.inputInt("Nhập role nhân viên cần thêm: ",1,3);
			String new_account = inputter.inputNonBlank("Nhập account nhân viên cần thêm: ");
			Date new_workStartDate = inputter.inputDate("Nhập ngày bắt đầu làm của nhân viên: ");
			double new_productivity = inputter.inputDouble("Nhập hiệu suất nhân viên: ", 0.8, 1.2);
			if (new_role==1) {
				Management management = new Management();
				int resolveIssueNumber = inputter.inputInt("Nhập số vấn đề đã giải quyết: ",0,99999);
				int otherTaskNumber = inputter.inputInt("Nhập số lượng task common: ",0,99999);
				management.setInfor(new_role, new_empId, new_account, new_workStartDate, new_productivity);
				management.setResolveIssueNumber(resolveIssueNumber);
				management.setOtherTaskNumber(otherTaskNumber);
				this.list_emp.add(management);
				pw.println(management.toString());
			} else if (new_role==2) {
				Leader leader = new Leader();
				int reviewTaskNumber = inputter.inputInt("Nhập số task đã review: ",0,99999);
				int supportTaskNumber = inputter.inputInt("Nhập số lượng task support: ",0,99999);
				leader.setInfor(new_role, new_empId, new_account, new_workStartDate, new_productivity);
				leader.setReviewTaskNumber(reviewTaskNumber);
				leader.setSupportTaskNumber(supportTaskNumber);
				this.list_emp.add(leader);
				pw.println(leader.toString());
			} else {
				Dev dev = new Dev();
				int doneTaskNumber = inputter.inputInt("Số task đã hoàn thành: ",0,99999);
				dev.setInfor(new_role, new_empId, new_account, new_workStartDate, new_productivity);
				dev.setDoneTaskNumber(doneTaskNumber);
				this.list_emp.add(dev);
				pw.println(dev.toString());
			}
			bw.close();
			pw.close();
			System.out.println("Đã thêm nhân viên!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//  ---Hàm tính lương cho nhân viên
	public void calMoney() {
		Inputter inputter = new Inputter();
		int count=0;
		String empId = inputter.inputPattern("Nhập mã nhân viên: ", "[M][N][V][\\d]{3}");
		for (Employee employee : list_emp) {
			if (employee.getEmpId().equals(empId)) {
				if (employee.getRole()==1) {
					((Management) employee).calReward();
					((Management) employee).calAllowance();
					((Management) employee).calMonthlyIncome();
				} else if (employee.getRole() == 2) {
					((Leader) employee).calReward();
					((Leader) employee).calAllowance();
					((Leader) employee).calMonthlyIncome();
				} else{
					((Dev) employee).calReward();
					((Dev) employee).calMonthlyIncome();
				}
				count++;
			}
		}
		if (count!=0) {
			System.out.println("Đã tính tiền nhân viên "+empId+"!");
		} else System.out.println("Mã nhân viên "+empId+" không tìm thấy!");
	}
	
//	---Hàm cập nhật tiền lương cho nhân viên 
	public void updateMoney(File f)
	{
		try {
			FileWriter fw = new FileWriter(f, false);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			for (Employee employee : list_emp) {
				if (employee.getRole()==1) {
					pw.println(employee.toString(true));
				} else if (employee.getRole()==2) {
					pw.println(employee.toString(true));
				} else if (employee.getRole()==3){
					pw.println(employee.toString(true));
				}
			}
			bw.close();
			pw.close();
			System.out.println("Đã cập nhật tiền lương cho nhân viên!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

//  ---Hàm sắp xếp tăng dần theo monthlyIncome
	public void listIncreaseMonthlyIncome() {
		int count=0;
		for (Employee employee : list_emp) {
			if (employee.getRewardSalary()!=0) {
				count++;
			}
		}
		if (count==0) {
			System.out.println("Chưa có nhân viên nào được tính Monthly Income. Vui lòng cập nhật trước khi sắp xếp!");
		} else {
			Collections.sort(this.list_emp, new Comparator<Employee>() {
				@Override
				public int compare(Employee o1, Employee o2) {
					// TODO Auto-generated method stub
					if (o1.getMonthlyIncome() > o2.getMonthlyIncome()) {
						return 1;
					} else if (o1.getMonthlyIncome() < o2.getMonthlyIncome()) {
						return -1;
					} else
						return 0;
				}
			});
			System.out.println("Đã sắp xếp tăng dần theo Monthly Income");
		}
	}

//  ---Hàm sắp xếp giảm dần theo account
	public void listDecreaseAccount() {
		Collections.sort(this.list_emp, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				if (o1.getAccount().compareTo(o2.getAccount()) > 0) {
//					return -1;
//				} else if (o1.getAccount().compareTo(o2.getAccount()) < 0) {
//					return 1;
//				} else
//					return 0;
				return -o1.getAccount().compareTo(o2.getAccount());
			}
		});
		System.out.println("Đã sắp xếp giảm dần theo Account");
	}

//  ---Hàm sắp xếp tăng dần theo role
	public void listIncreaseRole() {
		Collections.sort(this.list_emp, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				if (o1.getRole() > o2.getRole()) {
					return 1;
				} else if (o1.getRole() < o2.getRole()) {
					return -1;
				} else
					return 0;
			}
		});
		System.out.println("Đã sắp xếp tăng dần theo Role");
	}

//  ---Hàm sắp xếp tăng dần theo employee ID
	public void listIncreaseEmpId() {
		Collections.sort(this.list_emp, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				if (o1.getEmpId().compareTo(o2.getEmpId()) > 0) {
					return 1;
				} else if (o1.getEmpId().compareTo(o2.getEmpId()) < 0) {
					return -1;
				} else
					return 0;
			}
		});
		System.out.println("Đã sắp xếp tăng dần theo Employee ID");
	}


	
//	---Hàm liệt kê tất cả nhân viên
	public void listAllEmployee() {
		System.out.println("Danh sách nhân viên-----");
		for (Employee employee : list_emp) {
			if (isCalMoney(employee)) {
				System.out.println(employee.toString(true));
			} else System.out.println(employee.toString());
		}
		System.out.println("Total: "+list_emp.size()+" employee(s)");
	}

//	---Hàm xóa hết danh sách nhân viên
	public void clearEmployeeList()
	{
		list_emp.clear();
		System.out.println("Đã clear danh sách nhân viên!");
	}
	
	
	
	
	
	
//	***Hàm phụ
//	---Hàm check valid workstartdate
	public void checkValidWorkStartDate(Date d) throws ValidDateException {
		Date current_date = new Date(System.currentTimeMillis());
		if (d.after(current_date))
			{
				throw new ValidDateException("Ngày vào công ty phải nhỏ hơn ngày hiện tại!");
			}
		
	}
//	---Hàm check valid emp ID
	public void checkValidEmpId(String i)throws ValidDateException {
		if (!i.matches("[M][N][V][\\d]{3}"))
			{
				throw new ValidDateException("Mã nhân viên không đúng format (phải bắt đầu MNV và có 6 ký tự)!");
			}
	}
//	---Hàm check valid account và role
	public void checkValidNonBlankStr(String str) throws ValidDateException
	{
		if (str.isEmpty()) {
			throw new ValidDateException("Role và Account không được empty!");
		}
	}
//	---Hàm check employee đã được tính lương hay chưa
	public boolean isCalMoney(Employee e)
	{
		if (e.getRewardSalary()==0) 
			return false;
		return true;
	}
	
	public boolean isCalMoney(Employee e, File f)
	{
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while((line = br.readLine())!=null)
				{
					String[] data_split = line.split(",");
					if(e.getEmpId().equals(data_split[1]))
					{
						if ((data_split.length>7 && e.getRole()==1) || (data_split.length>7 && e.getRole()==2)
								|| (data_split.length>6 && e.getRole()==3)) 
							return true;
						return false;
					}
				}
			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		return false;
		
	}

}
