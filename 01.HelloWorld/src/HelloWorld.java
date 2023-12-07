import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc = new Scanner(System.in);
		int i=0;
		try {
			System.out.println("i =");	
			i = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Khong hop le");// TODO: handle exception
		}
		finally {
			System.out.println("Ket thuc");
		}
		
	}
}
