import java.util.Scanner;

public class Lesson3 {
	public static double eUsage()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter monthly electricity usage: ");
		double eUse= sc.nextDouble();
		return eUse;
	}
	public static double calPrice()
	{
		double price;
		double eUse=eUsage();
		if(eUse<=50)
			price = eUse*1000;
		else price = 50*1000+(eUse-50)*1200;
		return price;
	}
	public static void main(String[] args) {
		System.out.println("Electricity bill: "+calPrice());
		
	}
}
