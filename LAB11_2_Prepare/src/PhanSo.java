
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
		int mauSoChung = mauSoChung(this, o);
		int tuSoThis = this.tuSo*(mauSoChung/mauSo);
		int tuSoO = o.getTuSo()*(mauSoChung/o.getMauSo());
		PhanSo result = new PhanSo(tuSoThis+tuSoO, mauSoChung);
		return result;
	}
	
	public PhanSo subtract(PhanSo o) {
		int mauSoChung = mauSoChung(this, o);
		int tuSoThis = this.tuSo*(mauSoChung/mauSo);
		int tuSoO = o.getTuSo()*(mauSoChung/o.getMauSo());
		PhanSo result = new PhanSo(tuSoThis-tuSoO, mauSoChung);
		return result;
	}
	
	public PhanSo multiply(PhanSo o) {
		int tichTuSo = this.tuSo * o.getTuSo();
		int tichMauSo = this.mauSo * o.getMauSo();
		PhanSo result = new PhanSo(tichTuSo, tichMauSo);
		return result;
	}
	
	public PhanSo divide(PhanSo o) {
		int tichTuSo = this.tuSo * o.getMauSo();
		int tichMauSo = this.mauSo * o.getTuSo();
		PhanSo result = new PhanSo(tichTuSo, tichMauSo);
		return result;
	}
	
	public int mauSoChung(PhanSo t, PhanSo o) {
		int mauSoChung = boiChungNhoNhat(t.getMauSo(), o.getMauSo());
		return mauSoChung;
	}
	
	public int uocChungLonNhat(int a, int b) {
		if (a==b) return a;
		else if(a>b) return uocChungLonNhat(a-b, b);
		else return uocChungLonNhat(a, b-a);
	}
	
	public int boiChungNhoNhat (int a, int b) {
		return (a*b)/uocChungLonNhat(a, b);
	}
	@Override
	public String toString() {
		return tuSo + "/" + mauSo;
	}
	
	
}
