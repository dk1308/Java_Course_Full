package DTO;

import java.util.Scanner;

public class Statue extends Item{
	private int weight;
	private String colour;
	public Statue(int value, String creator, int weight, String colour) {
		super(value, creator);
		this.weight = weight;
		this.colour = colour;
	}
	public Statue()
	{
		
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void input()
	{
	Scanner sc =new Scanner(System.in);
	super.input();
	System.out.println("weight: ");
	this.weight = sc.nextInt();
	sc.nextLine();
	System.out.println("colour: ");
	this.colour = sc.nextLine();
	}

	public void inputStatue()
	{
		input();
	}
	public void outputStatue()
	{
		System.out.println("---Statue---");
		output();
		System.out.println("weight: "+this.weight);
		System.out.println("colour: "+this.colour);
	}
}
