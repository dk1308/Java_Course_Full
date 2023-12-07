import java.util.Scanner;

public class Lesson4 {
	public static int inputNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		return num;
	}
	
	public static boolean checkPrime()
	{
		int count=0;
		int num=inputNum();
		for(int i=2; i <=Math.sqrt(num);i++)
		{
			if(num%i==0)
				count++;
		}
		if(num<=1)
			return false;
		return (count==0);
	}
	
	public static void main(String[] args) {
		System.out.println("This number is prime: "+checkPrime());
	}
}
