import java.util.Scanner;

public class Inputter {
	public int inputInt(String msg, int min, int max) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		boolean check;
		do {
				check = true;
				System.out.println(msg);
				result = sc.nextInt();
		} while (result<min || result>max);
		return result;
	}

	public String inputNonBlankStr(String msg) {
		Scanner sc = new Scanner(System.in);
		String result;
		do {
			System.out.println(msg);
			result = sc.nextLine().trim();
		} while (result == "");
		return result;
	}
	
	public String inputPattern(String msg, String pattern)
	{
//		[Ss][\d]{3}
		Scanner sc = new Scanner(System.in);
		String result;
		do {
			System.out.println(msg);
			result = sc.nextLine();
		} while (result.matches(pattern)==false);
		return result;
	}
	
	public String inputStr(String msg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		return sc.nextLine();
	}
	
}
