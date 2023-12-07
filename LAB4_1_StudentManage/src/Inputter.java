import java.util.Scanner;

public class Inputter {
	Scanner sc = new Scanner(System.in);
	public String inputPattern(String msg, String pattern) throws ValidDateException
	{
		System.out.println(msg);
		String str =sc.nextLine();
		if (!str.matches(pattern)) 
			do {
				try {
					throw new ValidDateException("Mã sinh viên không đúng format (phải bắt đầu S và có 3 chữ số)!");
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(msg);
				str = sc.nextLine();
			} while (!str.matches(pattern));
		return str;
	}
	
	public String inputNotBlank(String msg) throws ValidDateException
	{
		System.out.println(msg);
		String str =sc.nextLine();
		if (str.isBlank()) 
			do {
				try {
					throw new ValidDateException("Không được để trống!");
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(msg);
				str =sc.nextLine();
			} while (str.isBlank());
		return str;
	}
	
	public int inputInt(String msg, int min, int max) {
		int r;
		do {
			System.out.println(msg);
			r = sc.nextInt();
		} while (r < min || r > max);
		return r;
	}
	
	public String inputCourse(String msg) throws ValidDateException
	{
		System.out.println(msg);
		sc.nextLine();
		String str =sc.nextLine().toUpperCase();
		if (!str.equals("JAVA") && !str.equals(".NET") && !str.equals("C/C++")) {
			do {
				try {
					throw new ValidDateException("Chỉ có khóa học Java, .Net hoặc C/C++!");
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println(msg);
				str =sc.nextLine().toUpperCase();
			} while (!str.equals("JAVA") && !str.equals(".NET") && !str.equals("C/C++"));
		}
		return str;
	}
}
