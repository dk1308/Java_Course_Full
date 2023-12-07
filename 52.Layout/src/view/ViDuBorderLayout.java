package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class ViDuBorderLayout extends JFrame{
	public ViDuBorderLayout()
	{
	}
	
	public void showWindow(String title, int width, int height)
	{
		this.setTitle(title);
		this.setSize(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout layout1 = new BorderLayout();
		BorderLayout layout2 = new BorderLayout(20,50);
		
		
		this.setLayout(layout2);
		
		JButton jb1 = new JButton("Button 1");
		JButton jb2 = new JButton("Button 2");
		JButton jb3 = new JButton("Button 3");
		JButton jb4 = new JButton("Button 4");
		JButton jb5 = new JButton("Button 5");
		
		
		this.add(jb1, BorderLayout.EAST);
		this.add(jb2, BorderLayout.WEST);
		this.add(jb3, BorderLayout.SOUTH);
		this.add(jb4, BorderLayout.NORTH);
		this.add(jb5, BorderLayout.CENTER);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		ViDuBorderLayout vd = new ViDuBorderLayout();
		vd.showWindow("ViDuFlowLayout", 100, 100);
	}
}
