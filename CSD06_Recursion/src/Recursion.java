
public class Recursion {
	public static int factNonTail(int n) {
		if (n == 0)
			return 1;
		return n * factNonTail(n - 1);
	}

	public static int factTail(int n, int accumulator) {
		if (n == 0)
			return accumulator;
		return factTail(n - 1, accumulator * n);
	}

	public static int factLoop(int n) {
		int res = 1;
		while (n > 0) {
			res *= n;
			n--;
		}
		return res;
	}

	public static int factTailLoop(int n) {
		int accumulator = 1;
		while (n > 0) {
			accumulator *= n;
			n--;
		}
		return accumulator;
	}

	public static int factUsingDP(int n) {
		int[] a = new int[n + 1];
		a[0] = 1;
		for (int i = 1; i <= n; i++) {
			a[i] = a[i - 1] * i;
		}
		return a[n];
	}

	public static int fibo(int n) {
		if (n <= 1)
			return n;
		return fibo(n - 1) + fibo(n - 2);
	}

	public static int fiboLoop(int n) {
		int pre = 0;
		int cur = 1;
		int res = 0;
		if (n<=1) 
			return n;
		for (int i = 2; i <= n; i++) {
			res = cur + pre;
			pre = cur;
			cur = res;
		}
		return res;
	}
	
	public static int fiboUsingDP(int n)
	{
		int [] res = new int[n+1];
		res[0] = 0;
		res[1] = 1;
		for (int i = 2; i <= n; i++) {
			res[i] = res[i-1] + res[i-2];
		}
		return res[n];
	}

	public static String reverse(String s)
	{
		if (s.length()<=1) return s;
		return(reverse(s.substring(1, s.length()))+s.charAt(0));
	}
	
	public static boolean isPalindrome(String s)
	{
		if (s.length()<=1) return true;
		return(isPalindrome(s.substring(1, s.length()-1)) 
				&& s.charAt(0) == s.charAt(s.length()-1));
	}
	
	public static void main(String[] args) {
		int n = 10;
		String s = "yakay";
		System.out.println(n + "! = " + factNonTail(n));
		System.out.println(n + "! = " + factLoop(n));
		System.out.println(n + "! = " + factTailLoop(n));
		System.out.println(n + "! = " + factUsingDP(n));

		System.out.println("fibo(" + n + ") = " + fibo(n));
		System.out.println("fibo(" + n + ") = " + fiboLoop(n));
		System.out.println("fibo(" + n + ") = " + fiboUsingDP(n));
		
		System.out.println(s+" reverse to "+reverse(s));
		System.out.println(s+" is palindrome: "+isPalindrome(s));
	}
}
