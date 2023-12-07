import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class BubbleSortMain {
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
		
//		In ra mảng ban đầu
		System.out.println("Before sorted");
		displayArray(array);
		
		bubbleSort(array);   /*Sắp xếp mảng*/
		
//		In ra mảng sau khi sắp xếp
		System.out.println();
		System.out.println("After sorted");
		displayArray(array);
	}
	
	private static void bubbleSort(int[] array)
	{
		for (int i = array.length; i >0 ; i--) {
			for (int j = 0; j < i-1; j++) {
				if (array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] =temp;
				}
			}
		}
	}
	
	private static void displayArray(int[] array)
	{
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
