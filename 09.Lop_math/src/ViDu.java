import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		a = sc.nextDouble();
		System.out.println("Nhap b: ");
		b = sc.nextDouble();
		
//		Tri tuyet doi
		System.out.println("|"+a+"|= "+ Math.abs(a));
		
//		Ham tim min
		System.out.println("Min("+a+","+b+")= "+Math.min(a,b));
		
//		Ham tim max
		System.out.println("Max("+a+","+b+")= "+Math.max(a,b));
		
//		Ham ceil
		System.out.println("ceil("+a+")= "+Math.ceil(a));
		
//		Ham floor
		System.out.println("floor("+a+")= "+Math.floor(a));
		
//		Ham sqrt
		System.out.println("sqrt("+a+")= "+Math.sqrt(a));
		
//		Ham pow
		System.out.println(a+"^"+b+"= "+Math.pow(a,b));
	}
}
