import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuongTest {
	private Set<String> rt = new HashSet<String>();

	public RutThamTrungThuongTest(Set<String> sr) {
		this.rt = rt;
	}
	public RutThamTrungThuongTest() {
		
	}
	
	public void themMaSo(String s)
	{
		this.rt.add(s);
	}
	
	public void xoaMaSo(String s)
	{
		this.rt.remove(s);
	}
	
	public boolean kiemTraMaSo(String s)
	{
		return this.rt.contains(s);
	}
	
	public void xoaTatCa()
	{
		rt.clear();
	}
	public int soLuongPhieu()
	{
		return rt.size();
	}
	public String rutTham()
	{
		Random rd = new Random();
		int idx = rd.nextInt(rt.size());
		String kq = (String)rt.toArray()[idx];
		return kq;
	}
	public void inTatCa()
	{
		System.out.println(Arrays.toString(rt.toArray()));
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RutThamTrungThuongTest rt = new RutThamTrungThuongTest();
		int choice =0;
		String mp;
		
		
		do {
			System.out.println("--------------------------------------");
			System.out.println("MENU: ");
			System.out.println("1. Thêm mã số dự thưởng.");
			System.out.println("2. Xóa mã số dự thưởng.");
			System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
			System.out.println("4. Xóa tất cả các phiếu dự thưởng.");
			System.out.println("5. Số lượng phiếu dự thưởng.");
			System.out.println("6. Rút thăm trúng thưởng.");
			System.out.println("7. In ra tất cả các phiếu.");
			System.out.println("0. Thoát khỏi chương trình");
			System.out.println("Nhập lựa chọn: ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Thêm mã số dự thưởng.");
				System.out.println("Nhập 1 mã phiếu: ");
				mp = sc.nextLine();
				rt.themMaSo(mp);
				break;
			case 2:
				System.out.println("Xóa mã số dự thưởng.");
				System.out.println("Nhập 1 mã phiếu: ");
				mp = sc.nextLine();
				rt.xoaMaSo(mp);
				break;
			case 3:
				System.out.println("Kiểm tra mã số dự thưởng có tồn tại hay không.");
				System.out.println("Nhập 1 mã phiếu: ");
				mp = sc.nextLine();
				System.out.println("Kiểm tra mã: "+mp+" "+rt.kiemTraMaSo(mp)); 
				break;
			case 4:
				System.out.println("Xóa tất cả các phiếu dự thưởng.");
				rt.xoaTatCa();
				break;
			case 5:
				System.out.println("Số lượng phiếu dự thưởng.");
				System.out.println("Số lượng phiếu: "+rt.soLuongPhieu());
				break;
			case 6:
				System.out.println("Rút thăm trúng thưởng.");
				System.out.println("Mã số trúng thưởng: "+rt.rutTham());
				break;
			case 7:
				System.out.println("In ra tất cả các phiếu.");
				rt.inTatCa();
				break;
			default:
				break;
			}
		} while (choice!=0);
		
		
		
	}
	
	
}
