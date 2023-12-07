package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import controller.MenuExampleController;
import controller.MenuExampleMouseListener;

public class MenuExampleView extends JFrame{
	private JLabel jLabel;
	public JPopupMenu jPopupMenu;
	MenuExampleMouseListener menuExampleMouseListener;
	public MenuExampleView() {
		this.setTitle("Menu Example");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		menuExampleMouseListener = new MenuExampleMouseListener(this);
		this.addMouseListener(menuExampleMouseListener);
		// Tạo controller
		MenuExampleController menuExampleController = new MenuExampleController(this);
		
		// Tạo thanh menu
		JMenuBar jMenuBar = new JMenuBar();
		
		// Tạo 1 menu
		JMenu jMenu_file = new JMenu("File");
		jMenu_file.setMnemonic(KeyEvent.VK_F);
		jMenu_file.setDisplayedMnemonicIndex(0);
		
		// Tạo các menu con
		JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
		jMenuItem_new.addActionListener(menuExampleController);
		jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
	
		JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
		jMenuItem_open.addActionListener(menuExampleController);
		jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		
		JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_X);
		jMenuItem_exit.addActionListener(menuExampleController);
		jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK));
		
		JMenuItem jMenuItem_smile = new JMenuItem("Smile");
		jMenuItem_smile.addActionListener(menuExampleController);
		jMenuItem_smile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.SHIFT_DOWN_MASK));
		
		jMenu_file.add(jMenuItem_new);
		jMenu_file.add(jMenuItem_open);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_exit);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_smile);
		
		JMenu jMenu_help = new JMenu("Help");
		jMenu_help.setMnemonic(KeyEvent.VK_L);
		jMenu_help.setDisplayedMnemonicIndex(0);
		
		JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
		jMenuItem_welcome.addActionListener(menuExampleController);
		jMenu_help.add(jMenuItem_welcome);
		
		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_help);
		
		// Thêm thanh thanh menu vào chương trình
		this.setJMenuBar(jMenuBar);
		
		
		// Tạo thanh công cụ
		JToolBar jToolBar = new JToolBar();
		JButton jButton_undo = new JButton("Undo");
		jButton_undo.setToolTipText("Nhấn nút này để hoàn tác.");
		jButton_undo.addActionListener(menuExampleController);
		JButton jButton_copy = new JButton("Copy");
		jButton_copy.setToolTipText("Nhấn nút này để sao chép.");
		jButton_copy.addActionListener(menuExampleController);
		JButton jButton_paste = new JButton("Paste");
		jButton_paste.setToolTipText("Nhấn nút này để paste.");
		jButton_paste.addActionListener(menuExampleController);
		jToolBar.add(jButton_undo);
		jToolBar.add(jButton_copy);
		jToolBar.add(jButton_paste);
//		Tạo thanh công cụ chuột phải
			jPopupMenu = new JPopupMenu();
			JMenu jMenu_file2 = new JMenu("File");
			JMenuItem jMenuItem_new2 = new JMenuItem("New");
			jMenuItem_new2.addActionListener(menuExampleController);
			JMenuItem jMenuItem_exit2 = new JMenuItem("Exit");
			jMenuItem_exit2.addActionListener(menuExampleController);
			jMenu_file2.add(jMenuItem_new2);
			jMenu_file2.add(jMenuItem_exit2);
			JMenuItem jMenuItem_copy = new JMenuItem("Copy");
			jMenuItem_copy.addActionListener(menuExampleController);
			JMenuItem jMenuItem_paste = new JMenuItem("Paste");
			jMenuItem_paste.addActionListener(menuExampleController);
			this.jPopupMenu.add(jMenu_file2);
			this.jPopupMenu.addSeparator();
			this.jPopupMenu.add(jMenuItem_copy);
			this.jPopupMenu.add(jMenuItem_paste);
			
		// Tạo label hiển thị
		Font font = new Font("Arial", Font.BOLD, 50);
		jLabel = new JLabel();
		
		this.add(jToolBar, BorderLayout.NORTH);
		this.add(jPopupMenu);
		this.add(jLabel, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
	public void setTextJLabel(String s) {
		this.jLabel.setText(s);
	}
}
