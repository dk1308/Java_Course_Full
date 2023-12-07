import java.util.Scanner;

public class StringFunction {
	public static void main(String[] args) {
		System.out.println("Nhập 1 chuỗi ");
		Scanner sc =new Scanner(System.in);
		String s;
		s=sc.nextLine();
		
//		Hàm length => Lấy độ dài của chuỗi
		System.out.println("---Length---");
		System.out.println("Length = "+ s.length());
		int doDai = s.length();
		System.out.println();
		
//		Hàm charAt() => Lấy kí tự tại 1 vị trí
		System.out.println("---charAt()---");
		for (int i = 0; i < doDai; i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println();
		
//		Hàm getChar() => Lấy ra 1 đoạn chuỗi và lưu vào 1 mảng
//		getChar(Vị trí đầu, Vị trí cuối, Mảng lưu trữ, Vị trí bắt đầu lưu của Mảng)
		System.out.println("---getChar()---");
		char [] saveArr = new char[10];
		s.getChars(3, 5, saveArr, 0);
		for (int i = 0; i < saveArr.length; i++) {
			System.out.println("saveArr["+i+"] = "+ saveArr[i]);
		}
		System.out.println();
		
//		Hàm getBytes() => Lấy ra kí tự của chuỗi và chuyển thành số thập phân
		System.out.println("---getBytes()---");
		byte [] byteArr = s.getBytes();
		for (byte b : byteArr) {
			System.out.println(b);
		}
		System.out.println();
		
		
	}
}
