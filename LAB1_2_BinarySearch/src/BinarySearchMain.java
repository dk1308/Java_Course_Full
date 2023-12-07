import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class BinarySearchMain {
	public static void main(String[] args) {
//		Nhập kích cỡ mảng
		Scanner sc = new Scanner(System.in);
		int numberOfArray;
		do {
			System.out.println("Enter number of array: ");
			numberOfArray = sc.nextInt();
		} while (numberOfArray <= 0);

		System.out.println("Enter search value: ");
		int numberSearch = sc.nextInt();

//		Gán giá trị vào mảng
		int array[] = new int[numberOfArray];
		Random rd = new Random();
		for (int i = 0; i < array.length; i++) {
			int randomNumber = rd.nextInt(10) + 1;
			array[i] = randomNumber;
		}

		bubbleSort(array);   /*Sắp xếp mảng*/
		
//		In ra mảng sau khi sắp xếp
		System.out.println();
		System.out.println("Sorted array: ");
		displayArray(array);
		
//		Tìm kiếm 
		int searchIdx = binarySearchVal(numberSearch, array, 0, array.length-1);
		System.out.println();
		if (searchIdx!=-1) {
			System.out.println("Found "+numberSearch+" at index "+searchIdx);
		} else System.out.println("Not found "+numberSearch);
		
	}

	private static void bubbleSort(int[] array) {
		for (int i = array.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	private static void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static int binarySearchVal(int val, int[] array, int leftIdx, int rightIdx)
	{
		if (rightIdx>leftIdx) {
			int middleIdx = (leftIdx+rightIdx)/2;
			if (array[middleIdx]==val) 
				return middleIdx;
			else if (array[middleIdx]<val)
				 return binarySearchVal(val, array, middleIdx+1, rightIdx);
			else return binarySearchVal(val, array, leftIdx, middleIdx);
		}
		else {
			return -1;
		}
	}
}
