package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import controller.ThucDonListen;
import model.ThucDonModel;

public class ThucDonView extends JFrame{
	public ThucDonModel thucDonModel;
	public JRadioButton jb_pho;
	public JRadioButton jb_com;
	public JRadioButton jb_bun;
	public JRadioButton jb_mi;
	public JCheckBox jcb_tra_sua;
	public JCheckBox jcb_kem;
	public JCheckBox jcb_nuoc_ngot;
	public JCheckBox jcb_tra_tac;
	public JButton jButton_thanh_toan;
	public JLabel jLabel_ket_qua;
	public ButtonGroup buttonGroup_monChinh;
	public ArrayList<JCheckBox> list_monPhu;
	public JComboBox<String> jComboBox_monChinh;
	public JList<String> jList_monPhu;
	private JPanel jPanel_thanh_toan;
	
	public ThucDonView() {
		thucDonModel = new ThucDonModel();
		showWindow();
	}
	
	
	public void showWindow()
	{
		this.setTitle("My menu");
		this.setSize(600,600);
//		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ActionListener al = new ThucDonListen(this);
		
//		Tạo font chữ
		Font font_header = new Font("Arial", Font.BOLD, 40);
		Font font_mon_an = new Font("Arial", Font.ITALIC, 20);
		
//		Tạo panel tiêu đề
		JLabel jLabel_header = new JLabel("Menu of Khoa's house");
		jLabel_header.setFont(font_header);
		JPanel jPanel_header = new JPanel();
		jPanel_header.add(jLabel_header);
		
//		Tạo panel món chính
		String[] str_monChinh = new String[] {"PHỞ","CƠM","BÚN","MÌ"};
		jComboBox_monChinh = new JComboBox<String>(str_monChinh);
		
		JPanel jPanel_monChinh = new JPanel();
		jPanel_monChinh.setLayout(new FlowLayout());
		jPanel_monChinh.add(jComboBox_monChinh);
		
//		Tạo panel món phụ
		String[] str_monPhu = new String[] {"TRÀ SỮA","NƯỚC NGỌT","TRÀ TẮC","KEM"};
		jList_monPhu = new JList<String>(str_monPhu);
		JPanel jPanel_monPhu = new JPanel();
		jPanel_monPhu.add(jList_monPhu);
		
		
//		Tạo button thanh toán và hiển thị kết quả
		jButton_thanh_toan = new JButton("THANH TOÁN");
		jButton_thanh_toan.setBackground(Color.BLUE);
		jButton_thanh_toan.addActionListener(al);
		jLabel_ket_qua = new JLabel();
		jLabel_ket_qua.setFont(new Font("Arial", Font.BOLD,20));
		jPanel_thanh_toan = new JPanel();
		jPanel_thanh_toan.setLayout(new BorderLayout());
		jPanel_thanh_toan.add(jButton_thanh_toan, BorderLayout.EAST);
		jPanel_thanh_toan.add(jLabel_ket_qua, BorderLayout.WEST);
//		Thêm vào giao diện chính
		JPanel jPanel_mon_an = new JPanel();
		jPanel_mon_an.setLayout(new BorderLayout());
		jPanel_mon_an.add(jPanel_monChinh, BorderLayout.NORTH);
		jPanel_mon_an.add(jPanel_monPhu, BorderLayout.CENTER);
		
		this.add(jPanel_header, BorderLayout.NORTH);
		this.add(jPanel_mon_an, BorderLayout.CENTER);
		this.add(jPanel_thanh_toan, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}

//	Tạo hàm lấy giá mỗi món
	
	
//	Tạo hàm hiển thị giá
	public void thanhToan()
	{
		String ket_qua = "Món chính: "+this.thucDonModel.getMon_chinh()
						+"; Món phụ: "+this.thucDonModel.getMon_phu()
						+"\nTổng tiền: "+this.thucDonModel.getTong_tien();
		this.jLabel_ket_qua.setText(ket_qua);
	}
	
}