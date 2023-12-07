package DTO;

import java.util.Scanner;

public class Painting extends Item {
	private int height;
	private int width;
	private boolean isWaterColour;
	private boolean isFramed;

	public Painting(int value, String creator, int height, int width, boolean isWaterColour, boolean isFramed) {
		super(value, creator);
		this.height = height;
		this.width = width;
		this.isWaterColour = isWaterColour;
		this.isFramed = isFramed;
	}

	public Painting() {
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public boolean isWaterColour() {
		return isWaterColour;
	}

	public void setWaterColour(boolean isWaterColour) {
		this.isWaterColour = isWaterColour;
	}

	public boolean isFramed() {
		return isFramed;
	}

	public void setFramed(boolean isFramed) {
		this.isFramed = isFramed;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.println("height: ");
		this.height = sc.nextInt();
		System.out.println("width: ");
		this.width = sc.nextInt();
		System.out.println("is water colour? : ");
		this.isWaterColour = sc.nextBoolean();
		System.out.println("is framed? : ");
		this.isFramed = sc.nextBoolean();
	}

	public void inputPainting() {
		input();
	}

	public void outputPainting() {
		System.out.println("---Painting---");
		output();
		System.out.println("height: " + this.height);
		System.out.println("width: " + this.width);
		System.out.println("is water colour? : " + this.isWaterColour);
		System.out.println("is framed? : " + this.isFramed);
	}

}
