package DTO;

import java.util.Scanner;

public class Item {
	protected int value;
	protected String creator;
	public Item(int value, String creator) {
		this.value = value;
		this.creator = creator;
	}
	
	public Item()
	{
		
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if (value > 0) {
			this.value = value;
		}
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		if (creator!=null) {
			this.creator = creator;
		}
	}

	public void output()
	{
		System.out.println("value: "+this.value);
		System.out.println("creator: "+this.creator);
	}
	
	public void input()
	{
		Scanner sc =new Scanner(System.in);
		do {
			System.out.println("value: ");
			this.value = sc.nextInt();
			sc.nextLine();
		} while (this.value<=0);
		
		do {
			System.out.println("creator: ");
			this.creator = sc.nextLine();
		} while (this.creator=="");
	}
}
