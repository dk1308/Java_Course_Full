import java.util.Random;
import java.util.Scanner;

public class LinearSearchMain {
	public static void main(String[] args) {
//		Nhập kích cỡ mảng
		Scanner sc = new Scanner(System.in);
		int numberOfArray;
		do {
			System.out.println("Enter number of array");
			numberOfArray = sc.nextInt();
		} while (numberOfArray<=0);
		
//		Gán giá trị vào mảng
		int array[] = new int[numberOfArray];
		Random rd = new Random();
		for (int i = 0; i < array.length; i++) {
			int randomNumber = rd.nextInt(10)+1;
			array[i] = randomNumber;
		}
		
//		Nhap gia tri can tim
		System.out.println("Enter search value: ");
		int numberSearch = sc.nextInt();
		
//		In ra mảng 
		System.out.println("Before sorted");
		displayArray(array);
		
//		Tra ve index gia tri tim thay
		System.out.println();
		System.out.println("Found "+numberSearch+" at index: "+ linearSearchFunction(array, numberSearch));
	}
	
	private static int linearSearchFunction(int[] array, int x)
	{
		for (int i = 0; i < array.length; i++) {
			if (x==array[i]) {
				return i;
			}
		}
		return -1;
	}
	
	private static void displayArray(int[] array)
	{
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
