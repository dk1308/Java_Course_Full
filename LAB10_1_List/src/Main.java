import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ValidDateException {
		Inputter inp = new Inputter();
		WriteAndSearchList ws = new WriteAndSearchList();
		int choice = 0;
		do {
			System.out.println("\n===== Word Program ====");
			System.out.println("1. Đếm từ trong file");
			System.out.println("2. Tìm file bằng từ");
			System.out.println("3. Thoát");
			choice = inp.inputInt("Nhập lựa chọn của bạn", 1, 3);
			switch (choice) {
			case 1: {
				System.out.println("\n===== Đếm từ trong file ====");
				ws.function1();
				break;
			}
			case 2: {
				System.out.println("\n===== Tìm file bằng từ ====");
				ws.function2();
				break;
			}
			case 3: {
				System.out.println("Program terminated!");
				break;
			}
			}
		} while (choice>=1 && choice<=2);
	}
}
