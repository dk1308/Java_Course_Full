package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDuGridLayout extends JFrame{
	public ViDuGridLayout()
	{
		
	}
	
	public void showWindow(String title, int width, int height)
	{
		this.setTitle(title);
		this.setSize(width, height);
		
		GridLayout gl1 = new GridLayout();
		GridLayout gl2 = new GridLayout(3, 5);
		GridLayout gl3 = new GridLayout(3, 5, 20, 50);
		
		this.setLayout(gl3);
		
		for (int i = 0; i < 15; i++) {
			JButton jb = new JButton((i+1)+"");
			this.add(jb);
		}
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		ViDuGridLayout vd = new ViDuGridLayout();
		vd.showWindow("Vi du GridLayout", 300, 300);
	}
}
