package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;

import model.Model;
import view.View;

public class Controller implements ActionListener{
	View view;
	Model model;
	private JButton jButton_1;
	
	public Controller(View view) {
		this.view = view;	
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src == "1") 
			this.view.displayButt(1);
		else if (src == "2") 
			this.view.displayButt(2);
		else if(src == "3")
			this.view.displayButt(3);
		else if(src == "4")
			this.view.displayButt(4);
	}
	
}
