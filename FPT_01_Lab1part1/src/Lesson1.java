import java.util.Scanner;

public class Lesson1 {
	public static String nhapTen()
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		return name;
	}
	
	public static double nhapDiem()
	{
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();
		return score;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Nhap ten hoc sinh: ");
		String name = nhapTen();
		System.out.println("Nhap diem trung binh: ");
		double score= nhapDiem();
		System.out.println(name+" "+ score);
		
	}
}
