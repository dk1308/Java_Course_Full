
public class Main {
	public static void main(String[] args) {
		HocVien hv1 = new HocVien(1, "Khoa", "13/08/2003", 8, 9, 5);
		HocVien hv2 = new HocVien(2, "Quang", "01/08/2003", 8, 9, 9);
		System.out.println("hv1 -> "+hv1.average()+"\n"+hv1.classification()+"\n"+hv1);
		System.out.println("hv2 -> "+hv2.average()+"\n"+hv2.classification()+"\n"+hv2);
		
		System.out.println("\n*************\n");
		
		PhanSo ps1 = new PhanSo(5, 15);
		PhanSo ps2 = new PhanSo(16, 56);
		System.out.println("ps1: "+ps1);
		System.out.println("ps2: "+ps2);
		System.out.println("ps1+ps2: "+ps1.add(ps2));
		System.out.println("ps1-ps2: "+ps1.subtract(ps2));
		System.out.println("ps1*ps2: "+ps1.multiply(ps2));
		System.out.println("ps1/ps2: "+ps1.divide(ps2));
		System.out.println("ps1 compare to ps2: "+ps1.compareto(ps2));
	}
}
