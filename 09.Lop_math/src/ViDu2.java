import java.util.Scanner;

public class ViDu2 {
	public static void main(String[] args) {
		double r, S, P;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ban kinh r: ");
		r = sc.nextDouble();
		
//		Tinh chu vi
		P = 2*r*Math.PI;
		System.out.println("Chu vi duong tron la "+Math.round(P));
		
//		Tinh dien tich
		S = Math.PI*Math.pow(r, 2);
		System.out.println("Dien tich hinh trong la "+Math.round(S));
	}
}
