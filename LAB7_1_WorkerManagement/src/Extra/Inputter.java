package Extra;

import java.util.Scanner;

public class Inputter {
Scanner sc = new Scanner(System.in);
	
	public int inputNumber(String msg, int min, int max) {
		int n=0;
		while (true) {
			try {
				System.out.println(msg+": ");
				n = Integer.parseInt(sc.nextLine().trim());
				if (n<min || n>max) 
					throw new Exception();
				return n;
			} catch (Exception e) {
				System.err.println("Phải nhập 1 số ("+min+"-->"+max+")!");
				System.out.println("Vui lòng nhập lại: ");
			}
		}
	}
	
	public double inputNumber(String msg, double min, double max) {
		double n=0;
		while (true) {
			try {
				System.out.println(msg+": ");
				n = Double.parseDouble(sc.nextLine().trim());
				if (n<min || n>max) 
					throw new Exception();
				return (double)n;
			} catch (Exception e) {
				System.err.println("Phải nhập 1 số ("+min+"-->"+max+")!");
				System.out.println("Vui lòng nhập lại: ");
			}
		}
	}
	
	public String inputNotBlank(String msg) {
		String s="";
		while (true) {
			try {
				System.out.println(msg+": ");
				s = sc.nextLine().trim();
				if (s.isBlank()) 
					throw new Exception();
				return s;
			} catch (Exception e) {
				System.err.println("Không được để trống, vui lòng nhập lại!");
			}
		}
	}
	
	public String inputPattern(String msg, String pattern) /*[0-9]{10}|[0-9\s.-]{12,13}[\w]*|[(0-9)]{5}[0-9-]{9}*/{
		String s="";
		while (true) {
			try {
				System.out.println(msg+": ");
				s = sc.nextLine().trim();
				if (s.isBlank() || !s.matches(pattern)) 
					throw new Exception();
				return s;
			} catch (Exception e) {
				System.err.println("Vui lòng nhập lại đúng khuôn mẫu: \n"
						+ "• 1234567890\r\n"
						+ "• 123-456-7890 \r\n"
						+ "• 123-456-7890 x1234\r\n"
						+ "• 123-456-7890 ext1234\r\n"
						+ "• (123)-456-7890\r\n"
						+ "• 123.456.7890\r\n"
						+ "• 123 456 7890\r\n");
			}
		}
	}
}
