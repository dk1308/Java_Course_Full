import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab {
	public static int[] inputArray(int n, int min, int max)
	{
		Random rand =new Random();
		int arr[]=new int[n];
		for(int i=0 ; i<n ; i++)
		{
			arr[i] = rand.nextInt(max-min)+min;
		}
		return arr;
	}
	
	public static int[] sortArray(int arr[], int n)
	{
		Arrays.sort(arr);
		return arr;
	}
	
	public static int countEven(int arr[], int n)
	{
		int count =0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2 ==0)
				count++;
		}
		return count;
	}
	public static int[] returnEven(int arr[], int n)
	{
		int arr2[]= new int[n];
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				arr2[j]=arr[i];
				j++;
			}
		}
		return arr2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	1. Khai bao mang
		System.out.println("Enter n: ");
		int n =sc.nextInt();
		
		System.out.println("Enter min value: ");
		int min = sc.nextInt();
		
		System.out.println("Enter max value: ");
		int max = sc.nextInt();
		
		int[] arr=inputArray(n,min,max);
		
//	2. Khoi tao gia tri	
		for(int i=0 ; i<n ; i++)
		{
			System.out.println("arr["+i+"] = " +arr[i]);
		}
//	3. Sap xep mang
		System.out.println("---Mang sau sap xep---");
		arr=sortArray(arr,n);
		System.out.println(Arrays.toString(arr));
		
//	4. Tinh tong 
		System.out.println("---Tinh tong---");
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Tong cac phan tu cua mang la: "+sum);
	
//	5. Dem so chan
		System.out.println("---Dem so chan---");
		System.out.println("So phan tu chan la: "+countEven(arr,n));
		
//	6. Tra ve so chan
		System.out.println("---In ra cac so chan---");
		int[] arr2= returnEven(arr,n);
		for(int i=0;i< arr2.length; i++)
		{
			if(arr2[i]==0)
				break;
			System.out.print(arr2[i] +" ");
		}
	}
}
