package view;

import java.awt.Image;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class view extends JFrame{
	public view()
	{
		this.setTitle("Icon and image example");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
//		Them icon vao title
		URL url = view.class.getResource("happy_icon.png");
		Image image = Toolkit.getDefaultToolkit().createImage(url);
		this.setIconImage(image);
//		Tao menu va thanh menu
		JMenuBar menuBar = new JMenuBar();
		JMenu menu_file = new JMenu("File");
		JMenu menu_help = new JMenu("Help");
		JMenu menu_subFile = new JMenu("Sub file");
		
//		Tao cac menu con
		JMenuItem menuItem_new = new JMenuItem("New");
		menuItem_new.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view.class.getResource("new_icon.png"))));
		JMenuItem menuItem_save = new JMenuItem("Save");
		menuItem_save.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view.class.getResource("save_icon.png"))));
		JMenuItem menuItem_save_as = new JMenuItem("Save as");
		menuItem_save_as.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view.class.getResource("sav_as_icon.png"))));
		JMenuItem menuItem_copy = new JMenuItem("Copy");
		menuItem_copy.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view.class.getResource("copy_icon.png"))));
		JMenuItem menuItem_paste = new JMenuItem("Paste");
		menuItem_paste.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view.class.getResource("paste_icon.png"))));
		JMenuItem menuItem_exit = new JMenuItem("Exit");
		menuItem_exit.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view.class.getResource("exit_icon.png"))));
		
		JMenuItem menuItem_contact = new JMenuItem("Contact");
		menuItem_contact.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(view.class.getResource("contact_icon.png"))));
//		Them cac menu con vao menu
		menu_subFile.add(menuItem_new);
		menu_subFile.add(menuItem_exit);
		menu_file.add(menu_subFile);
		menu_file.add(menuItem_save);
		menu_file.add(menuItem_save_as);
		menu_file.add(menuItem_copy);
		menu_file.add(menuItem_paste);
		
		menu_help.add(menuItem_contact);
//		Them cac menu vao thanh menu
		menuBar.add(menu_file);
		menuBar.add(menu_help);
		
//		Set menubar cho giao dien
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		try {
			new view();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
