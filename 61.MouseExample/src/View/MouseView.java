package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.JFrame;

import Controller.MouseExampleListener;
import Model.MouseModel;

public class MouseView extends JFrame{
	MouseModel model;
	Label label_mouse_display;
	Label label_position;
	Label label_value_x;
	Label label_value_y;
	Label label_num_of_click;
	Label label_click_value;
	Label label_null1;
	Label label_null2;
	Label label_entered;
	Label label_entered_value;
	MouseExampleListener mouseExampleListener;
	
	public MouseView()
	{
		this.model = new MouseModel();
		this.init();
		this.setVisible(true);
	}
	private void init() {
		this.setTitle("Mouse example!");
		this.setSize(getPreferredSize());
		this.setSize(300,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		mouseExampleListener = new MouseExampleListener(this);
		label_mouse_display = new Label();
		label_mouse_display.setBackground(Color.LIGHT_GRAY);
		label_mouse_display.addMouseListener(mouseExampleListener);
		label_mouse_display.addMouseMotionListener(mouseExampleListener);
		
		Panel panel_footer = new Panel(new GridLayout(3,3));
		label_position = new Label("Position: ");
		label_position.setBackground(Color.CYAN);
		label_value_x = new Label("x = ");
		label_value_y = new Label("y = ");
		label_num_of_click = new Label("Number of clicks: ");
		label_num_of_click.setBackground(Color.CYAN);
		label_click_value = new Label();
		label_null1 = new Label();
		label_null2 = new Label();
		label_entered = new Label("Mouse is in component: ");
		label_entered.setBackground(Color.CYAN);
		label_entered_value = new Label("no");
		panel_footer.add(label_position);
		panel_footer.add(label_value_x);
		panel_footer.add(label_value_y);
		panel_footer.add(label_num_of_click);
		panel_footer.add(label_click_value);
		panel_footer.add(label_null1);
		panel_footer.add(label_entered);
		panel_footer.add(label_entered_value);
		panel_footer.add(label_null2);
		this.setLayout(new BorderLayout());
		this.add(label_mouse_display, BorderLayout.CENTER);
		this.add(panel_footer, BorderLayout.SOUTH);
	}
	
	public void setMouseLocation(int x, int y)
	{
		this.model.setX(x);
		this.model.setY(y);
		this.label_value_x.setText(this.model.getX()+"");
		this.label_value_y.setText(this.model.getY()+"");
	}
	
	public void addClick()
	{
		this.model.addClick();
		this.label_click_value.setText(this.model.getNumOfClick()+"");
	}
	
	public void isEntered()
	{
		this.model.setIsEntered("yes");
		this.label_entered_value.setText(this.model.getIsEntered());
	}
	
	public void isExit()
	{
		this.model.setIsEntered("no");
		this.label_entered_value.setText(this.model.getIsEntered());
	}
	
}
