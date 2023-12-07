package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import controller.MenuListen;

public class MenuView extends JFrame{
	private JLabel textJLabel;
	private ActionListener actionListener;
	public MenuView()
	{
		this.setTitle("Menu Example");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		actionListener = new MenuListen(this);
		JMenuBar jMenuBar = new JMenuBar();
		
		JMenu jMenu_file = new JMenu("File");
		JMenuItem jMenuItem_open = new JMenuItem("Open");
		jMenuItem_open.addActionListener(actionListener);
		JMenu jMenu_save = new JMenu("Save");
		JMenuItem jMenuItem_saveD = new JMenuItem("Save in D driver");
		JMenuItem jMenuItem_saveC = new JMenuItem("Save in C driver");
		jMenu_save.add(jMenuItem_saveD);
		jMenuItem_saveD.addActionListener(actionListener);
		jMenu_save.add(jMenuItem_saveC);
		jMenuItem_saveC.addActionListener(actionListener);
		JMenuItem jMenuItem_exit = new JMenuItem("Exit");
		jMenuItem_exit.addActionListener(actionListener);
		
		jMenu_file.add(jMenuItem_open);
		jMenu_file.add(jMenu_save);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_exit);
		
		JMenu jMenu_help = new JMenu("Help");
		JMenuItem jMenuItem_contact = new JMenuItem("Contact");
		jMenuItem_contact.addActionListener(actionListener);
		jMenu_help.add(jMenuItem_contact);
		
		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_help);
		
		textJLabel  = new JLabel();
		this.setJMenuBar(jMenuBar);
		this.add(textJLabel, BorderLayout.CENTER);
		
		this.setVisible(true);
	}

	public void setTextLabel(String string) {
		this.textJLabel.setText(string);
	}
}
