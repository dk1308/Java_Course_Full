import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	ArrayList<SinhVien> dssv;

	public DanhSachSinhVien(ArrayList<SinhVien> dssv) {
		this.dssv = dssv;
	}
	public DanhSachSinhVien() {
		this.dssv = new ArrayList<SinhVien>();
	}
	public ArrayList<SinhVien> getDssv() {
		return dssv;
	}
	public void setDssv(ArrayList<SinhVien> dssv) {
		this.dssv = dssv;
	}
	
	
//	------------
	
	public void themSinhVien(SinhVien sv)
	{
		this.dssv.add(sv);
	}
	
	public void inDanhSach()
	{
		for (SinhVien sv : this.dssv) {
			System.out.println(sv);
			System.out.println();
		}
	}
	public boolean checkEmpty()
	{
		return this.dssv.isEmpty();
	}
	public int getSize()
	{
		return this.dssv.size();
	}
	public void emptyDanhSach()
	{
		this.dssv.removeAll(dssv);
	}
	
	public boolean checkExist(SinhVien sv)
	{
		return this.dssv.contains(sv);
	}
	
	
	
	public boolean removeSV(SinhVien sv)
	{
		return this.dssv.remove(sv);
	}
	
	
	
	public void searchSV(String ten)
	{
		int count=0;
		for (SinhVien sv : dssv) {
			if (sv.getHoVaTen().compareTo(ten)==0) {
				System.out.println("Sinh viên được tìm thấy: ");
				System.out.println(sv);
				count++;
			}
		}
		if (count==0) 
			System.out.println("Không có sinh viên nào được tìm thấy");
	}
	
	
//	Important
	public void sortSinhVien()
	{
		Collections.sort(this.dssv ,new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if (o1.getDiem()> o2.getDiem()) 
					return -1;
				else if(o1.getDiem()<o2.getDiem())
					return 1;
				else return 0;
			}
		});
	}
}
