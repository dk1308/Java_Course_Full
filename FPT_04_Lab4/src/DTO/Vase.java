package DTO;

import java.util.Scanner;

public class Vase extends Item{
	private int height;
	private String material;
	public Vase(int value, String creator, int height, String material) {
		super(value, creator);
		this.height = height;
		this.material = material;
	}
	
	public Vase()
	{
		
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
@Override
	public void input()
	{
	super.input();
	Scanner sc =new Scanner(System.in);
	System.out.println("height: ");
	this.height = sc.nextInt();
	sc.nextLine();
	System.out.println("material: ");
	this.material = sc.nextLine();
	}

	public void inputVase()
	{
		input();
	}
	public void outputVase()
	{
		System.out.println("---Vase---");
		output();
		System.out.println("height: "+this.height);
		System.out.println("material: "+this.material);
	}
}
