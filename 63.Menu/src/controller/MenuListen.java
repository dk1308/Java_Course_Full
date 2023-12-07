package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MenuView;

public class MenuListen implements ActionListener{
	MenuView menuView;
	public MenuListen(MenuView menuView)
	{
		this.menuView = menuView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String button = e.getActionCommand();
		if (button == "Open") {
			this.menuView.setTextLabel("Ban da open file!");
		} else if (button == "Exit") {
			System.exit(0);
		} else if (button == "Save in D driver") {
			this.menuView.setTextLabel("Ban da luu vao o dia D");
		} else if (button == "Save in C driver") {
			this.menuView.setTextLabel("PBan da luu vao o dia C");
		} else if (button == "Contact") {
			this.menuView.setTextLabel("Phone contact: 0941990138");
		}
	}

}
