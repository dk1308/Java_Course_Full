import java.util.Scanner;

public class Inputter {
	
	
	Scanner sc = new Scanner(System.in);
	
	public Double inputNumber() {
		double n=0;
		while (true) {
			try {
				n = sc.nextDouble();
				return n;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Vui lòng nhập lại: ");
			}
		}
	}
}
