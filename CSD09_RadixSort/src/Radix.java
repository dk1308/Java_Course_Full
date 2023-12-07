
import java.util.Arrays;

class Radix {
 
    // A utility function to get maximum value in arr[]
    static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
 
    // A function to do counting sort of arr[] according to
    // the digit represented by rad.
    static void countSort(int arr[], int n, int rad)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
 
        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(arr[i] / rad) % 10]++;
 
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / rad) % 10] - 1] = arr[i];
            count[(arr[i] / rad) % 10]--;
        }
 
        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current
        // digit
        for (i = 0; i < n; i++) {
        	arr[i] = output[i];
        }
            
    }
 
    // The main function to that sorts arr[] of
    // size n using Radix Sort
    static void radixsort(int arr[], int n)
    {
        // Find the maximum number to know number of digits
        int m = getMax(arr, n);
 
        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // rad is 10^i where i is current digit number
        for (int rad = 1; m / rad > 0; rad *= 10) {
        	System.out.println();
        	System.out.println();
        	System.out.println("Hang "+rad+":");
        	countSort(arr, n, rad);
        	print(arr, n);
        }
    }
 
    // A utility function to print an array
    static void print(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
 
    // Main driver method
    public static void main(String[] args)
    {
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int n = arr.length;
 
        // Function Call
        radixsort(arr, n);
        System.out.println();
        System.out.println();
        System.out.println("Ket qua: ");
        print(arr, n);
               
    }
}