package view;

import javax.swing.JFrame;

public class MyWindow extends JFrame{
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void showWindow()
	{
		this.setVisible(true);
	}
	
	public void showWindow(String title)
	{
		this.setTitle("Window 2");
		this.setVisible(true);
	}
	
	public void showWindow(String title, int width, int height) {
		this.setTitle(title);
		this.setSize(width,height);
		this.setVisible(true);
	}
	
	public void showWindow(String title, int width, int height, int x, int y)
	{
		this.setTitle(title);
		this.setSize(width, height);
		this.setLocation(x, y);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow mw1 = new MyWindow();
		mw1.showWindow();
		
		MyWindow mw2 = new MyWindow();
		mw2.showWindow("Window 2");
		
		MyWindow mw3 = new MyWindow();
		mw3.showWindow("Window 3", 600, 300);
		
		MyWindow mw4 = new MyWindow();
		mw4.showWindow("Window 4", 600, 300, 700, 700);
	}
}