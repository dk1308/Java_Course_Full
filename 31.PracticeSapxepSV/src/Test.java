import java.util.Arrays;


public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("Đăng Khoa", 19, "SE17B02", 9);
		SinhVien sv2 = new SinhVien("Hoàng Như", 19, "47K123", 9.5);
		SinhVien sv3 = new SinhVien("Barrack Obama", 69, "12c1", 8);
		SinhVien sv4 = new SinhVien("Donal Trump", 70, "12c1", 8);
		SinhVien sv5 = new SinhVien("Joe Biden", 80, "12c2", 7.5);
		
		SinhVien[] a_sv = new SinhVien[] {sv1,sv2,sv3,sv4,sv5};
//		Ham Arrays.sort		
		Arrays.sort(a_sv);
		for (int i = 0; i < a_sv.length; i++) {
			System.out.println("Sinh vien "+(i+1)+" : ");
			a_sv[i].disSinhVien();
			System.out.println();
		}
		
//		Ham Arrays.binarysearch
		System.out.println("Tim kiem Biden: "+ (	Arrays.binarySearch(a_sv, sv5)+1));
	}
	

	

	

	
}
