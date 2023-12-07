import java.util.Scanner;

public class Lesson5 {
	public static void main(String[] args) {
		System.out.println("---MENU---");
		System.out.println("1- Entering student's name and average score");
		System.out.println("2- Tinh dien tich, chu vi hinh chu nhat");
		System.out.println("3- Tinh hoa don dien");
		System.out.println("4- Kiem tra so nguyen to");
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter your choice: ");
			choice =sc.nextInt();
			switch(choice) {
			case 1: Lesson1.main(args);
				break;
			case 2: Lesson2.main(args);
				break;
			case 3: Lesson3.main(args);
				break;
			case 4: Lesson4.main(args);
				break;
			default: 
				break;
			}
		}
		while(choice>=1 && choice<=4 );
		 
	}
}
