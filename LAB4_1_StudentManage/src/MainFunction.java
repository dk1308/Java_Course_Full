import java.util.Scanner;

public class MainFunction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		Inputter inputter = new Inputter();
		StudentList list = new StudentList();
		do {
			System.out.println("*****QUẢN LÍ SINH VIÊN*****" + "\n1. Tạo sinh viên" + "\n2. Tìm và sắp xếp sinh viên"
					+ "\n3. Cập nhật hoặc xóa sinh viên" + "\n4. Báo cáo" + "\n5. Thoát");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				list.createStudent();
				break;
			}
			case 2: {
				String name = new String();
				try {
					name = inputter.inputNotBlank("Nhập tên sinh viên cần tìm:");
				} catch (ValidDateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				list.findAndSortStudent(name);
				break;
			}
			case 3: {
				String id = new String();
				try {
					id = inputter.inputPattern("Nhập mã số sinh viên:", "[Ss][\\d]{3}");
				} catch (ValidDateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				list.updateOrDeleteStudent(id);
				break;
			}
			case 4: {
				list.displayStd(list.stdList);
				break;
			}
			default:
				break;
			}
		}while(choice>=1 && choice<=4);
	}
}
