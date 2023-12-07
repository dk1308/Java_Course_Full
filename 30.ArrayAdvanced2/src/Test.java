import java.util.Arrays;

public class Test {
	
	public static char[] reverseArray(char []a)
	{
		char[] rv = new char[a.length];
		int j=0;
		for (int i = a.length-1; i >= 0; i--) {
			rv[j] = a[i];
			j++;
		}
		return rv;
	}
	
	public static void main(String[] args) {
		
//		Hàm binarySearch
		System.out.println("---Arrays.binarySearch---");
		int [] a1 = new int[] {-9,-5,0,2,10,55};							//		Console:
		System.out.println("idx of -9: "+Arrays.binarySearch(a1,-9));		//		---Arrays.binarySearch---
		System.out.println();												//		idx of -9: 0		
//		Hàm sort 
		System.out.println("---Arrays.sort---");
		char [] a2 = {'K', 'N', 'G', 'H', 'D', 'T', 'H', 'Z'};
		Arrays.sort(a2);													//		Console:
		System.out.println("a2: "+Arrays.toString(a2));						//		---Arrays.sort---
		System.out.println();												//		a2: [D, G, H, H, K, N, T, Z]
//		Hàm fill
		System.out.println("---Arrays.fill---");							//		Console:
		Arrays.fill(a1, 2);													//		---Arrays.fill---
		System.out.println("a1: "+Arrays.toString(a1));						//		a1:	[2, 2, 2, 2, 2, 2]
		Arrays.fill(a1, 2, 4, -5);											//		a1: [2, 2, -5, -5, 2, 2]
		System.out.println("a1: "+Arrays.toString(a1));		
		System.out.println();
//		Đổi chiều hàm sort
		System.out.println("---sort descending---");									//		---sort descending---
		System.out.println("a2(descending): "+Arrays.toString(reverseArray(a2)));		//		a2(descending): [Z, T, N, K, H, H, 
																						//		G, D]


	}
}
