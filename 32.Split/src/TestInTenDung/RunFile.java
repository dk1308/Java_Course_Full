package TestInTenDung;

import java.util.Scanner;

public class RunFile {
	public static void main(String[] args) {
		CorrectName cn = new CorrectName();
		Scanner sc = new Scanner(System.in);
		String[] name = new String[1];
		for (int i = 0; i < name.length; i++) {
			System.out.print("Ten "+(i+1)+" : ");
			name[i] = sc.nextLine();
		}
		
		for (int j = 0; j < name.length; j++) {
			System.out.print("-> correct name: ");
			cn.returnCorrectName(name[j]);
		}
	}
}
