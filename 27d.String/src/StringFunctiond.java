
public class StringFunctiond {
	public static void main(String[] args) {
		String str1 = "Mình là ";
		String str2 = "Đăng Khoa"; 
//		Hàm concat() -> nối 2 chuỗi lại
		System.out.println("---concat()---");
		String str3 = str1.concat(str2);
		System.out.println("str3 = str1 + str2 = "+str3);
		System.out.println();
//		Hàm replaceAll() -> thay thế 1 đoạn chuỗi ở chuỗi gốc
		System.out.println("---replaceAll()---");
		String str4 = str2.replaceAll("Đăng", "Nguyễn Văn Đăng");
		System.out.println("str4 = "+str4);
		System.out.println();
//		Hàm toLowerCase() và toUpperCase() -> Biến đổi thành chữ thường, chữ hoa
		System.out.println("---toLowerCase|toUpperCase---");
		System.out.println("str1.toLowerCase() = "+str1.toLowerCase());
		System.out.println("str2.toUpperCase() = "+str2.toUpperCase());
		System.out.println();
//		Hàm trim() -> xóa khoảng trắng thừa ở đầu và cuối
		System.out.println("---trim()---");
		String str5 = "  hehehe   ";
		System.out.println("str5.trim() = "+str5.trim());
		System.out.println();
//		Hàm subTring() -> cắt 1 chuỗi sang 1 chuỗi con
		System.out.println("---subString---");
		String str6 = str2.substring(0, 4);
		System.out.println("str6 = "+str6);
}
}
