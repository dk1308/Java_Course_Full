package CheckTextController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CheckTextModel.CheckTextModel;
import CheckTextView.CheckTextView;

public class CheckTextListener implements ActionListener{
	CheckTextView checkTextView;
	CheckTextModel checkTextModel;
	public CheckTextListener(CheckTextView checkTextView) {
		this.checkTextView = checkTextView;
		checkTextModel = new CheckTextModel();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if (src.equals("Thống kê")) {
			if (this.checkTextModel.getTextt()==null || this.checkTextModel.getCheckText()==null) {
				this.checkTextView.display_null();
			}
			else this.checkTextView.search();
		}
	}

}
