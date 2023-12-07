package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

import controller.CalculatorControl;
import model.CalculatorModel;

public class CalculatorView extends JFrame {
	private CalculatorModel cm;
	private JLabel jlabel_value ;
	private JButton [] jb_num;
	
	public CalculatorView() {
		this.cm = new CalculatorModel();
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("My calculator");

		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ActionListener al_num = new CalculatorControl(this);
		this.jb_num = new JButton[10];
		for (int i = 0; i < this.jb_num.length; i++) {
			this.jb_num[i] = new JButton(i+"");
			this.jb_num[i].addActionListener(al_num);
		}
		
		JPanel jpanel_head = new JPanel();
		this.jlabel_value= new JLabel(this.cm.getFinalValue()+"");
		jpanel_head.add(jlabel_value);
		
		
		
//		JButton jb_0 = new JButton("0");
//		jb_0.addActionListener(al);
//		JButton jb_1 = new JButton("1");
//		jb_1.addActionListener(al);
//		JButton jb_2 = new JButton("2");
//		jb_2.addActionListener(al);
//		JButton jb_3 = new JButton("3");
//		jb_3.addActionListener(al);
//		JButton jb_4 = new JButton("4");
//		jb_4.addActionListener(al);
//		JButton jb_5 = new JButton("5");
//		jb_5.addActionListener(al);
//		JButton jb_6 = new JButton("6");
//		jb_6.addActionListener(al);
//		JButton jb_7 = new JButton("7");
//		jb_7.addActionListener(al);
//		JButton jb_8 = new JButton("8");
//		jb_8.addActionListener(al);
//		JButton jb_9 = new JButton("9");
//		jb_9.addActionListener(al);
		ActionListener al_operation = new CalculatorControl(this);
		JButton jb_cong = new JButton("+");
		jb_cong.addActionListener(al_operation);
		JButton jb_tru = new JButton("-");
		jb_tru.addActionListener(al_operation);
		JButton jb_nhan = new JButton("*");
		jb_nhan.addActionListener(al_operation);
		JButton jb_chia = new JButton("/");
		jb_chia.addActionListener(al_operation);
		JButton jb_bang = new JButton("=");
		jb_bang.addActionListener(al_operation);

		JPanel jpanel_button = new JPanel();
		jpanel_button.setLayout(new GridLayout(5, 3));
		for (int i = 0; i < jb_num.length; i++) {
			jpanel_button.add(this.jb_num[i]);
		}
//		jpanel_button.add(jb_0);
//		jpanel_button.add(jb_1);
//		jpanel_button.add(jb_2);
//		jpanel_button.add(jb_3);
//		jpanel_button.add(jb_4);
//		jpanel_button.add(jb_5);
//		jpanel_button.add(jb_6);
//		jpanel_button.add(jb_7);
//		jpanel_button.add(jb_8);
//		jpanel_button.add(jb_9);
		jpanel_button.add(jb_cong);
		jpanel_button.add(jb_tru);
		jpanel_button.add(jb_nhan);
		jpanel_button.add(jb_chia);
		jpanel_button.add(jb_bang);
		this.setLayout(new BorderLayout());
		this.add(jpanel_head, BorderLayout.NORTH);
		this.add(jpanel_button, BorderLayout.CENTER);
	}

	
	
	public void add()
	{
		this.cm.addValue();
		this.jlabel_value.setText(this.cm.getFinalValue()+"");
	}
	public void minus()
	{
		this.cm.minusValue();
		this.jlabel_value.setText(this.cm.getFinalValue()+"");
	}
	public void multiple()
	{
		this.cm.mulValue();
		this.jlabel_value.setText(this.cm.getFinalValue()+"");
	}
	public void divide()
	{
		this.cm.divValue();
		this.jlabel_value.setText(this.cm.getFinalValue()+"");
	}

	public void setValue1(int val)
	{
		this.cm.setValue1(val);
		this.jlabel_value.setText(this.cm.getValue1()+"");
	}
	
	public void setOpera(String ope)
	{
		this.cm.setOperation(ope);
		this.jlabel_value.setText(this.cm.getValue1()+" "+this.cm.getOperation());
	}
	
	public void setValue2(int val)
	{
		this.cm.setValue2(val);
		this.jlabel_value.setText(this.cm.getValue1()+" "+this.cm.getOperation()+" "+this.cm.getValue2());
	}
	
	public String getOpe()
	{
		return this.cm.getOperation();
	}
}