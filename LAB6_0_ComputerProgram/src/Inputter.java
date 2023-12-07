import java.util.Scanner;

public class Inputter {
	Scanner sc = new Scanner(System.in);
	
	public double inputDoubleNumber() {
		double n=0;
		while (true) {
			try {
				System.out.println("Nhập số: ");
				n = Double.parseDouble(sc.nextLine());
				return n;
			} catch (Exception e) {
				System.err.println("Phải nhập 1 số!");
				System.out.println("Vui lòng nhập lại: ");
			}
		}
	}
	
	public int inputIntegerNumber() {
		int n=0;
		while (true) {
			try {
				n = Integer.parseInt(sc.nextLine());
				return n;
			} catch (Exception e) {
				System.err.println("Phải nhập 1 số!");
				System.out.println("Vui lòng nhập lại: ");
			}
		}
	}
	
	public String inputOperator() {
		String o = "";
		while (true) {
			try {
				System.out.println("Nhập toán tử: ");
				o = sc.nextLine();
				if (!o.equals("+") && !o.equals("-") && !o.equals("*") && !o.equals("/") && !o.equals("=") && !o.equals("^")) 
					throw new Exception();
				return o;
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Phải nhập 1 toán tử!");
				System.out.println("Vui lòng nhập lại: ");
			}
		}
	}
}
