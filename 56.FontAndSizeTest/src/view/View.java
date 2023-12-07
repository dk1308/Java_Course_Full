package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Controller;
import model.Model;

public class View extends JFrame{
	Model m;
	JLabel jLabel_display;
	public View()
	{
		this.m = new Model();
		this.init();
		this.setVisible(true);
	}
	
	public void init()
	{
		this.setSize(300,300);
//		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Font font = new Font("Arial", Font.BOLD, 20);
		
		ActionListener al = new Controller(this);
		JLabel jLabel_title = new JLabel("Check the last button pushed!", JLabel.CENTER);
		jLabel_title.setFont(font);
		JPanel jPanel_button = new JPanel(new GridLayout(2,2));
		
	
		JButton jButton_1 = new JButton("1");
		jButton_1.setFont(font);
		jButton_1.addActionListener(al);
		JButton jButton_2 = new JButton("2");
		jButton_2.setFont(font);
		jButton_2.addActionListener(al);
		JButton jButton_3 = new JButton("3");
		jButton_3.setFont(font);
		jButton_3.addActionListener(al);
		JButton jButton_4 = new JButton("4");
		jButton_4.setFont(font);
		jButton_4.addActionListener(al);
		
		jPanel_button.add(jButton_1);
		jPanel_button.add(jButton_2);
		jPanel_button.add(jButton_3);
		jPanel_button.add(jButton_4);
		
		this.jLabel_display = new JLabel("Not performed yet", JLabel.CENTER);
		jLabel_display.setFont(font);
		
		JPanel jPanel_content = new JPanel(new BorderLayout());
		jPanel_content.add(jLabel_title, BorderLayout.NORTH);
		jPanel_content.add(jPanel_button, BorderLayout.CENTER);
		jPanel_content.add(jLabel_display, BorderLayout.SOUTH);
		this.setLayout(new BorderLayout());
		this.add(jPanel_content);
	}
	
	public void displayButt(int s)
	{
		this.m.setButt(s);
		this.jLabel_display.setText("Last button pushed was no."+this.m.getButt());
		
	}
}
