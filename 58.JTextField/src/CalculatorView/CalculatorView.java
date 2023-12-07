package CalculatorView;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import CalculatorListener.CalculatorListener;
import CalculatorModel.CalculatorModel;

public class CalculatorView extends JFrame{
	CalculatorModel calModel;
	JLabel jLabel_val1;
	JLabel jLabel_val2;
	JLabel jLabel_answer;
	JTextField jtext_val1;
	JTextField jtext_val2;
	JTextField jtext_answer;
	JButton jb_cong;
	JButton jb_tru;
	JButton jb_nhan;
	JButton jb_chia;
	JButton jb_mu;
	JButton jb_mod;
	ActionListener calListener;
	
	public CalculatorView()
	{
		
		init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("My calculator");
		this.setSize(200,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		calModel = new CalculatorModel();
		JPanel jPanelIO = new JPanel(new GridLayout(3,2));
		Font font_text = new Font("Arial", Font.BOLD, 20);
		jLabel_val1 = new JLabel("1st value: ");
		jLabel_val1.setFont(font_text);
		jtext_val1 = new JTextField();
		jtext_val1.setFont(font_text);
		jLabel_val2 = new JLabel("2nd value: ");
		jLabel_val2.setFont(font_text);
		jtext_val2 = new JTextField();
		jtext_val2.setFont(font_text);
		jLabel_answer = new JLabel("Answer: ");
		jLabel_answer.setFont(font_text);
		jtext_answer = new JTextField();
		jtext_answer.setFont(font_text);
		jPanelIO.add(jLabel_val1);
		jPanelIO.add(jtext_val1);
		jPanelIO.add(jLabel_val2);
		jPanelIO.add(jtext_val2);
		jPanelIO.add(jLabel_answer);
		jPanelIO.add(jtext_answer);
		
		
		JPanel jPanel_button = new JPanel(new GridLayout(2,3));
		Font font_button = new Font("Arial", Font.BOLD, 10);
		calListener = new CalculatorListener(this);
		jb_cong = new JButton("+");
		jb_cong.setFont(font_button);
		jb_cong.addActionListener(calListener);
		jb_tru = new JButton("-");
		jb_tru.setFont(font_button);
		jb_tru.addActionListener(calListener);
		jb_nhan = new JButton("*");
		jb_nhan.setFont(font_button);
		jb_nhan.addActionListener(calListener);
		jb_chia = new JButton("/");
		jb_chia.setFont(font_button);
		jb_chia.addActionListener(calListener);
		jb_mu = new JButton("^");
		jb_mu.setFont(font_button);
		jb_mu.addActionListener(calListener);
		jb_mod = new JButton("MOD");
		jb_mod.setFont(font_button);
		jb_mod.addActionListener(calListener);
		
		jPanel_button.add(jb_cong);
		jPanel_button.add(jb_tru);
		jPanel_button.add(jb_nhan);
		jPanel_button.add(jb_chia);
		jPanel_button.add(jb_mu);
		jPanel_button.add(jb_mod);
		
		
		JPanel jPanel_content = new JPanel(new BorderLayout());
		jPanel_content.add(jPanelIO, BorderLayout.CENTER);
		jPanel_content.add(jPanel_button, BorderLayout.SOUTH);
		
		this.add(jPanel_content);
	}
	
	public void cong()
	{	
		double value1 = Double.valueOf(jtext_val1.getText());
		double value2 = Double.valueOf(jtext_val2.getText());
		this.calModel.setValue_1(value1);
		this.calModel.setValue_2(value2);
		this.calModel.cong();
		this.display_answer();
	}
	public void tru()
	{	
		double value1 = Double.valueOf(jtext_val1.getText());
		double value2 = Double.valueOf(jtext_val2.getText());
		this.calModel.setValue_1(value1);
		this.calModel.setValue_2(value2);
		this.calModel.tru();
		this.display_answer();
	}
	public void nhan()
	{	
		double value1 = Double.valueOf(jtext_val1.getText());
		double value2 = Double.valueOf(jtext_val2.getText());
		this.calModel.setValue_1(value1);
		this.calModel.setValue_2(value2);
		this.calModel.nhan();
		this.display_answer();
	}
	public void chia()
	{	
		double value1 = Double.valueOf(jtext_val1.getText());
		double value2 = Double.valueOf(jtext_val2.getText());
		this.calModel.setValue_1(value1);
		this.calModel.setValue_2(value2);
		this.calModel.chia();
		this.display_answer();
	}
	public void mu()
	{	
		double value1 = Double.valueOf(jtext_val1.getText());
		double value2 = Double.valueOf(jtext_val2.getText());
		this.calModel.setValue_1(value1);
		this.calModel.setValue_2(value2);
		this.calModel.mu();
		this.display_answer();
	}
	public void mod()
	{	
		double value1 = Double.valueOf(jtext_val1.getText());
		double value2 = Double.valueOf(jtext_val2.getText());
		this.calModel.setValue_1(value1);
		this.calModel.setValue_2(value2);
		this.calModel.mod();
		this.display_answer();
	}
	
	public void display_answer()
	{
		int check = (int)this.calModel.getAnswer();
		if (check == this.calModel.getAnswer()) {
			this.jtext_answer.setText((int)this.calModel.getAnswer()+"");
		} else this.jtext_answer.setText(this.calModel.getAnswer()+"");
	}
}
