
public class Main {
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		Inputter i = new Inputter();
		String menuList[] = new String[] {"Nhập phần tử", "Sắp xếp tăng dần", "Sắp xếp giảm dần", "Thoát"};
		Menu m = new Menu(menuList);
		int choice = 0;
		do {
			choice = m.inputChoice();
			switch (choice) {
			case 1: {
				System.out.println("====="+menuList[choice-1]+"=====");
				bs.inputElement();
				break;
			}
			case 2: {
				System.out.println("====="+menuList[choice-1]+"=====");
				bs.sortAsc();
				bs.displayArr();
				break;
			}
			case 3: {
				System.out.println("====="+menuList[choice-1]+"=====");
				bs.sortDes();
				bs.displayArr();
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
