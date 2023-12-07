import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		String options[] = new String[] { "Add new student", "Search a student based on his/her code",
				"Update name and mark of a student based on his/her code", "Remove a student based on his/her code",
				"List all students" };
		Menu mn = new Menu();
		int choice = 0;
		StudentList stdList = new StudentList();
		do {
			choice = mn.getChoice(options);
			switch (choice) {
			case 1: {
				System.out.println("---Add new student---");
				stdList.addStudent();
				break;
			}
			case 2: {
				System.out.println("---Search a student based on his/her code---");
				stdList.searchStudent();
				break;
			}
			case 3: {
				System.out.println("---Update name and mark of a student based on his/her code---");
				stdList.updateStd();
				break;
			}
			case 4: {
				System.out.println("---Remove a student based on his/her code---");
				stdList.removeStd();
				break;
			}
			case 5: {
				System.out.println("---List all students---");
				stdList.listStd();
				break;
			}
			default:
				System.out.println("Bye!");
				break;
			}
		} while (choice >= 1 && choice <= 5);
	}
}
