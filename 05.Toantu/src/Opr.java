import java.util.Scanner;

public class Opr {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = sc.nextInt();
		System.out.print("Enter b: ");
		b = sc.nextInt();
//		Phep tinh tong
		System.out.println(a+" + "+b+" = "+(a+b));
		
//		Phep tinh hieu
		System.out.println(a+" - "+b+" = "+(a-b));
		
//		Phep tinh nhan
		System.out.println(a+" * "+b+" = "+(a*b));
		
//		Phep tinh chia
		System.out.println(a+" / "+b+" = "+((float)a/b));
		
//		Phep tinh phan du
		System.out.println(a+" % "+b+" = "+(a%b));
	}
}
