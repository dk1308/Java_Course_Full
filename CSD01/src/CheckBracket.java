import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		
		if(check(s))
		{
			System.out.println("OK");
		} else System.out.println("NOT OK");
		
//		Stack<Integer> s = new Stack<>();
//		s.push(2);
//		s.push(1);
//		s.push(3);
//		s.push(10);
//		
//		System.out.println(s.firstElement());
	}
	
	private static boolean check(String s)
	{
//		Tao 1 mang chua cac ki tu cua chuoi
		char [] charArray = new char[s.length()];
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = s.charAt(i);
		}
		
//		Tao 1 stack
		Stack<Character> stack = new Stack<>();
		
		
//		Kiem tra day ngoac dung
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i]=='(' || charArray[i]=='[' || charArray[i]=='{') {
				stack.push(charArray[i]);
			} else {
				if (!stack.isEmpty() && charArray[i]==')' && stack.lastElement()=='(') {
					stack.pop();
				}
				else if (!stack.isEmpty() && charArray[i]==']' && stack.lastElement()=='[') {
					stack.pop();
				}
				else if (!stack.isEmpty() && charArray[i]=='}' && stack.lastElement()=='{') {
					stack.pop();
				}
				else return false;
			}
		}
		return true;
	}
}
