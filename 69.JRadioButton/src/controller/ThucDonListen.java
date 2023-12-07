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
		String mon_chinh = "";
		Enumeration<AbstractButton> mc = this.view.buttonGroup_monChinh.getElements();
		while (mc.hasMoreElements()) {
			AbstractButton b = mc.nextElement();
			if (b.isSelected()) {
				mon_chinh = b.getText();
			}
		}

		String mon_phu = "";
		for (JCheckBox b : this.view.list_monPhu) {
			if (b.isSelected()) {	
				mon_phu = mon_phu + b.getText() + "; ";
			}
		}

		this.view.thucDonModel.setMon_chinh(mon_chinh);
		this.view.thucDonModel.setMon_phu(mon_phu);
		this.view.thucDonModel.tinhTongTien();
		this.view.thanhToan();
	}
}
