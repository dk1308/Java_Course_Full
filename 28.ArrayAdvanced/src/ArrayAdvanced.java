
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayAdvanced {
	public static void main(String[] args) {
// Kiểu dữ liệu  nguyên thủy
		System.out.println("A. Kiểu nguyên thủy");
		int[] arr1= {10,20,30};
		
//		Copy cách sd: System.arraycopy()
		System.out.println("---System.arraycoppy()---");
		int[] arr2 = new int[arr1.length];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		arr2[0]=100;
		System.out.println("arr1: "+Arrays.toString(arr1));
		System.out.println("arr2: "+Arrays.toString(arr2));
//		Copy cánh sd: clone()
		System.out.println("---clone()---");
		int arr3[] = arr1.clone();
		arr3[1] = 40;
		System.out.println("arr1: "+Arrays.toString(arr1));
		System.out.println("arr3: "+Arrays.toString(arr3));
//		Copy cách gán 
		System.out.println("---Gán---");
		int arr4[] = arr1;
		arr4[2] = 5;
		System.out.println("arr1: "+Arrays.toString(arr1));
		System.out.println("arr4: "+Arrays.toString(arr4));
		
		System.out.println();
// Kiểu dữ liệu tham chiếu
		System.out.println("B. Kiểu tham chiếu");
		String[]s1=new String[] {"FPT","Khoa"};
		
//		Copy cách sd: System.arraycopy()
		System.out.println("---System.arraycoppy()---");
		String[]s2 = new String[s1.length];
		System.arraycopy(s1, 0, s2, 0, s1.length);
		s2[0] = "DUT";
		System.out.println("s1: "+Arrays.toString(s1));
		System.out.println("s2: "+Arrays.toString(s2));
//		Copy cánh sd: clone()
		System.out.println("---clone()---");
		String []s3= s1.clone();
		s3[1]="Như";
		System.out.println("s1: "+Arrays.toString(s1));
		System.out.println("s3: "+Arrays.toString(s3));
//		Copy cách gán 
		System.out.println("---Gán---");
		String s4[] = s1;
		s4[0] = "DUE";
		System.out.println("s1: "+Arrays.toString(s1));
		System.out.println("s4: "+Arrays.toString(s4));
	}
}
