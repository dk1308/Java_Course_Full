package Extra;

import java.util.Scanner;

public class Menu {
	private String[] list;
	public Menu(String[] list) {
		this.list = list;
	}
	public int inputChoice() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < list.length; i++) {
			System.out.println((i+1)+". "+list[i]);
		}
		int choice=0;
		while (true) {
			try {
				System.out.println("Nhập lựa chọn của bạn: ");
				choice = Integer.parseInt(sc.nextLine());
				return choice;
			} catch (Exception e) {
				System.err.println("Phải nhập 1 số!");
				System.out.println("Vui lòng nhập lại: ");
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world!");
	}
}
