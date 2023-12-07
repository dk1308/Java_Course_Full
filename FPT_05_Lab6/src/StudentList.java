import java.util.ArrayList;
import java.util.Iterator;

public class StudentList {
	ArrayList<Student> stdList = new ArrayList<Student>();
	public StudentList() {
		super();
	}
	
	
	
	public Student search(String tCode)
	{
		for (Student std : this.stdList) {
			if (std.getCode().equals(tCode)) 
				return std;
		}
		return null;
	}
	
	public boolean isDupplicated(String t)
	{
		int count=0;
		for (Student o : this.stdList) {
			if (o.getCode().equals(t)) 
				count++;
		}
		if (count==0) 
			return false;
		return true;
	}
	
	public void addStudent()
	{
		String newCode, newName;
		Inputter ip = new Inputter();
		newCode = ip.inputPattern("Nhập mã sinh viên: ", "[Ss][\\d]{3}").trim().toUpperCase();
		do {
			if (isDupplicated(newCode)) {
				System.out.println("Trùng mã sinh viên!");
				newCode = ip.inputPattern("Nhập mã sinh viên: ", "[Ss][\\d]{3}").trim().toUpperCase();
			}
		} while (isDupplicated(newCode));
		newName = ip.inputNonBlankStr("Nhập tên sinh viên: ").trim();
		int newMark = ip.inputInt("Nhập điểm sinh viên: ", 0, 10);
		Student std = new Student(newCode, newName, newMark);
		this.stdList.add(std);
		System.out.println("Student "+std.getCode()+" has been added");
	}
	
	public void searchStudent()
	{
		if (stdList.size()==0) 
			System.out.println("Empty list. No search can be performed!");
		else 
		{
			Inputter ip = new Inputter();
			String searchCode = ip.inputPattern("Nhập mã sinh viên cần tìm: ", "[Ss][\\d]{3}").trim().toUpperCase();
			Student searchStd = search(searchCode);
			if (searchStd!=null) {
				System.out.println("Found: " + searchStd);
			}
			else System.out.println("Student "+ searchCode +" doesn't exist!");
		}
	}
	
	public void updateStd()
	{
		if (stdList.size()==0) 
			System.out.println("Empty list. No update can be performed!");
		else
		{
			Inputter ip = new Inputter();
			String updateCode = ip.inputPattern("Mã số sinh viên cần thay thế: ", "[Ss][\\d]{3}").trim().toUpperCase();
			int count=0;
			for (Student std : stdList) {
				if (std.getCode().equals(updateCode)) 
					count++;
			}
			
			if (count==0) {
				System.out.println("Student "+ updateCode +" doesn't exist!");
			}
			else {
				String updateName = ip.inputNonBlankStr("Nhập tên thay thế: ");
				int updateMark = ip.inputInt("Nhập điểm thay thế: ", 0, 10);
				Student result = new Student();
				for (Student std : this.stdList) {
					if (std.getCode().equals(updateCode)) {
						std.setName(updateName);
						std.setMark(updateMark);
						result = std;
					}
				}
				System.out.println("Student "+ updateCode+ " been updated.");
			}
		}
	}
	
	public void removeStd()
	{
		if (stdList.size()==0) 
			System.out.println("Empty list. No remove can be performed!");
		else
		{
			Inputter ip = new Inputter();
			String updateCode = ip.inputPattern("Mã số sinh viên cần xóa: ", "[Ss][\\d]{3}").trim().toUpperCase();
			int count=0;
			for (Student std : this.stdList) {
				if (std.getCode().equals(updateCode)) {
					this.stdList.remove(std);
					System.out.println("Student "+ updateCode +" has been removed.");
					count++;
					break;
				}
			}
			if (count==0) {
				System.out.println("Student "+ updateCode +" doesn't exist!");
			} 
		}
	}
	
	public void listStd()
	{
		if (stdList.size()==0) 
			System.out.println("Empty list!");
		else {
			System.out.println("Student list: ");
			int i=0;
			for (Student std : this.stdList) {
				System.out.println(std);
				i++;
			}
			System.out.println("Total: "+i+" student(s)");
		}
	}
	
}
