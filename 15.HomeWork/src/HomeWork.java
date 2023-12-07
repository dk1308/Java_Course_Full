import java.util.Scanner;

public class HomeWork {
	public static int thapPhan(int a)
	{
		int count =0;
		double result=0;
		for(; a>=1; a/=10)
		{
			result = (double)result+(a%10)*Math.pow(2, count);
			count ++;
		}	
		return (int)result;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int a2=0;
		int count=0;
		do {
			System.out.println("Nhập 1 số nhị phân: ");
			a = sc.nextInt();
			a2=a;
			for(int i=0;a2>0 ;a2/=10)
			{
				count = a2%10;
				if(count!=0 && count!=1)
					break;
			}
		}while(count!=0 && count!=1);
		
		
		System.out.println("Số đó khi chuyển qua thập phân là: "+thapPhan(a));
	}
}
