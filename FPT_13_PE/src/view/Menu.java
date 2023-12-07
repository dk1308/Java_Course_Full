package view;

import java.util.Scanner;

public class Menu {
	public int getChoice(Object[] object)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------------------------");
		for (int i = 0; i < object.length; i++) {
			System.out.println((i+1)+"-"+object[i]);
		}
		System.out.println("-------------------------------------------");
		System.out.print("Enter selection: ");
		return sc.nextInt();
	}
}
