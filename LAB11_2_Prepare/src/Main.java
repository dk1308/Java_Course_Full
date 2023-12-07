
public class Main {
	public static void main(String[] args) {
//		HocVien hv1 = new HocVien(1, "Khoa", "13/08/2003", 7, 8, 9);
//		HocVien hv2 = new HocVien(1, "Hoang", "1/10/2003", 8, 8, 7);
//		HocVien hv3 = new HocVien(1, "Quang", "1/01/2003", 9, 8, 9);
//		HocVien hv4 = new HocVien(1, "Tai", "3/02/2003", 9, 9, 9);
//		System.out.println("dtb 1 "+hv1.averageScore() + " hoc luc "+hv1.classification());
//		System.out.println("dtb 2 "+hv2.averageScore() + " hoc luc "+hv2.classification());
//		System.out.println("dtb 3 "+hv3.averageScore() + " hoc luc "+hv3.classification());
//		System.out.println("dtb 4 "+hv4.averageScore() + " hoc luc "+hv4.classification());
//		
//		hv1.display();
		
		PhanSo ps1 = new PhanSo(15, 10);
		PhanSo ps2 = new PhanSo(4, 16);
		System.out.println(ps1+"+"+ps2+" = "+ps1.add(ps2));
		System.out.println(ps1+"-"+ps2+" = "+ps1.subtract(ps2));
		System.out.println(ps1+"*"+ps2+" = "+ps1.multiply(ps2));
		System.out.println(ps1+"/"+ps2+" = "+ps1.divide(ps2));
 	}
}
