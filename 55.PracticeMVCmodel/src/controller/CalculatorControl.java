package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;

import model.CalculatorModel;
import view.CalculatorView;

public class CalculatorControl implements ActionListener{
	private CalculatorView cv;
	public CalculatorControl(CalculatorView cv) {
		// TODO Auto-generated constructor stub
		this.cv = cv;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src1 = e.getActionCommand();
		
		
			for (int j = 0; j < 10; j++) {
				if (src1.equals(j+"")) {
					this.cv.setValue1(j);
					break;
				} 
			}
		String src2 = e.getActionCommand();
			setOpe(e);
			
			for (int j = 0; j < 10; j++) {
				if (src2.equals(j+"")) {
					this.cv.setValue2(j);
					break;
				}
			}
			
			excuteOpe(e);
			
			
		
	}
	public void setOpe(ActionEvent e)
	{
		String src = e.getActionCommand();
		if (src.equals("+")) {
			this.cv.setOpera(src);
		}else if (src.equals("-")) {
			this.cv.setOpera(src);
		}else if (src.equals("*")) {
			this.cv.setOpera(src);
		}else if (src.equals("/")) {
			this.cv.setOpera(src);
		}
	}
	public void excuteOpe(ActionEvent e)
	{
		String src = e.getActionCommand();
		if (src.equals("+")) {
			this.cv.add();
		}else if (src.equals("-")) {
			this.cv.minus();
		}else if (src.equals("*")) {
			this.cv.multiple();
		}else if (src.equals("/")) {
			this.cv.divide();
		}
	}
}
