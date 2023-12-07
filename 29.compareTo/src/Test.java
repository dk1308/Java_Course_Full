
public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(1, "Nguyễn Văn Đăng Khoa", 19);
		SinhVien sv2 = new SinhVien(2, "Lê Hoàng Như", 19);
		SinhVien sv3 = new SinhVien(3, "Võ Huy Z", 19);
		
		System.out.println("sv1 compareTo sv2: "+ sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: "+ sv1.compareTo(sv3));
	}
}
