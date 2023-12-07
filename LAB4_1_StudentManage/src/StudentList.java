import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentList {
	ArrayList<Student> stdList = new ArrayList<>();
	
	public void createStudent()
	{
		Inputter inputter = new Inputter();
		try {
			do {
				Student newStd = new Student();
				newStd.setId(inputter.inputPattern("Nhập mã số sinh viên:", "[Ss][\\d]{3}"));
				newStd.setName(inputter.inputNotBlank("Nhập tên sinh viên:"));
				newStd.setSemester(inputter.inputInt("Nhập kì học:", 1, 9));
				newStd.setCourse(inputter.inputCourse("Nhập tên môn học: "));
//				String id = inputter.inputPattern("Nhập mã số sinh viên:", "[Ss][\\d]{3}");
//				String name = inputter.inputNotBlank("Nhập tên sinh viên:");
//				int semester = inputter.inputInt("Nhập kì học:", 1, 9);
//				String course = inputter.inputNotBlank("Nhập tên môn học: ");
				stdList.add(newStd);
				System.out.println("Thêm sinh viên "+newStd.getId()+" thành công!");
			} while (stdList.size()<3);
			String choice = inputter.inputNotBlank("Bạn có muốn tiếp tục (Y/N)?").toUpperCase();
			if (choice.equals("Y")) 
				createStudent();
		} catch (ValidDateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void findAndSortStudent(String name) {
		Collections.sort(this.stdList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		for (Student student : stdList) {
			if (student.getName().contains(name))
				System.out.println(student);
	}
}
//	ff
	
	public void updateOrDeleteStudent(String id)
	{
		Inputter inputter = new Inputter();
		for (Student student: stdList) {
			if (student.getId().equals(id)) {
				try {
					System.out.println(student);
					String choice = inputter.inputNotBlank("Bạn muốn cập nhật (U) hay xóa (D) sinh viên?").toUpperCase();
					if (choice.equals("U")) {
						int updateChoice = inputter.inputInt("Bạn muốn cập nhật phần?"
								+ "\n1. Tên"
								+ "\n2. Kì"
								+ "\n3. Môn học", 1, 3);
						if(updateChoice == 1) {
							String newName = inputter.inputNotBlank("Nhập tên sinh viên:");
							student.setName(newName);
						}
						else if(updateChoice == 2)
						{
							int newSemester = inputter.inputInt("Nhập kì học:", 1, 9);
							student.setSemester(newSemester);
						}
							
						else if(updateChoice == 3)
						{
							String newCourse = inputter.inputCourse("Nhập tên môn học: ");
							student.setCourse(newCourse);
						}
						System.out.println("Cập nhật thành công!");
					} else if (choice.equals("D")) {
						this.stdList.remove(student);
						System.out.println("Xóa thành công!");
					}
				} catch (ValidDateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public void displayStd(ArrayList<Student> stdList)
	{
		for (Student student : stdList) {
			System.out.println(student);
		}
	}
	
	
		
}
