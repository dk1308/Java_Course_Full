import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConTactCustomer listCus = new ConTactCustomer();
		int choice = 0;
		do {
			System.out.println("MENU---");
			System.out.println("1-Add customer");
			System.out.println("2-Save customer");
			System.out.println("3-Edit customer");
			System.out.println("4-Delete customer");
			System.out.println("5-Search customer");
			System.out.println("6-Sort customer");
			System.out.println("7-Read customer");
			System.out.println("8-Display all customer");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("---Add customer---");
				listCus.addCus();
				break;
			case 2:
				System.out.println("---Save customer---");
				System.out.println("Enter file name: ");
				String fName = sc.next();
				File f = new File(fName);
				listCus.saveLisCus(f);
				break;
			case 3:
				System.out.println("---Edit customer---");
				listCus.editCus();
				break;
			case 4:
				System.out.println("---Delete customer---");
				listCus.deleteCus();
				break;
			case 5:
				System.out.println("---Search customer---");
				listCus.searchCus();
				break;
			case 6:
				System.out.println("---Sort customer---");
				listCus.sortCus();
				break;
			case 7:
				System.out.println("---Read customer---");
				System.out.println("Enter file name: ");
				String fName2 = sc.next();
				File f2 = new File(fName2);
				listCus.readCus(f2);
				break;
			case 8:
				System.out.println("---Display all customer---");
				listCus.displayAllCus();
				break;
			default:
				System.out.println("Bye!");
				break;
			}
		} while (choice <= 8 && choice >= 1);

	}
}
