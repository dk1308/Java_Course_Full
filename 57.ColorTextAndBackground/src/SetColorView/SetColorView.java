package SetColorView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import SetColorController.SetColorListener;
import SetColorModel.SetColorModel;

public class SetColorView extends JFrame{
	SetColorModel colorModel;
	JLabel jLabel_text;
	JButton jButton_text_red;
	JButton jButton_text_blue;
	JButton jButton_text_pink;
	JButton jButton_background_green;
	JButton jButton_background_yellow;
	JButton jButton_background_orange;
	ActionListener colorListen;
	
	public SetColorView()
	{
		colorModel = new SetColorModel();
		init();
		this.setVisible(true);
	}
	private void init() {
		this.setTitle("Set Color");
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jLabel_text = new JLabel("Xin chào các bạn!", JLabel.CENTER);
		Font font_text = new Font("Arial", Font.BOLD, 40);
		jLabel_text.setFont(font_text);
		
		colorListen = new SetColorListener(this);
		Font font_color = new Font("Arial", Font.ITALIC, 20);
		jButton_text_red = new JButton("RED TEXT");
		jButton_text_red.setFont(font_color);
		jButton_text_red.setForeground(Color.RED);
		jButton_text_red.addActionListener(colorListen);
		
		jButton_text_blue = new JButton("BLUE TEXT");
		jButton_text_blue.setFont(font_color);
		jButton_text_blue.setForeground(Color.BLUE);
		jButton_text_blue.addActionListener(colorListen);
		
		jButton_text_pink = new JButton("PINK TEXT");
		jButton_text_pink.setFont(font_color);
		jButton_text_pink.setForeground(Color.PINK);
		jButton_text_pink.addActionListener(colorListen);
		
		jButton_background_green = new JButton("GREEN BACKGROUND");
		jButton_background_green.setFont(font_color);
		jButton_background_green.setBackground(Color.GREEN);
		jButton_background_green.addActionListener(colorListen);
		jButton_background_green.setOpaque(true);
		
		
		jButton_background_yellow = new JButton("YELLOW BACKGROUND");
		jButton_background_yellow.setFont(font_color);
		jButton_background_yellow.setBackground(Color.YELLOW);
		jButton_background_yellow.addActionListener(colorListen);
		jButton_background_yellow.setOpaque(true);
		
		jButton_background_orange = new JButton("ORANGE BACKGROUND");
		jButton_background_orange.setFont(font_color);
		jButton_background_orange.setBackground(Color.ORANGE);
		jButton_background_orange.addActionListener(colorListen);
		jButton_background_orange.setOpaque(true);
		
		JPanel jPanel_color = new JPanel(new GridLayout(2,3));
		jPanel_color.add(jButton_text_red);
		jPanel_color.add(jButton_text_blue);
		jPanel_color.add(jButton_text_pink);
		jPanel_color.add(jButton_background_green);
		jPanel_color.add(jButton_background_yellow);
		jPanel_color.add(jButton_background_orange);
		
		JPanel jPanel_content = new JPanel(new BorderLayout());
		jPanel_content.add(jLabel_text, BorderLayout.CENTER);
		jPanel_content.add(jPanel_color, BorderLayout.SOUTH);
		
		this.add(jPanel_content);
	}
	
	public void setRed()
	{
		this.jLabel_text.setForeground(Color.RED);
		
	}
	
	public void setBlue()
	{
		this.jLabel_text.setForeground(Color.BLUE);
	}
	
	public void setPink()
	{
		this.jLabel_text.setForeground(Color.PINK);
	}
	
	public void setGreen()
	{
		this.jLabel_text.setBackground(Color.GREEN);
		this.jLabel_text.setOpaque(true);
	}
	
	public void setYellow()
	{
		this.jLabel_text.setBackground(Color.YELLOW);
		this.jLabel_text.setOpaque(true);
	}
	
	public void setOrange()
	{
		this.jLabel_text.setBackground(Color.ORANGE);
		this.jLabel_text.setOpaque(true);
	}
}
