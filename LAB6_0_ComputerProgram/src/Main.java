import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String listChoice[] =new String[] {"Tính bài toán thông thường","Tính toán BMI","Thoát"};
		Menu menu = new Menu(listChoice);
		int choice = 0;
		Inputter i = new Inputter();
		ComputerProgram cp = new ComputerProgram();
		double resultDouble=0;
		BMIStatus resultBMI=null;
		do {
			choice = menu.inputChoice();
			switch (choice) {
			case 1: {
				resultDouble=cp.calculateNormal();
				System.out.println("Kết quả: "+resultDouble);
				break;
			}
			case 2: {
				resultBMI=cp.calculateBMI();
				System.out.println("Tình trạng BMI: "+resultBMI);
				break;
			}
			case 3: {
				System.out.println("Bai bai!");
				break;
			}
			}
		} while (choice>=1 && choice<=3);
	}	
}
