package control;
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
				System.err.println("Vui lòng nhập lại đúng khuôn mẫu: dd/MM/yyyy");
			}
		}
	}
	
	public String inputType(String msg) {
		String s="";
		while (true) {
			try {
				System.out.println(msg+": ");
				s = sc.nextLine().trim();
				if (!s.equalsIgnoreCase("new")&&!s.equalsIgnoreCase("member")&&!s.equalsIgnoreCase("vip")) 
					throw new Exception();
				return s;
			} catch (Exception e) {
				System.err.println("Vui lòng nhập lại đúng type (new/member/vip)!");
			}
		}
	}
	
	public String inputGender(String msg){
		String s="";
		while (true) {
			try {
				System.out.println(msg+": ");
				s = sc.nextLine().trim();
				if (!s.equalsIgnoreCase("male")&&!s.equalsIgnoreCase("male")) 
					throw new Exception();
				return s;
			} catch (Exception e) {
				System.err.println("Vui lòng nhập lại đúng type (male/female)!");
			}
		}
	}

	public String inputDegree(String msg){
		String s="";
		while (true) {
			try {
				System.out.println(msg+": ");
				s = sc.nextLine().trim();
				if (!s.equalsIgnoreCase("intermediate")&&!s.equalsIgnoreCase("college")&&!s.equalsIgnoreCase("university")) 
					throw new Exception();
				return s;
			} catch (Exception e) {
				System.err.println("Vui lòng nhập lại đúng type (intermediate/college/university)!");
			}
		}
	}
}
