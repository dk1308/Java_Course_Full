import java.util.Arrays;

public class BubbleSort {
	Inputter input = new Inputter();
	int arr[];
	public void inputElement() {
		int lenght = input.inputIntegerNumber("Nhập chiều dài mảng",1, Integer.MAX_VALUE);
		this.arr = new int[lenght];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.inputIntegerNumber("Nhập số "+(i+1), Integer.MIN_VALUE, Integer.MAX_VALUE);
		}
	}
	
	public void sortAsc() {
		for (int i = arr.length-1; i > 0; i--) 
			for (int j = 0; j <i; j++) 
				if (arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
	}
	
	public void sortDes() {
		for (int i = arr.length-1; i > 0; i--) 
			for (int j = 0; j <i; j++) 
				if (arr[j]<arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
	}
	
	public void displayArr()
	{
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1) 
				System.out.println(arr[i]);
			else
			System.out.print(arr[i]+"|");
		}
	}

	
	
}
