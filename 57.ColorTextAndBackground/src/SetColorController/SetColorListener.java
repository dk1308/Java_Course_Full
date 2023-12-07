package SetColorController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import SetColorView.SetColorView;

public class SetColorListener implements ActionListener {
	SetColorView colorView;
	
	public SetColorListener(SetColorView colorView) {
		this.colorView = colorView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src == "RED TEXT") {
			this.colorView.setRed();
		} else if (src == "BLUE TEXT") {
			this.colorView.setBlue();
		} else if (src == "PINK TEXT") {
			this.colorView.setPink();
		} else if (src == "YELLOW BACKGROUND") {
			this.colorView.setYellow();
		} else if (src == "GREEN BACKGROUND") {
			this.colorView.setGreen();
		} else {
			this.colorView.setOrange();
		}
	}

}
