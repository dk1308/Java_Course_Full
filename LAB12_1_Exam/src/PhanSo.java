
public class PhanSo {
	int tuSo;
	int mauSo;
	
	public PhanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo/uocChungLonNhat(tuSo, mauSo);
		this.mauSo = mauSo/uocChungLonNhat(tuSo, mauSo);
	}

	public int getTuSo() {
		return tuSo;
	}

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public int getMauSo() {
		return mauSo;
	}

	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}
	
	public PhanSo add(PhanSo o) {
		int mauSoChung = this.mauSoChung(o.getMauSo());
		int tuSoT = this.tuSo*(mauSoChung/this.mauSo);
		int tuSoO = o.getTuSo()*(mauSoChung/o.getMauSo());
		return new PhanSo(tuSoT+tuSoO, mauSoChung);
	}
	
	public PhanSo subtract(PhanSo o) {
		int mauSoChung = this.mauSoChung(o.getMauSo());
		int tuSoT = this.tuSo*(mauSoChung/this.mauSo);
		int tuSoO = o.getTuSo()*(mauSoChung/o.getMauSo());
		return new PhanSo(tuSoT-tuSoO, mauSoChung);
	}
	
	public PhanSo multiply(PhanSo o) {
		return new PhanSo(this.tuSo*o.getTuSo(), this.mauSo*o.getMauSo());
	}
	
	public PhanSo divide(PhanSo o) {
		return new PhanSo(this.tuSo*o.getMauSo(), this.mauSo*o.getTuSo());
	}
	
	public int compareto(PhanSo o) {
		float ketquaT = (float)this.tuSo/this.mauSo;
		float ketquaO = (float)o.getTuSo()/o.getMauSo();
		if (ketquaT>ketquaO) return 1;
		else if (ketquaT<ketquaO) return -1;
		else return 0;	
	}
	
	@Override
	public String toString() {
		return tuSo + "/" + mauSo;
	}
	
	public int uocChungLonNhat(int a, int b) {
		if (a==b) return a;
		else if (a>b) return uocChungLonNhat(a-b, b);	
		else return uocChungLonNhat(a, b-a);	
	}
	
	public int boiChungNhoNhat(int a, int b) {
		return (a*b)/uocChungLonNhat(a, b);
	}
	
	public int mauSoChung(int mauSoO) {
		return boiChungNhoNhat(this.mauSo, mauSoO);
	}
}
