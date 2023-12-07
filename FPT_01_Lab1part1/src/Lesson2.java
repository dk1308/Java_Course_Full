import java.util.Scanner;

public class Lesson2 {
	public static double canh1()
	{
		double canh1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap canh 1: ");
		canh1 = sc.nextDouble();
		return canh1;
	}
	public static double canh2()
	{
		double canh2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap canh 2: ");
		canh2 = sc.nextDouble();
		return canh2;
	}
	public static void main(String[] args) {
		double canh1 = canh1();
		double canh2 = canh2();
		System.out.println("Chu vi hinh chu nhat la: "+((canh1+canh2)*2));
		System.out.println("Dien tich hinh chu nhat la: "+(canh1*canh2));
		if(canh1<canh2)
		System.out.println("Chieu rong hinh chu nhat la: " +canh1);
		else System.out.println("Chieu rong hinh chu nhat la: " +canh2);
	}
}
