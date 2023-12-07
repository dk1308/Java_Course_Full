package Menu;

import java.util.Iterator;
import java.util.Scanner;

public class Menu {
	public static int getChoice(Object[] option)
	{
		for (int i = 0; i < option.length; i++) {
			System.out.println((i+1)+"-"+option[i]);
		}
		System.out.println("Choose 1.." + option.length +": ");
		Scanner sc = new Scanner(System.in);
		return Integer.parseInt(sc.nextLine());
	}
}
