import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a = ");
		int a = sc.nextInt();
		System.out.println("b = ");
		int b = sc.nextInt();
		System.out.println(a+" == "+b+" --> "+(a==b));
		System.out.println(a+" >= "+b+" --> "+(a>=b));
		System.out.println(a+" <= "+b+" --> "+(a<=b));
		System.out.println(a+" != "+b+" --> "+(a!=b));
		System.out.println(a+" > "+b+" --> "+(a>b));
		System.out.println(a+" < "+b+" --> "+(a<b));
		System.out.println("a va b deu la so chan --> "+(a%2==0 && b%2==0) );
		System.out.println("a hoac b la so chan --> "+(a%2==0 || b%2==0) );
	}
}
