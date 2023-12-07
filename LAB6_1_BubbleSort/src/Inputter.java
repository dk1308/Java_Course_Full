import java.util.Scanner;

public class Inputter {
	Scanner sc = new Scanner(System.in);
	
	public double inputDoubleNumber(String msg) {
		double n=0;
		while (true) {
			try {
				System.out.println(msg+": ");
				n = Double.parseDouble(sc.nextLine());
				return n;
			} catch (Exception e) {
				System.err.println("Phải nhập 1 số!");
				System.out.println("Vui lòng nhập lại: ");
			}
		}
	}
	
	public int inputIntegerNumber(String msg, int min, int max) {
		int n=0;
		while (true) {
			try {
				System.out.println(msg+": ");
				n = Integer.parseInt(sc.nextLine());
				if (n<min || n>max) 
					throw new Exception();
				return n;
			} catch (Exception e) {
				System.err.println("Phải nhập 1 số ("+min+"-->"+max+")!");
				System.out.println("Vui lòng nhập lại: ");
			}
		}
	}
	
	public String inputOperator(String msg) {
		String o = "";
		while (true) {
			try {
				System.out.println(msg+": ");
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
