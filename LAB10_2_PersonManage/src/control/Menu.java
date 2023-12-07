package control;
import java.util.List;
import java.util.Scanner;

import model.MenuEnum;

public class Menu {
	private String[] list;
	public Menu(String[] list) {
		this.list = list;
	}
	public int inputChoice() {
		Inputter input = new Inputter();
		for (int i = 0; i < list.length; i++) {
			System.out.println((i+1)+". "+list[i]);
		}
		String choice="";
		
		while (true) {
			choice = input.inputNotBlank("Nhập lựa chọn của bạn");
			if (choice.equalsIgnoreCase("ae")) return MenuEnum.ae.getValue();
			else if (choice.equalsIgnoreCase("ac")) return MenuEnum.ac.getValue();
			else if (choice.equalsIgnoreCase("dae")) return MenuEnum.dae.getValue();
			else if (choice.equalsIgnoreCase("dac")) return MenuEnum.dac.getValue();
			else if (choice.equalsIgnoreCase("cs")) return MenuEnum.cs.getValue();
			else if (choice.equalsIgnoreCase("ea")) return MenuEnum.ea.getValue();
			else System.err.println("Nhập sai! Vui lòng nhập lại.");
		}
	}
}	
