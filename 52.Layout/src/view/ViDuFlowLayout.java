package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDuFlowLayout extends JFrame{
	public ViDuFlowLayout()
	{
	}
	
	public void showWindow(String title, int width, int height)
	{
		this.setTitle(title);
		this.setSize(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		FlowLayout layout1 = new FlowLayout();
		FlowLayout layout2 = new FlowLayout(FlowLayout.RIGHT);
		FlowLayout layout3 = new FlowLayout(FlowLayout.LEFT, 50, 100);
		
		ViDuFlowLayout vd = new ViDuFlowLayout();
		vd.setLayout(layout3);
		
		JButton jb1 = new JButton("Button 1");
		JButton jb2 = new JButton("Button 2");
		JButton jb3 = new JButton("Button 3");
		
		vd.add(jb1);
		vd.add(jb2);
		vd.add(jb3);
		
		vd.showWindow("ViDuFlowLayout", 100, 100);
	}
}
