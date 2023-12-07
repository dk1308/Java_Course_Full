package Default;

import java.util.Arrays;

public class SplitFunction {
	public static void main(String[] args) {
		String s = "Xin chào, mình tên Khoa. Tạm biệt!";
		String a[]= s.split("\\,|\\.");
		System.out.println(Arrays.toString(a));
	}
}
