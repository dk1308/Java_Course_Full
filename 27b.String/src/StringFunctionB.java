
public class StringFunctionB {
	public static void main(String[] args) {
		String sv1 = "Nguyễn Văn A";
		String sv2 = "Nguyễn Văn A";
		String sv3 = "nguyễn Văn a";
		String sv4 = "Nguyễn Văn B";
		String sv5 = "Trần Văn A";
//		Hàm equals
//		So sánh bằng
		System.out.println("---equals()---");
		System.out.println("sv1 equals sv2: "+ sv1.equals(sv2));
		System.out.println("sv1 equals sv3: "+ sv1.equals(sv3));
		System.out.println();
//		Hàm equalsIgnoreCase
//		So sánh bằng không phân biệt hoa, thường
		System.out.println("---equalsIgnoreCase()---");
		System.out.println("sv1 equalsIgnoreCase sv2: "+ sv1.equalsIgnoreCase(sv2));
		System.out.println("sv1 equalsIgnoreCase sv3: "+ sv1.equalsIgnoreCase(sv3));
		System.out.println();
//		Hàm compateTo
//		So sánh <,> và =
		System.out.println("---compareTo()---");
		System.out.println("sv1 compareTo sv2 "+ sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3 "+ sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv4 "+ sv1.compareTo(sv4));
		System.out.println();
//		Hàm compateToIgnoreCase
//		So sánh <,> và = không phân biệt hoa, thường
		System.out.println("---compareToIgnoreCase()---");
		System.out.println("sv1 compareToIgnoreCase sv2 "+ sv1.compareToIgnoreCase(sv2));
		System.out.println("sv1 compareToIgnoreCase sv3 "+ sv1.compareToIgnoreCase(sv3));
		System.out.println("sv1 compareToIgnoreCase sv4 "+ sv1.compareToIgnoreCase(sv4));
		System.out.println();
//		Hàm regionMatches
//		So sánh 1 đoạn của chuỗi này với 1 đoạn của chuỗi kia
//		regionMatches( idx đầu str1, str2, idx đầu str2, số kí tự ss)
		System.out.println("---regionMatches()---");
		System.out.println("sv1 regionMatches sv4: 0->8: "+ sv1.regionMatches(0, sv4, 0, 9));
		System.out.println("sv1 regionMatches sv4: 7->11: "+ sv1.regionMatches(7, sv4, 7, 5));
		
		System.out.println("sv1 regionMatches sv3: 0->11(ignoreCase): "+sv1.regionMatches(true, 0, sv3, 0, 12));
		System.out.println("sv1 regionMatches sv3: 0->11(notIgnoreCase): "+ sv1.regionMatches(0, sv3, 0, 12));
		System.out.println();
//		Hàm startsWith
//		Kiểm tra chuỗi bắt đầu bằng gì
		System.out.println("---startsWith---");
		if(sv1.startsWith("Nguyễn")==true)
			System.out.println("sv1 họ Nguyễn");
		else if (sv1.startsWith("Trần")!= false) {
			System.out.println("sv1 họ Trần");
		}
		if(sv5.startsWith("Nguyễn")==true)
			System.out.println("sv5 họ Nguyễn");
		else if (sv5.startsWith("Trần")!= false) {
			System.out.println("sv5 họ Trần");
		}
		System.out.println();
//		Hàm endsWith
//		Kiểm tra chuỗi kết thúc bằng gì
		System.out.println("---endsWith---");
		if(sv1.endsWith("A"))
			System.out.println("sv1 tên A");
		else if (sv1.endsWith("B")) {
			System.out.println("sv1 tên B");
		}
		if(sv4.endsWith("A"))
			System.out.println("sv4 tên A");
		else if (sv4.endsWith("B")) {
			System.out.println("sv4 tên B");
		}
		
		
		
	}
}
