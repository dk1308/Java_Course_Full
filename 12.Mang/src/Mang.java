import java.util.Scanner;

public class Mang {
	public static void main(String[] args) {
		double[] arr1;
		double arr2[];
		Scanner sc = new Scanner(System.in);
		
		
//		Mang 1		
		arr1= new double[5];
//		Nhap mang
		for(int i=0; i<arr1.length;i++)
		{
			System.out.println("arr["+i+"]= ");
			arr1[i] = sc.nextDouble();
		}
		
		
//		Xuat mang
		System.out.println("-----");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println("arr["+i+"]="+arr1[i]);
			
		}
		
//		Tinh tong cac phan tu
		System.out.println("-----");
		double tong=0;
		for(int i=0; i<arr1.length;i++)
		{
			tong = tong+arr1[i];
		}
		System.out.println("Tong = "+tong);
		
		
		
		
//		Mang 2		
		arr2 = new double[] {1,2,3,4,6};
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr["+i+"]= "+arr2[i]);
		}
	}
}
