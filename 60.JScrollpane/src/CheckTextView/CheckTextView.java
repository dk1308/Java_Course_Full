package CheckTextView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import CheckTextController.CheckTextListener;
import CheckTextModel.CheckTextModel;

public class CheckTextView extends JFrame{
	CheckTextModel checkTextModel;
	JLabel jLabel_text;
	JTextArea jTextArea_text;
	JLabel jLabel_checkText;
	JTextArea jTextArea_checkText;
	JButton jButton_check;
	JLabel jLabel_result;
	ActionListener checkTextListen;
	public CheckTextView() {
		checkTextModel = new CheckTextModel();
		init();
		this.setVisible(true);
	}
	
	public void init()
	{
		this.setTitle("Check key text!");
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel jPanel_text = new JPanel(new GridLayout(4,1));
		jLabel_text = new JLabel("Văn bản");
		jTextArea_text = new JTextArea();
		
		JScrollPane jScrollPane = new JScrollPane(jTextArea_text,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//		JScrollPane jScrollPane = new JScrollPane(jTextArea_text);
		
		jLabel_checkText = new JLabel("Từ khóa");
		jTextArea_checkText = new JTextArea();
		jPanel_text.add(jLabel_text);
//		jPanel_text.add(jTextArea_text);
		jPanel_text.add(jScrollPane);
		jPanel_text.add(jLabel_checkText);
		jPanel_text.add(jTextArea_checkText);
		
		checkTextListen = new CheckTextListener(this);
		JPanel jPanel_footer = new JPanel(new FlowLayout());
		jButton_check = new JButton("Thống kê");
		jButton_check.setBackground(Color.DARK_GRAY);
		jButton_check.addActionListener(checkTextListen);
		jLabel_result = new JLabel("Kết quả : ");
		jPanel_footer.add(jButton_check);
		jPanel_footer.add(jLabel_result);
		
		JPanel jPanel_content = new JPanel(new BorderLayout());
		jPanel_content.add(jPanel_text, BorderLayout.CENTER);
		jPanel_content.add(jPanel_footer, BorderLayout.SOUTH);
		
		this.add(jPanel_content);
	}
	
	public void search()
	{
		String text = jTextArea_text.getText();
		String checkText = jTextArea_checkText.getText();
		this.checkTextModel.setTextt(text);
		this.checkTextModel.setCheckText(checkText);
		this.checkTextModel.search();
		
		jLabel_result.setText("Kết quả: có "+this.checkTextModel.getNumOfExist()+" từ "+this.checkTextModel.getCheckText());
	}
	public void display_null()
	{
		jLabel_result.setText("Không hợp lệ, vui lòng nhập lại văn bản!");
	}
}
