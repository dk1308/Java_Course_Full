import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSortMain {
	public static void main(String[] args) {
//		Nhập kích cỡ mảng
		Scanner sc = new Scanner(System.in);
		int numberOfArray;
		do {
			System.out.println("Enter number of array");
			numberOfArray = sc.nextInt();
		} while (numberOfArray <= 0);

//		Gán giá trị vào mảng
		int array[] = new int[numberOfArray];
		Random rd = new Random();
		for (int i = 0; i < array.length; i++) {
			int randomNumber = rd.nextInt(10) + 1;
			array[i] = randomNumber;
		}

//		In ra mảng ban đầu
		System.out.println("Before sorted");
		displayArray(array);

		quickSort(array, 0, array.length - 1); /* Sắp xếp mảng */

//		In ra mảng sau khi sắp xếp
		System.out.println();
		System.out.println("After sorted");
		displayArray(array);
	}

	private static void quickSort(int[] array, int lowIndex, int highIndex) {
		if (lowIndex< highIndex) {
			int pi = partition(array, lowIndex, highIndex);

			quickSort(array, lowIndex, pi - 1);
			quickSort(array, pi + 1, highIndex);
		}
	}

	private static int partition(int[] array, int lowIndex, int highIndex) {
		int pivotVal = array[highIndex];
//		System.out.println("pivot ="+pivot);
		int i = lowIndex-1;

		for (int j = lowIndex; j <= highIndex-1; j++) {
			if (array[j] <pivotVal) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		int temp = array[i+1];
		array[i+1] = array[highIndex];
		array[highIndex] = temp;
		return i+1;

	}

	private static void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
