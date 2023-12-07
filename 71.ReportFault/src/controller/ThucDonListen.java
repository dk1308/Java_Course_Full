package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

import model.ThucDonModel;
import view.ThucDonView;

public class ThucDonListen implements ActionListener {

	ThucDonView view;

	public ThucDonListen(ThucDonView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.view.thucDonModel.setTong_tien(0);
		String mon_chinh = this.view.jComboBox_monChinh.getSelectedItem().toString(); 	

		String mon_phu = "";
		Object[] lisObjects_monPhu = this.view.jList_monPhu.getSelectedValues();
		for (Object o : lisObjects_monPhu) {
				mon_phu = mon_phu + o.toString()+ "; ";
			
		}

		this.view.thucDonModel.setMon_chinh(mon_chinh);
		this.view.thucDonModel.setMon_phu(mon_phu);
		this.view.thucDonModel.tinhTongTien();
		this.view.thanhToan();
		
		
		try {
			double double_tinhTien;
			do {
				String tinhTien = JOptionPane.showInputDialog(this.view, this.view.jLabel_ket_qua.getText() + "\nSố tiền khách đưa: " 
						, "Tính tiền", JOptionPane.PLAIN_MESSAGE );
				double_tinhTien = Double.valueOf(tinhTien);
			} while (this.view.thucDonModel.getTong_tien()> double_tinhTien);
			JOptionPane.showMessageDialog(this.view, "Tiền thừa: "+(double_tinhTien - this.view.thucDonModel.getTong_tien()), "Tiền thừa:",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this.view, "Nhập dữ liệu sai!", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}
