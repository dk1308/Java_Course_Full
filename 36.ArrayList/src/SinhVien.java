import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>{
	private String mssv;
	private String hoVaTen;
	private int tuoi;
	private double diem;
	public SinhVien(String mssv, String hoVaTen, int tuoi, double diem) {
		this.mssv = mssv;
		this.hoVaTen = hoVaTen;
		this.tuoi = tuoi;
		this.diem = diem;
	}
	
	public SinhVien(String mssv)
	{
		this.mssv = mssv;
	}
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public double getDiem() {
		return diem;
	}
	public void setDiem(double diem) {
		this.diem = diem;
	}
	@Override
	public String toString() {
		return this.hoVaTen
				+"\nMSSV: "+this.mssv
				+"\nTuổi: "+this.tuoi
				+"\nĐiểm trung bình: "+this.diem;
	}

	@Override
	public int compareTo(SinhVien o) {
		// TODO Auto-generated method stub
		return this.mssv.compareTo(o.mssv);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(mssv, other.mssv);
	}
	
	
	
	
}
