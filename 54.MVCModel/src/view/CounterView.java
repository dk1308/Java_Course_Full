package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.nio.ByteOrder;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controler.CounterControler;
import model.CounterModel;

public class CounterView extends JFrame {
	private CounterModel cm;
	private JButton jButton_up;
	private JButton jButton_down;
	private JButton jButton_reset;
	private JLabel jLabel_value;

	public CounterView() {
		this.cm = new CounterModel();
		this.init();
		this.setVisible(true);
	}


	public void init() {
		this.setTitle("My counter");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ActionListener cc = new CounterControler(this);
		jButton_up = new JButton("UP");
		jButton_up.addActionListener(cc);
		jButton_down = new JButton("DOWN");
		jButton_down.addActionListener(cc);
		jButton_reset = new JButton("RESET");
		jButton_reset.addActionListener(cc);
		jLabel_value = new JLabel(this.cm.getValue() + "", JLabel.CENTER);
		JPanel jPanel_content = new JPanel(new BorderLayout());
		jPanel_content.add(jButton_up, BorderLayout.WEST);
		jPanel_content.add(jLabel_value, BorderLayout.CENTER);
		jPanel_content.add(jButton_down, BorderLayout.EAST);
		jPanel_content.add(jButton_reset, BorderLayout.SOUTH);

		this.setLayout(new BorderLayout());
		this.add(jPanel_content);
		this.setTitle("My counter");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void increase() {
		this.cm.increase();
		this.jLabel_value.setText(this.cm.getValue() + "");
	}

	public void decrease() {
		this.cm.decrease();
		this.jLabel_value.setText(this.cm.getValue() + "");
	}

	public void reset() {
		this.cm.reset();
		this.jLabel_value.setText(this.cm.getValue() + "");
	}
}
