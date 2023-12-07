import java.util.Scanner;

public class SinhVien {
	private String ten;
	private String maSV;
	private NgaySinh ngaySinh;
	private double diem;
	public SinhVien(String ten, String maSV, NgaySinh ngaySinh, double diem) {
		this.ten = ten;
		this.maSV = maSV;
		this.ngaySinh = ngaySinh;
		this.diem = diem;
	}
	
	public SinhVien() {
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Sinh vien ten: ");
		this.ten = sc.nextLine();
		System.out.println("Diem: ");
		this.diem = sc.nextDouble();
		if(this.diem <0 || this.diem>10)
		{
			do {
				System.out.println("Khong hop le. Nhap lai diem: ");
				this.diem = sc.nextDouble();
			}
			while(this.diem <0 || this.diem>10);
			
		}
	}
	
	

	public String xepLoai()
	{
		if(this.diem>=8)
			return "Gioi";
		else if(this.diem>=6.5)
			return "Kha";
		else if(this.diem>=5)
			return "Trung Binh";
		else return "Yeu";
	}
	
	public void xuat()
	{
		System.out.println("Sinh vien ten: "+this.ten);
		System.out.println("Hoc luc: "+xepLoai());
	}
}
