/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Recursion01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 4;
//        System.out.println(""+
//                (1/Math.sqrt(2.0)) * ());
//        System.out.println("The factorial of "+ fact(n));
//        System.out.println("The " + n + "-th fibonacci number is " + fiboLoop(n));
        //System.out.println("The " + n + "-th fibonacci number is " + fibo(n));
//        System.out.println("The " + n + "-th fibonacci number is " + fiboDP(n));
//            System.out.println(n+" != "+ factTail(n, 1));
String s = "racecar";
if(palindrome(s)) System.out.println("PALINDROME");
else System.out.println("NOT PALINDROME");
System.out.println("The reverse of "+s+" is " + reverse(s));
    }
    public static boolean palindrome(String s) {
        if (s.length() <= 1)
            return true;
        return (s.charAt(0) == s.charAt(s.length()-1) && 
                palindrome(s.substring(1, s.length()-1)));
    }
    public static String reverse(String s) {
        if (s.length() <= 1)
            return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
    public static int factDP(int n) {
        int[] f = new int[n+1];
        f[0] = 1;
        for(int i=1; i<=n; i++)
            f[i] = f[i-1] * i;
        return f[n];
    }
    public static int factLoop(int n) {
        int acc=1, i=n;
        while (i > 0) {
            acc = acc * i;
            i--;
        }
        return acc;
    }
    public static int factTail (int n, int acc) {
        if (n == 0) return acc;
        return factTail(n-1, acc*n);
    }
    public static int fact(int n) {
        if (n == 0) // base case: 0! = 1
            return 1;
        return (fact(n-1) * n);
    }
    public static int factLoopNaive(int n) {
        int acc = 1;
        for(int i=1; i<=n; i++)
            acc = acc * i;
        return acc;
    }
    public static long fiboDP(int n) {
        long[] f = new long[n+1];
        f[0] = 0; f[1] = 1;
        for(int i=2; i<=n; i++)
            f[i] = f[i-2] + f[i-1];
        return f[n];
    } 
    public static long fiboLoop(int n) {
        long prev=0, curr=1;
        for(int i=2; i<=n; i++) {
            long f = prev + curr;
            prev = curr;
            curr = f;
        }
        return curr;
    } 
    public static long fibo(long n) {
        if (n <= 1) 
            return n;
        return fibo(n-2) + fibo(n-1);
    } 
}
 