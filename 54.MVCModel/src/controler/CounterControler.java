package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView;

public class CounterControler implements ActionListener{
	private CounterView ctv;
	
	public CounterControler(CounterView ctv) {
		this.ctv = ctv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if (src.equals("UP")) 
			this.ctv.increase();
		else if (src.equals("DOWN")) 
			this.ctv.decrease();
		else this.ctv.reset();
		
//		System.out.println("Bạn đã nhấn nút "+src);
	}

}
