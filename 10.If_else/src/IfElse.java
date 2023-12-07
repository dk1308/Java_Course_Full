import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		float a = sc.nextFloat();
		System.out.println("Nhap b: ");
		float b = sc.nextFloat();
		System.out.println("--> "+a+"x+"+b+"=0");
		if(a==0)
		{
			if(b==0)
			{
				System.out.println("Phuong trinh vo so nghiem");
			} else {
				System.out.println("x="+(-b));
			}
		} else {
			System.out.println("x="+(-b/a));
		}
	}
}
