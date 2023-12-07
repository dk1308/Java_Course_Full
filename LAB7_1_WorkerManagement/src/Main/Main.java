package Main;
import java.awt.Menu;
import Extra.Inputter;
import Manage.WorkerManagement;

public class Main {
	public static void main(String[] args) {
			Inputter input = new Inputter();
			String[] menuList = new String[] { "Thêm công nhân", "Tăng lương", "Giảm lương", "Hiển thị thông tin lương", "Thoát" };
			Extra.Menu m = new Extra.Menu(menuList);
			WorkerManagement wm = new WorkerManagement();
			int choice = 0;
			do {
				System.out.println("***MENU***");
				choice = m.inputChoice();
				switch (choice) {
				case 1: {
					wm.addWorker();
					break;
				}
				case 2: {
					wm.upSalary();
					break;
				}
				case 3: {
					wm.downSalary();
					break;
				}
				case 4: {
					wm.displaySalHistory();
					break;
				}
				case 5: {
					System.out.println("Bai bai!");
					break;
				}
				}
			} while (choice <= 5 && choice >= 1);
	}
}
