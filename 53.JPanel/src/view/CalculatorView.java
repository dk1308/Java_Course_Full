package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

public class CalculatorView extends JFrame {
	public CalculatorView() {
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("My calculator");

		this.setSize(300, 300);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel jpanel_head = new JPanel();
		JTextField jtext = new JTextField(50);
		jpanel_head.add(jtext, BorderLayout.CENTER);

		JButton jb_0 = new JButton("0");
		JButton jb_1 = new JButton("1");
		JButton jb_2 = new JButton("2");
		JButton jb_3 = new JButton("3");
		JButton jb_4 = new JButton("4");
		JButton jb_5 = new JButton("5");
		JButton jb_6 = new JButton("6");
		JButton jb_7 = new JButton("7");
		JButton jb_8 = new JButton("8");
		JButton jb_9 = new JButton("9");
		JButton jb_cong = new JButton("+");
		JButton jb_tru = new JButton("-");
		JButton jb_nhan = new JButton("*");
		JButton jb_chia = new JButton("/");
		JButton jb_bang = new JButton("=");

		JPanel jpanel_button = new JPanel();
		jpanel_button.setLayout(new GridLayout(5, 3));
		jpanel_button.add(jb_0);
		jpanel_button.add(jb_1);
		jpanel_button.add(jb_2);
		jpanel_button.add(jb_3);
		jpanel_button.add(jb_4);
		jpanel_button.add(jb_5);
		jpanel_button.add(jb_6);
		jpanel_button.add(jb_7);
		jpanel_button.add(jb_8);
		jpanel_button.add(jb_9);
		jpanel_button.add(jb_cong);
		jpanel_button.add(jb_tru);
		jpanel_button.add(jb_nhan);
		jpanel_button.add(jb_chia);
		jpanel_button.add(jb_bang);
		this.setLayout(new BorderLayout());
		this.add(jpanel_head, BorderLayout.NORTH);
		this.add(jpanel_button, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		CalculatorView cv = new CalculatorView();
	}
}