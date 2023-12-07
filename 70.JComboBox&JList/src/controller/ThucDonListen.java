package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;

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
	}
}
