package model;

import java.util.Enumeration;
import java.util.StringTokenizer;

import javax.swing.AbstractButton;

import view.ThucDonView;

public class ThucDonModel {
	private String mon_chinh;
	private String mon_phu;
	private double tong_tien;
	public ThucDonModel() {
		this.mon_chinh = "";
		this.mon_phu = "";
		this.tong_tien = 0;
	}
	public String getMon_chinh() {
		return mon_chinh;
	}
	public void setMon_chinh(String mon_chinh) {
		this.mon_chinh = mon_chinh;
	}
	public String getMon_phu() {
		return mon_phu;
	}
	public void setMon_phu(String mon_phu) {
		this.mon_phu = mon_phu;
	}
	public double getTong_tien() {
		return tong_tien;
	}
	public void setTong_tien(double tong_tien) {
		this.tong_tien = tong_tien;
	}
	
	public void tinhTongTien()
	{
		if (this.mon_chinh.equals("PHỞ")) {
			this.tong_tien+= 50000;
		} else if (this.mon_chinh.equals("BÚN")) {
			this.tong_tien+= 40000;
		} else if (this.mon_chinh.equals("CƠM")) {
			this.tong_tien+= 30000;
		} else if (this.mon_chinh.equals("MÌ")){
			this.tong_tien+= 20000;
		}
		
		StringTokenizer stk = new StringTokenizer(this.mon_phu, ";");
		while (stk.hasMoreElements()) {
			String str_mon_phu= stk.nextToken();
			str_mon_phu = str_mon_phu.trim();
			if (str_mon_phu.equals("TRÀ SỮA")) {
				this.tong_tien+= 20000;
			} else if (str_mon_phu.equals("NƯỚC NGỌT")) {
				this.tong_tien+= 10000;
			} else if (str_mon_phu.equals("TRÀ TẮC")) {
				this.tong_tien+= 15000;
			} else if (str_mon_phu.equals("KEM")){
				this.tong_tien+= 20000;
			}
		}
	}
	
}
