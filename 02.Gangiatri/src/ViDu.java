import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("a="+a);
		a+=3;
		System.out.println("a+=3 --> a= "+a);
		a-=8;
		System.out.println("a-=5 --> a= "+a);
		a+=5;
		a*=2;
		System.out.println("a*=2 --> a= "+a);
		a/=4;
		System.out.println("a/=2 --> a= "+a);
	}
}
