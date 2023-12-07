
public class Main {
	public static void main(String[] args) {
		ContactManagement cm = new ContactManagement();
		Inputter input = new Inputter();
		String[] menuList = new String[] { "Thêm liên hệ", "Liệt kê tất cả liên hệ", "Xóa liên hệ", "Thoát" };
		Menu m = new Menu(menuList);
		int choice = 0;
		do {
			choice = m.inputChoice();
			switch (choice) {
			case 1: {
				cm.addContact();
				break;
			}
			case 2: {
				cm.displayAll();
				break;
			}
			case 3: {
				cm.deleteContact();
				break;
			}
			case 4: {
				System.out.println("Bai bai!");
				break;
			}
			}
		} while (choice <= 3 && choice >= 1);
	}
}
