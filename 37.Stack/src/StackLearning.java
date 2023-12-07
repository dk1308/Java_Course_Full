import java.util.Scanner;
import java.util.Stack;

public class StackLearning {
	public static void main(String[] args) {
//		Ham stackSoDu.contains
//		Ham stackSoDu.pop
//		Ham stackSoDu.peek
//		Ham stackSoDu.push
		
		Scanner sc = new Scanner(System.in);
		Stack<String> stackChar = new Stack<String>();
		System.out.println("Nhập 1 chuỗi: ");
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			stackChar.push(s.charAt(i)+"");
		}
		
		System.out.println("Chuỗi đảo ngược: ");
		for (int i = 0; i < s.length(); i++) {
			System.out.print(stackChar.pop());
		}
		
		System.out.println();
		System.out.println("Nhập 1 số thập phân: ");
		int x = sc.nextInt();
		Stack<String> stackSoDu = new Stack<String>();
		while(x>0)
		{
			int sd = x%2;
			stackSoDu.push(sd+"");
			x/=2;
		}

		
		System.out.println("Stack số dư có chứa số 1: "+stackSoDu.contains("1"));
		System.out.println("Số nhị phân là: ");
		while(stackSoDu.isEmpty()!=true) {
			System.out.print(stackSoDu.pop());
		}
		System.out.println();
		System.out.println("Stack số dư có chứa số 1: "+stackSoDu.contains("1"));
	}
}
