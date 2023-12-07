import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Menu {
	public int getChoice(Object[] options)
	{
		System.out.println();
		for (int i = 0; i < options.length; i++) {
			System.out.println((i+1)+"-"+options[i]);
		}
		System.out.println("Nhập lựa chọn: ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}
