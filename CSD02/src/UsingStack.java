import java.util.Scanner;
import java.util.Stack;

public class UsingStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<>();
		int choice;
		do {
			System.out.println();
			System.out.println("MENU ---------- ");
			System.out.println("1. Check if stack is empty ");
			System.out.println("2. Clear stack ");
			System.out.println("3. Insert new element into stack ");
			System.out.println("4. Delete an element from stack ");
			System.out.println("5. Return the top of stack ");
			System.out.println("6. Display all elements of stack ");
			System.out.println("7. Convert a decimal number to binary ");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				checkEmptyStack(s);
				break;
			}
			case 2: {
				clearStack(s);
				break;
			}
			case 3: {
				insertNewVal(s);
				break;
			}
			case 4: {
				try {
					deleteTopVal(s);
				} catch (EmptyStackException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 5: {
				try {
					System.out.println("The top value of the stack is: "+returnTopVal(s));
				} catch (EmptyStackException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 6: {
				displayStack(s);
				break;
			}
			case 7: {
				convertDecToBin();
				break;
			}
			default:
				break;
			}
		} while (choice > 0 && choice < 8);

	}
	
	
//	1. Kiểm tra stack có rỗng hay không
	private static void checkEmptyStack(Stack<Integer> s)
	{
		if (s.isEmpty()) {
			System.out.println("The stack is empty!");
		} else System.out.println("The stack is not empty!");
	}
	
//	2. Làm trống stack
	private static void clearStack(Stack<Integer> s)
	{
		s.clear();
		System.out.println("Clear the stack successfully!");
	}
	
//	3. Chèn giá trị mới vào stack
	private static void insertNewVal(Stack<Integer> s)
	{
		Scanner sc = new Scanner(System.in);
		int newVal;
		System.out.println("Enter new value: ");
		newVal =sc.nextInt();
		s.push(newVal);
		System.out.println("Insert new value successfully!");
	}
	
//	4. Xóa giá trị ở top trong stack
	private static void deleteTopVal(Stack<Integer> s) throws EmptyStackException
	{
		if (s.isEmpty()) {
			throw new EmptyStackException("Empty Stack");
		} else {
			s.pop();
			System.out.println("Delete the top value successfully!");
		}
	}
	
//	5. Trả về giá trị ở top trong stack
	private static Integer returnTopVal(Stack<Integer> s) throws EmptyStackException
	{
		if (s.isEmpty()) {
			throw new EmptyStackException("Empty Stack");
		} else return s.lastElement();
	}
	
//	6. In ra stack với giá trị từ trên xuống dưới
	private static void displayStack(Stack<Integer> s)
	{
		Stack<Integer> s2 = new Stack<>();
		s2 = (Stack<Integer>) s.clone();
		int[] a = new int[s2.size()];
		for (int i = 0; i < a.length; i++) {
			a[i]=s2.pop();
		}
		
		System.out.print("The stack from the top to the bottom: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
//	7. Chuyển 1 số từ hệ thập phân sang hệ nhị phân 
	private static void convertDecToBin()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int val = sc.nextInt();
		Stack<Integer> s = new Stack<>();
		while(val>0)
		{
			s.push(val%2);
			val/=2;
		}
		
		System.out.print("A binary number: ");
		while(!s.isEmpty())
		{
			System.out.print(s.pop());
		}
	}
}
