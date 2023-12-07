package CalculatorListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CalculatorView.CalculatorView;

public class CalculatorListener implements ActionListener{
	CalculatorView calView;
	public CalculatorListener(CalculatorView calView)
	{
		this.calView = calView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if (src == "+") {
			this.calView.cong();
		} else if (src == "-") {
			this.calView.tru();
		} else if (src == "*") {
			this.calView.nhan();
		} else if (src == "/") {
			this.calView.chia();
		} else if (src == "^") {
			this.calView.mu();
		} else this.calView.mod();
	}

}
